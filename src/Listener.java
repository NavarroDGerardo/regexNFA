public class Listener extends  ExprBaseListener{
    @Override
    public void exitGroup(ExprParser.GroupContext ctx) {
        System.out.println("Grupo de los elementos");
        System.out.println(ctx.getText());
    }

    @Override
    public void exitConcatenation(ExprParser.ConcatenationContext ctx) {
        System.out.println("concatenation de los elementos");
        System.out.println(ctx.getChild(0).getText());
        System.out.println(ctx.getChild(1).getText());
    }

    @Override
    public void exitStar(ExprParser.StarContext ctx) {
        System.out.println("Star elements");
        System.out.println(ctx.getText());
    }

    @Override
    public void exitChara(ExprParser.CharaContext ctx) {
        System.out.println("Chara character");
        System.out.println(ctx.getText());
    }

    @Override
    public void exitUnion(ExprParser.UnionContext ctx) {
        System.out.println("Union character");
        System.out.println(ctx.getText());
    }
}
