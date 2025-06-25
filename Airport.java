import java.util.*;

// Airport that manages a list of Airlines
public class Airport {
    private List<Airline> airlines = new ArrayList<>();
    
    //Add an airline to the list
    public void addAirline(Airline airline) {
        airlines.add(airline);
    }

    // Create an iterator for the list of airlines
    public Iterator createIterator() {
        return new Iterator(airlines);
    }
}
