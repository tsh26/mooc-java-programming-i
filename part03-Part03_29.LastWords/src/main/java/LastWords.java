
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            if (text.isEmpty()) {
                break;
            }
            String[] pieces = text.split(" ");
            int num = pieces.length-1;
            System.out.println(pieces[num]);
        }
    }
}
