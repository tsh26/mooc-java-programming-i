
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UserInterface {
    
    private GradeRegister register;
    private Scanner scanner;
    
    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }
    
    public void start() {
        //call out other methods
        readMarks();
        printAverage();
        printPassingAverage();
        printPassPercentage();
        printGradeDistribution();
    }
    
    public void readMarks() {
        System.out.println("Enter points totals, -1 stops: ");
        
        while (true) {            
            int marks = Integer.valueOf(scanner.nextLine());
            
            if (marks == -1) {
                break;
            }
            if (marks < 0 || marks > 100) {
                continue;
            }            
            this.register.addMarks(marks);         
            
        }
        System.out.println(register);
    }
    
    public void printAverage() {
        System.out.println("Point average (all): " + register.averageMarks());
    }
    
    public void printPassingAverage() {

        String nonePassing = "-";

        if (register.averagePassingMarks() == 0.00) {
            System.out.println("Point average (passing): " + nonePassing);
        } else {
            System.out.println("Point average (passing): " + register.averagePassingMarks());
        }
    }
    
    public void printPassPercentage() {
        System.out.println("Pass percentage: " + register.passPercentage());
    }
    
    
    public void printGradeDistribution() {
        System.out.println("Grade Distribution: ");
        
        int grade = 5;
        
        while (grade >= 0) {
            int stars = register.totalGradesFromPoints(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");
            
            grade--;
            
        }
        
    }
    
    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
    
    
}