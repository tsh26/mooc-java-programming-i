
import java.util.ArrayList;

public class Room {
    //instant variable
    private ArrayList<Person> room;
    
    //constructor
    public Room() {
        this.room = new ArrayList<>();        
    }
    
    public void add(Person person) {
        this.room.add(person);
    }
    
    public boolean isEmpty() {
        if (this.room.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return this.room;
    }
    
    public Person shortest() {
        if (this.room.isEmpty()) {
            return null;
        }
        Person shortest = new Person("", 300);
        for (Person person: this.room) {
            if(person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }            
        }
        return shortest;
    }
    
    public Person take() {
        if (this.room.isEmpty()) {
            return null;
        }
        Person taken = this.shortest();
        this.room.remove(this.shortest());
        
        return taken;
    }
}


