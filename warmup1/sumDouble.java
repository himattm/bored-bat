/**
* Given two int values, return their sum. 
* Unless the two values are the same, then return double their sum. 
*/

public int sumDouble(int a, int b) {
	boolean equal = a == b; // Checks if the values are equal

	String equalString = equal + ""; // makes the boolean a String

	int num = equalString.indexOf("t") + 2; // Checks to see if the boolean contains "t"
						// If it doenst it returns -1
						// If it does returns 0 (the index of t)
						// Increments by 2 to get 1 for false equals and 2 for true equals

	return (a + b) * num;
}
