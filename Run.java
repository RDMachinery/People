/**
 * Runs the application
 *
 * @author Mario Gianota (mariogianota@protonmail.com) 2 March 2026
 */
import java.io.*;

public class Run {
    
    public Run() { }

    public static void main(String[] args) {
        if( args.length != 1 ) {
            System.err.println("Usage: java Run <filename>");
            System.exit(-1);
        }
        FileInputStream in = null;
        try {
            in = new FileInputStream( (new File(args[0])));
        } catch( IOException ioe )  {
            System.err.println("IOException: " + ioe.getMessage());
            System.exit(-2);
        }
        try {
            Scanner scanner = new Scanner(in);
            Parser parser = new Parser();
            Person person = null;

            person = parser.parse(scanner);
            
        } catch(IOException ioe2) {
            System.err.println("IOException: "+ ioe2.getMessage());
            System.exit(-3);
        }        
    }
}
            
