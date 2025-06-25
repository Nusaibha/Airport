import java.util.*;

// Iterator for iterating over a list of Airlines
public class Iterator {
    private List<Airline> airlines;
    private int position = 0;

    // Constructor to initialize the list of airlines
    public Iterator(List<Airline> airlines) {
        this.airlines = airlines;
    }

    // Check if there are more airlines to iterate over
    public boolean hasNext() {
        return position < airlines.size();
    }

    // Get the next airline in the list
    public Airline next() {
        return airlines.get(position++);
    }
}
