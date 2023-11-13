
import java.util.ArrayList;


public class Hold {
    private int maxCargoWeight;
    private ArrayList<Suitcase> cargo;
    
    public Hold(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
        this.cargo = new ArrayList<>();
    }
    
    public int totalSuitcaseWeight() {
        int total = 0;
        for (Suitcase suitcase: this.cargo) {
            total += suitcase.totalWeight();
        }
        return total;
    }
        
   //if total suitcase weight < max cargo weight, add suitcase into cargo
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalSuitcaseWeight() + suitcase.totalWeight() < this.maxCargoWeight) {
            this.cargo.add(suitcase);
        }
        
    }
    
    public String toString() {
        return cargo.size() + " suitcases (" + totalSuitcaseWeight() + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase: this.cargo) {
            suitcase.printItems();
        }
    }
    
}
