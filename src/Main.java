import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)  {
        try {
            CharStream input = CharStreams.fromStream(System.in);
            ExprLexer lexer = new ExprLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ExprParser parser = new ExprParser(tokens);
            ParseTree tree = parser.re();
            System.out.println(tree.toStringTree(parser));

            ParseTreeWalker parseWalker = new ParseTreeWalker();
            Listener listener = new Listener();
            parseWalker.walk(listener, tree);

            ArrayList<Node> list = listener.getNodes().pop();
            for (Node n : list)
                System.out.println(n);

        }catch(Exception e) {
            System.out.println("Error");
        }
    }
}
