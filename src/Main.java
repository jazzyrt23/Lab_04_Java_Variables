public class Main {
    public static void main(String[] args) {
        // --- Integer Variables ---
        int intOperandA = 10;
        int intOperandB = 5;
        int intSum = 0;
        int intProduct = 0;
        int intDifference = 0;
        int intQuotient = 0;
        int intModulo = 0;

        // Integer arithmetic
        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " + " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " * " + intOperandB + " is " + intProduct);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " + intOperandA + " - " + intOperandB + " is " + intDifference);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + intOperandA + " / " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The remainder using ints of " + intOperandA + " % " + intOperandB + " is " + intModulo);


        // --- Double Variables ---
        double doubleOperandA = 10.5;
        double doubleOperandB = 4.2;
        double doubleSum = 0.0;
        double doubleProduct = 0.0;
        double doubleDifference = 0.0;
        double doubleQuotient = 0.0;

        // Double arithmetic
        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " + " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " * " + doubleOperandB + " is " + doubleProduct);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " - " + doubleOperandB + " is " + doubleDifference);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles of " + doubleOperandA + " / " + doubleOperandB + " is " + doubleQuotient);


        // --- Custom Variables (Part 12) ---
        double myLunchCost = 12.50;
        int kidsInFamily = 6;
        boolean isRaining = false;
        double gasPrice = 3.85;
        int favoriteNumber = 23;
        double shoeSize = 10.5;
        int birthMonth = 4;
        String fullName = "Jasmine Thomas";

        System.out.println("The cost of my lunch is: " + myLunchCost);
        System.out.println("The number of kids in my family is: " + kidsInFamily);
        System.out.println("Is it raining? " + isRaining);
        System.out.println("The price of a gallon of gas is: " + gasPrice);
        System.out.println("My favorite number is: " + favoriteNumber);
        System.out.println("My shoe size is: " + shoeSize);
        System.out.println("My birth month is: " + birthMonth);
        System.out.println("My full name is: " + fullName);
    }
}
