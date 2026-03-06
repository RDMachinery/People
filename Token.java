/**
 * Token types used by the scanner
 *
 * @author Mario Gianota (mariogianota@protonmail.com) 2 March 2026
 */
public class Token {

    public static final int NAME = 0;
    public static final int AGE = 1;
    public static final int EOF = 2;
    public static final int UNDEFINED = 3;
    public static final int NEWLINE = 4;
    public static final int SPACE = 5;

    public int c;
    public int type;
    
    public int getChar() {
        return c;
    }

    public int getType() {
        return type;
    }

    public Token getToken(int type) {
        Token t = new Token();
        t.c = c;
        t.type = type;
        return t;
    }
}
