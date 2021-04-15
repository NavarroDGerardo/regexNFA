import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args)  {
        try {
            CharStream input = CharStreams.fromStream(System.in);
            ExprLexer lexer = new ExprLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ExprParser parser = new ExprParser(tokens);
            ParseTree tree = parser.re();

            ParseTreeWalker parseWalker = new ParseTreeWalker();
            Listener listener = new Listener();
            parseWalker.walk(listener, tree);

            ArrayList<Node> list = listener.getNodes().pop();
            NFA nfa = listener.getNfa();
            int statesCounter = 0;


            for(Node n : list){
                statesCounter++;
                HashMap<Character, Set<Integer>> transitions = new HashMap<>();
                Character[] ar = n.getPaths().keySet().toArray(new Character[0]);
                for(Character c : ar){
                    Set<Integer> set = new HashSet<>();
                    for(Integer i : n.getPaths().get(c)){
                        set.add(i);
                    }
                    transitions.put(c, set);
                }

                nfa.getAllStates().put(n.getIdentifier(), transitions);
            }

            nfa.setSts(statesCounter);

            System.out.println(nfa);
        }catch(Exception e) {
            System.out.println("Error");
        }
    }
}
