
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication Year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            bookList.add(new Book(title, pages, publicationYear));
        }
        
        System.out.println("What information will be printed?");
        String info = scanner.nextLine();
        
        
        for (Book item : bookList) {
            if (info.equals("everything")) {
                System.out.println(item);
            }
            if (info.equals("name")) {
                System.out.println(item.getTitle());
            }
        }

    }
}
