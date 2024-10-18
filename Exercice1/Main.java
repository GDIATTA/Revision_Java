package Exercice1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int nb = 0;
        boolean validInput = false;

        // Loop until valid integers are provided
        while (!validInput) {
            try {
                System.out.print("Entrer nb : ");
                nb = myObj.nextInt();  // Accepting integer input
                validInput = true;  // Exit loop if both inputs are valid integers
            } catch (java.util.InputMismatchException e) {
                System.out.println("Veuillez entrer un nombre entier.");
                myObj.next();  // Clear the invalid input
            }
        }
        int prod =1;
        for(int i=nb; i>0; i--){
            prod = prod*i;
        }
        System.out.println(prod);
    }

    
}
