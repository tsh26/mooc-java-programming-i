
import java.util.ArrayList;


public class TodoList {
    //instant variable
    private ArrayList<String> toDo;
    
    //constructors
    public TodoList() {
        this.toDo = new ArrayList<>();        
    }
    
    public void add(String task) {
        this.toDo.add(task);
    }
            
    public void print() {
        for (String task: toDo) {
            System.out.println((toDo.indexOf(task)+1) + ": " + task);
        }        
    }
    
    public void remove(int number) {
        this.toDo.remove(number-1);
    }
    
    
}
