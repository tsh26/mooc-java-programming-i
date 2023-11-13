
import java.util.Scanner;

public class UserInterface {
    
    private JokeManager jokeManager;
    private Scanner scanner;
    
    // 2 parameters = instance of JokeManager class and Scanner class
    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }
    
    public void start() {
        System.out.println("What a joke!");
        
        while (true) {
            System.out.println("Commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                jokeManager.addJoke(joke);
            }
            else if (command.equals("2")) {
                String drawnJoke = jokeManager.drawJoke();
                // REMEMBER TO PRINT YOUR JOKEEEEEE!!!
                System.out.println(drawnJoke);
            }
            else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                jokeManager.printJokes();
            }
        }

    }

}
