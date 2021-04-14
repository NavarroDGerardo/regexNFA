import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Listener extends  ExprBaseListener{
    Stack<ArrayList<Node>> nodes = new Stack<>();

    public Stack<ArrayList<Node>> getNodes() {
        return nodes;
    }

    @Override
    public void exitGroup(ExprParser.GroupContext ctx) {
        System.out.println("Grupo de los elementos");
        System.out.println(ctx.getText());
    }

    @Override
    public void exitConcatenation(ExprParser.ConcatenationContext ctx) {
        ArrayList<Node> right = nodes.pop();
        ArrayList<Node> left = nodes.pop();
        int leftSize = left.size();
        left.remove(left.size() - 1);

        for(Node n : right){
            int id = n.getIdentifier() + leftSize - 1;
            n.setIdentifier(id);
            Character[] ar = n.getPaths().keySet().toArray(new Character[0]);
            for(Character c : ar){
                List<Integer> newList = new ArrayList<>();
                for(Integer i : n.getPaths().get(c)){
                    newList.add(i + leftSize - 1);
                }
                n.getPaths().put(c, newList);
            }
            left.add(n);
        }

        nodes.add(left);
    }

    @Override
    public void exitStar(ExprParser.StarContext ctx) {
        ArrayList<Node> block = new ArrayList<>();
        ArrayList<Node> nodeList = nodes.pop();

        int lastIdNode = nodeList.size() + 1;

        HashMap<Character, List<Integer>> startHashmap = new HashMap<>();
        List<Integer> listStart = new ArrayList<>();
        listStart.add(1);
        listStart.add(lastIdNode);
        startHashmap.put('ñ', listStart);
        Node start = new Node(0, startHashmap);
        block.add(start);

        for(Node n : nodeList){
            n.setIdentifier(n.getIdentifier() + 1);
            Character[] ar = n.getPaths().keySet().toArray(new Character[0]);
            for(Character c : ar){
                List<Integer> newList = new ArrayList<>();
                for(Integer i : n.getPaths().get(c)){
                    newList.add(i + 1);
                }
                n.getPaths().put(c, newList);
            }
            block.add(n);
        }
        List<Integer> directionNode = new ArrayList<>();
        directionNode.add(nodeList.get(0).getIdentifier());
        directionNode.add(lastIdNode);
        block.get(block.size() - 1).getPaths().put('ñ', directionNode);

        Node last = new Node(nodeList.size() + 1, new HashMap<>());
        block.add(last);
        nodes.push(block);
    }

    @Override
    public void exitChara(ExprParser.CharaContext ctx) {
        HashMap<Character, List<Integer>> hm = new HashMap<>();
        List<Integer> destiny = new ArrayList<>();
        destiny.add(1);
        hm.put(ctx.getText().charAt(0), destiny);
        Node n = new Node(0, hm);
        Node d = new Node(1, new HashMap<>());
        ArrayList<Node> newList = new ArrayList<>();
        newList.add(n);
        newList.add(d);
        nodes.push(newList);
    }

    @Override
    public void exitUnion(ExprParser.UnionContext ctx) {
        ArrayList<Node> block = new ArrayList<>();
        ArrayList<Node> rightUnion = nodes.pop();
        ArrayList<Node> leftUnion = nodes.pop();

        HashMap<Character, List<Integer>> hm = new HashMap<>();
        List<Integer> l = new ArrayList<>();
        l.add(leftUnion.get(0).getIdentifier()+1);
        l.add(leftUnion.size()+1);
        hm.put('ñ', l);
        Node start = new Node(0, hm);

        block.add(start);

        for(Node n : leftUnion){
            n.setIdentifier(n.getIdentifier() + 1);
            Character[] ar = n.getPaths().keySet().toArray(new Character[0]);
            for(Character c : ar){
                List<Integer> newList = new ArrayList<>();
                for(Integer i : n.getPaths().get(c)){
                    newList.add(i + 1);
                }
                n.getPaths().put(c, newList);
            }
            block.add(n);
        }


        for(Node n : rightUnion){
            int id = n.getIdentifier() + leftUnion.size() + 1;
            n.setIdentifier(id);
            Character[] ar = n.getPaths().keySet().toArray(new Character[0]);
            for(Character c : ar){
                List<Integer> newList = new ArrayList<>();
                for(Integer i : n.getPaths().get(c)){
                    newList.add(i + leftUnion.size() + 1);
                }
                n.getPaths().put(c, newList);
            }
            block.add(n);
        }
        int lastNodeId = leftUnion.size() + rightUnion.size() + 1;
        List<Integer> lastDirection = new ArrayList<>();
        lastDirection.add(lastNodeId);

        block.get(leftUnion.size()).getPaths().put('ñ', lastDirection);
        block.get(leftUnion.size() + rightUnion.size()).getPaths().put('ñ', lastDirection);

        Node last = new Node(lastNodeId, new HashMap<>());
        block.add(last);

        nodes.push(block);
    }
}
