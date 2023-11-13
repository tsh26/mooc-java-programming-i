import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> suitcase;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.suitcase = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public int totalWeight() {
        int total = 0;
        for (Item item:this.suitcase) {
            total += item.getWeight();
        }
        return total;
    }
    
    public void addItem(Item item) {
        if (!(this.totalWeight() + item.getWeight() > this.maxWeight)) {
            this.suitcase.add(item);
        }
    }
    
    public void printItems() {
        String items = "";
        for (Item item:this.suitcase) {
            items = items + item.toString() + "\n";
        }
        System.out.print(items);
           
    }
    
    public Item heaviestItem() {
        if (this.suitcase.isEmpty()) {
            return null;
        }
        Item heaviest = new Item ("", 0);
        for (Item item:this.suitcase) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
    
    
    @Override
    public String toString() {
        if (suitcase.isEmpty()) {
            return "no items (" + totalWeight() + " kg)";
        }
        if (suitcase.size()==1) {
            return suitcase.size() + " item (" + totalWeight() + " kg)";
        }
        
        return suitcase.size() + " items (" + totalWeight() + " kg)";
    }
}
