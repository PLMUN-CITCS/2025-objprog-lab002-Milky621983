public class VariableExample {
    public static void main(String[] args) {
        // Declaring variables with different native data types
        int studentAge = 15;                 // Integer type
        double itemPrice = 29.99;            // Decimal type
        String studentName = "Alice";        // String type
        int counter = 10;                    // Integer type
        
        // Demonstrating case-sensitivity
        int Counter = 20;                    // Another integer type, different due to case sensitivity
        
        // Printing the values
        System.out.println("Student Age: " + studentAge);
        System.out.println("Item Price: $" + itemPrice);
        System.out.println("Student Name: " + studentName);
        System.out.println("Counter: " + counter);
        System.out.println("Counter (Different Case): " + Counter);
    }
}
