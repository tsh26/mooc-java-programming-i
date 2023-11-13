
import java.util.ArrayList;

public class SimpleCollection {
    //intant variables
    private String name;
    private ArrayList<String> elements;
    
    //constructor
    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }
    
    //methods
    public void add(String element) {
        this.elements.add(element);
    }
    
    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }
        String longest = "";
        for (String element: this.elements) {
            if (element.length()>longest.length()) {
                longest = element;
            }
        }
        return longest;
    }

}
