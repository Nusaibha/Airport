Description: This Java project models a simple airport management system using object-oriented principles. The program manages a list of airlines across multiple terminals (A, B, and C) and demonstrates the use of a custom iterator to traverse through the list of airlines in each terminal. It also includes unit tests to verify the correct behavior of the iterator and list handling functionality. The program uses classes such as Airport, Airline, and a custom Iterator to simulate airline storage and retrieval. Airlines are added to terminals, and each terminal can create its own iterator to print the airlines in sequence. The main method also includes two basic unit tests to confirm the functionality of the iterator with both a populated and empty list.

Main.java: The Main class is the entry point of the program. It initializes three terminals (A, B, C), adds various airlines to them, and then prints out the list of airlines in the order they appear in each terminal. It also runs two unit tests: one to verify the iterator retrieves the correct airline from a non-empty list, and another to verify that iteration over an empty list behaves as expected.

Airport.java: The Airport class manages a list of Airline objects using a List<Airline> internally. It provides two main methods: addAirline() to add an airline to the terminal, and createIterator() to return a custom iterator for the airline list.

Airline.java: The Airline class represents a single airline with a name attribute. It includes a constructor to initialize the name and a getter method getName() to retrieve it. This class encapsulates the identity of each airline.

Iterator.java: This custom Iterator class allows traversal through the list of airlines. It maintains a current position and provides two key methods: hasNext() to check if there are more airlines left to iterate over, and next() to retrieve the next airline in the list. This mimics the behavior of Java’s built-in Iterator interface in a simplified, educational way.

Unit tests: 
1) Iterator Functionality: Verifies that the iterator returns the correct airline from a list with one airline.
2) Empty List Handling: Confirms that the iterator behaves correctly when no airlines are present.
