
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();
        System.out.println("First: 0/100");
        System.out.println("Second: 0/100");

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            //if input = add 50, then [add, 50] where 
            // "add" is at index[0] and "50" is at index[1]
            String[] parts = input.split(" ");
            //assigns "add" to command
            String command = parts[0];
            // converts String 50 to integer and assign it to amount.
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                first.add(amount);
            }
            if (command.equals("move")) {
                if (first.contains() >= amount) {
                    first.remove(amount);
                    second.add(amount);
                } else {
                    second.add(first.contains());
                    first.remove(first.contains());
                }
            }
            if (command.equals("remove")) {
                second.remove(amount);
            }

            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());
        }
    }

}
