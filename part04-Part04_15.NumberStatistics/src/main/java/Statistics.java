
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        // initialize the variable numberCount here
        this.count = count;
        this.sum = sum;
    }

    public void addNumber(int number) {
        // write code here
        this.sum += number;
        this.count += 1;
    }

    public int getCount() {
        // write code here
        return this.count;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        if (this.sum != 0) {
            return (double) this.sum/this.count;
        }
        return 0;
    }
}

