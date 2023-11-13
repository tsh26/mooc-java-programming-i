import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList toDo;
    
    //constructor with 2 Parameters (instance of class TodoList and instance of class Scanner)
    public UserInterface(TodoList toDo, Scanner scanner) {
        this.toDo = toDo;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            else if (command.equals("add")) {
                System.out.println("To add: ");
                String toAdd = scanner.nextLine();
                toDo.add(toAdd);
            }
            else if (command.equals("list")) {
                toDo.print();
            }
            else if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int toRemove = Integer.valueOf(scanner.nextLine());
                toDo.remove(toRemove);
            }
        }
    }   
    
}
