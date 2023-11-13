
import java.util.ArrayList;


public class GradeRegister {

    private ArrayList<Integer> marks;
    private ArrayList<Integer> passingMarks;
    private ArrayList<Integer> grades;

    public GradeRegister() {
        this.marks = new ArrayList<>();
        this.passingMarks = new ArrayList<>();
        this.grades = new ArrayList<>();
        
    }    
    
    //methods
    public void addMarks(int marks) {
        this.marks.add(marks);
        
        if (marks >= 50){
            this.passingMarks.add(marks);
        }
        int grade = pointsToGrade(marks);
        this.grades.add(grade);
    }    
    
    
    public double averageMarks() {
        int total = 0;
        
        for (int mark: this.marks) {
            total += mark;
            
        }
        return (double)total/this.marks.size();
    }

    public double averagePassingMarks() {
        int totalPassing = 0;
        
        if (passingMarks.isEmpty()) {
            return 0.00;
        } else {
        for (int mark: this.passingMarks) {
            totalPassing += mark;

        }        
        return 1.0 * (double)totalPassing/ this.passingMarks.size();
        }
    }
    
    
    public double passPercentage() {        
        return 100 * ((double)this.passingMarks.size()/this.marks.size());
    }
    
    
    public static int pointsToGrade(int marks) {
        int grade = 0;        
        if (marks < 50) {
            grade = 0;
        } else if (marks < 60) {
            grade = 1;
        } else if (marks < 70) {
            grade = 2;
        } else if (marks < 80) {
            grade = 3;
        } else if (marks < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        
        return grade;
    }

    //Method to return the total of a given grade for the whole class
    public int totalGradesFromPoints(int grade) {
        int total = 0;
        for (int received: this.grades) {
            if (received == grade) {
                total++;
            }
        }
        return total;
        
    }
    
    @Override
    public String toString() {
        return "GradeRegister{" + "marks=" + marks + ", passingMarks=" + passingMarks + '}';
    }
        
}
    
    
    
 

