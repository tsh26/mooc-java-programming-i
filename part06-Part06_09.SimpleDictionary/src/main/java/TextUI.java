
import java.util.Scanner;

public class TextUI {

    //instant variables
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    //constructors
    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    //method
    public void start() {

        while (true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (input.equals("add")){
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                simpleDictionary.add(word,translation);
            } else if (input.equals("search")) {
                System.out.println("To be translated: ");
                String translated = scanner.nextLine();
                System.out.println("Translation:");
                String returnTranslation = simpleDictionary.translate(translated);
                if (returnTranslation == null) {
                    System.out.println("Word " +translated+ " was not found");
                } else {
                System.out.println(returnTranslation);
                } 
            }
            else {                           
            System.out.println("Unknown command");
            }
        }
    }
}
