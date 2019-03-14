import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])));
        String line = null;
        StringBuilder expression = new StringBuilder();

        while((line = reader.readLine()) != null){
            expression.append(line);
            expression.append('\r');
            expression.append('\n');
        }

        reader.close();

        ANTLRInputStream inputStream = new ANTLRInputStream(expression.toString());
        bcLexer lexer = new bcLexer(inputStream);
        bcParser parser = new bcParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.bc();

        if(parser.getNumberOfSyntaxErrors() == 0 ){
            Visitor visitor = new Visitor();
            visitor.visit(tree);
        }
    }
}
