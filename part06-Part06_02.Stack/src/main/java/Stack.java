
import java.util.ArrayList;

//class
public class Stack {
    
    //instance variable
    private ArrayList<String> list;
    
    //constructor for making object (in main)
    public Stack() {
        this.list = new ArrayList<>();
    }
    //methods
    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public String take() {
        int topMostIndex = list.size()-1;
        String topMost = this.list.get(topMostIndex);
        this.list.remove(topMostIndex);
        return topMost;
    }
    
    
    public void add(String value) {
        this.list.add(value);
    }
    
    public ArrayList<String> values() {
        return list;
        
    }
    
    
}
