
public class Item {
    //instant variables
    private String name;
    private int weight;
    
    //constructor
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
 
    @Override
    public String toString() {
        return name + "(" + weight + " kg)";
    }

}
