/**
 * Token scanner. Collects sequences of characters into tokens.
 *
 * @author Mario Gianota (mariogianota@protonmail.com) 2 March 2026
 */
import java.io.FileInputStream;
import java.io.IOException;

public class Scanner {
    private FileInputStream in;
    private int look;
    private StringBuffer buf;
    private Token token;

    public Scanner(FileInputStream in) throws IOException {
        this.in = in;
        buf = new StringBuffer();
        nextChar();
    }

    private void nextChar() throws IOException {
        look = in.read();
        System.out.print((char)look);
    }

    public Token nextToken() throws IOException {
        buf.setLength(0);
        token = new Token();

        if( look == ' ') {
            token = token.getToken(Token.SPACE);
            token.c = ' ';
            nextChar();
        } else if( Character.isAlphabetic(look) ) {
            buf.append((char)look);
            token = token.getToken(Token.NAME);
            token.c = look;
            nextChar();
            
        } else if( look == '\n' ) {
            token = token.getToken(Token.NEWLINE);
            token.c = '\n';
            nextChar();
        } else if( Character.isDigit(look) ) {
            buf.append((char)look);
            token = token.getToken(Token.AGE);
            token.c = look;
            nextChar();
        } else if( look == -1 ) {
            token = token.getToken(Token.EOF);
            token.c = -1;
        } else {
            token = token.getToken(Token.UNDEFINED);
            token.c = -2;
            nextChar();
        }
        return token;
    }

    public String getName() {
        return buf.toString();
    }
    public int getAge() {
        return Integer.parseInt(buf.toString());
    }
}
