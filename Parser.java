/**
 * The Parser class reads a stream of Token objects from the Scanner and creates
 * a Person object.
 *
 * @author Mario Gianota (mariogianota@protonmail.com) 2 March 2026
 */
import java.io.IOException;

public class Parser {

    private Scanner scanner;
    private Token look;
    private Person person;

    public Parser() { }

    public Person parse(Scanner scanner) {
        this.scanner = scanner;
        try {

            look = scanner.nextToken();
            while( true ) {
                if( look.type == Token.EOF) {

                    break;
                }
            }

        }catch(IOException ioe) {
            System.err.println("Parse exception: "+ ioe.getMessage() );
            System.exit(-5);
        }
        return person;
    }
    
}

