package Exercices;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Entrer un nombre entier nb1 :");
        int nb1 = myObj.nextInt();
        System.out.print("Entrer un nombre entier nb2 :");
        int nb2 = myObj.nextInt();
        System.out.print("Entrer un nombre entier nb3 :");
        int nb3 = myObj.nextInt();
        if (nb1>nb2 && nb1>nb3){
            System.out.println(nb1);
        }
        else if (nb2>nb1 && nb2>nb3){
            System.out.println(nb2);
        }
        else{
            System.out.println(nb3);

        }

    }
}
