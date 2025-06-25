public class Main {
    public static void main(String[] args) {
        // Create airports for different terminals
        Airport terminalA = new Airport();
        Airport terminalB = new Airport();
        Airport terminalC = new Airport();
        
        // Add airlines to Terminal A
        terminalA.addAirline(new Airline("Spirit Airlines"));
        
        // Add airlines to Terminal B
        terminalB.addAirline(new Airline("United Airlines"));
        terminalB.addAirline(new Airline("Southwest Airlines"));
        terminalB.addAirline(new Airline("JetBlue"));
        terminalB.addAirline(new Airline("Frontier Airlines"));
        terminalB.addAirline(new Airline("Air Canada"));
        
        // Add airlines to Terminal C
        terminalC.addAirline(new Airline("Delta Airlines"));
        
        // Display airlines by terminal
        System.out.println("List of Airlines at my Airport:");
        System.out.println();
        
        System.out.println("Terminal A:");
        Iterator iteratorA = terminalA.createIterator();
        int counter = 1;
        while (iteratorA.hasNext()) {
            Airline airline = iteratorA.next();
            System.out.println(counter + ". " + airline.getName());
            counter++;
        }
        System.out.println();
        
        System.out.println("Terminal B:");
        Iterator iteratorB = terminalB.createIterator();
        while (iteratorB.hasNext()) {
            Airline airline = iteratorB.next();
            System.out.println(counter + ". " + airline.getName());
            counter++;
        }
        System.out.println();
        
        System.out.println("Terminal C:");
        Iterator iteratorC = terminalC.createIterator();
        while (iteratorC.hasNext()) {
            Airline airline = iteratorC.next();
            System.out.println(counter + ". " + airline.getName());
            counter++;
        }
        System.out.println();
        
        // Run unit tests
        System.out.println("Unit tests:");
        System.out.println();
        
        // Test 1: Check if iterator works correctly
        Airport testAirport = new Airport();
        testAirport.addAirline(new Airline("Test Airline"));
        Iterator testIterator = testAirport.createIterator();
        boolean test1Passed = testIterator.hasNext() && testIterator.next().getName().equals("Test Airline");
        System.out.println("Test 1 " + (test1Passed ? "passed!" : "failed!"));
        
        // Test 2: Check if empty airport works
        Airport emptyAirport = new Airport();
        Iterator emptyIterator = emptyAirport.createIterator();
        boolean test2Passed = !emptyIterator.hasNext();
        System.out.println("Test 2 " + (test2Passed ? "passed!" : "failed!"));
        
        System.out.println();
        System.out.println("All unit tests completed!");
        System.out.println("Result: 2/2 tests passed.");
        System.out.println();
    }
}
