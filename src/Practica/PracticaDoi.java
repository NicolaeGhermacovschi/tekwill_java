package Practica;

public class PracticaDoi {
    public void ex1(){
        System.out.println("====LAB 2====\nEx1");
        System.out.println("Hello Java World!");
    }

    public void ex2Variables(){
        long worldPopulation = 7811080815L;
        int carsProducedThisYear = 55235358;
        char firstLetterInAlphabet = 'A';
        boolean javaIsAmazing = true;
        final double pi = 3.14159;

        System.out.println("Ex2\nWorld Population :" + worldPopulation
                            +"\nCars Produced This Year :" +carsProducedThisYear
                            +"\nFirst Letter In Alphabet :" + firstLetterInAlphabet
                            +"\nJava Is Amazing :" + javaIsAmazing
                            +"\nPi :" + pi);
    }

    public void ex3TaxCalculator() {
        double price = 3.15;
        double tax = 6.15;
        int quantity = 15;
        double total = 0;
        String message = "I want to buy " + quantity + " shirt!";

        System.out.println("EX3\n" + message);
        total = price * quantity * tax;

        System.out.println("Total cost with tax is: " + total);
    }
}

