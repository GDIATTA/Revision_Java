package Exercice1;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        /*Créez un programme Python qui crée et initialise un tableau,
         puis supprimez un élément de ce tableau à la position spécifiée
        (de 0 à N-1).Pour supprimer un élément du tableau, déplacez les
         éléments juste après la position donnée vers une position à 
        gauche et réduisez la taille du tableau. */
        int nbelt = 0;
        //int elt =0;
        int pos =0;
        Scanner myObj = new Scanner(System.in);
        boolean validInput = false;
        while (!validInput) {
            try{
                System.out.print("Entrer le nb elt : ");
                nbelt = myObj.nextInt();
                //System.out.print("Entrer l'elt : ");
                //elt = myObj.nextInt();
                System.out.print("Entrer la position : ");
                pos = myObj.nextInt();
                validInput=true;
            }catch(java.util.InputMismatchException e){
                System.out.println("Entrer un nbr entier valid:");
                myObj.next();
            }
            
        }
        int[] tab = new int[nbelt];
        for (int i=0; i< nbelt; i++){
            validInput = false;
            while(!validInput){
                try{
                    System.out.println("Entrer un elt i : ");
                    tab[i]=myObj.nextInt();
                    validInput = true;
                }catch(java.util.InputMismatchException e){
                    System.out.println("Entrer un entier valid!");
                    myObj.next();
                }
            }
        }
        for(int i=pos; i<nbelt-1;i++){
            tab[i]=tab[i+1];
        }
        for(int i=0; i<nbelt-1;i++){
            System.out.println(tab[i]);
        }


        
        
        /*Écrire un programme Python pour déclarer un tableau,
         puis saisir ses éléments à partir de l'utilisateur et
          rechercher les éléments maximum et minimum dans le tableau.
        
        Scanner myObj = new Scanner(System.in);  
        int nbelt = 0;
        boolean validInput = false;
        while(!validInput){
            try{
                System.out.print("Entrer le nb elt : ");
                nbelt = myObj.nextInt();
                validInput = true;
            }catch(java.util.InputMismatchException e){
                System.out.println("Entrer un nb entier valid!");
                myObj.next();
            }
        }
        int[] tab = new int[nbelt];
        for (int i =0; i< nbelt; i++){
            validInput = false;
            while(!validInput){
                try{
                    System.out.print("Entrer un elt i : ");
                    tab[i]=myObj.nextInt();
                    validInput =true;
                }catch(java.util.InputMismatchException e){
                    System.out.println("Entrer un nbr entier valid!");
                    myObj.next();
                }
            }
            
        }
        int max = tab[0];
        int min = tab[0];

        for (int i=1; i<nbelt; i++){
            if(min > tab[i]){
                min = tab[i];
            }
            else if(max < tab[i]){
                max = tab[i];
            }

        }
        System.out.println(min);
        System.out.println(max);
        */

        /*Écrivez un programme Python pour déclarer et initialiser un tableau,
         puis saisissez ses éléments à partir de l'utilisateur et affichez le tableau. 
        Scanner myObj = new Scanner(System.in);
        int nb = 0;
        boolean validInput = false;
        while (!validInput) {
            try{
                System.out.print("Entrer le nombre d'élements : ");
                nb = myObj.nextInt();
                validInput = true;
            } catch(java.util.InputMismatchException e){
                System.out.println("Veuiller entrer un nombre entier");
                myObj.next();
            }
        }
        String[] tab = new String[nb];

        for(int i =0; i< nb; i++){
            System.out.print("Entrer un élément :");
            tab[i]= myObj.nextLine();
        }
        for(int i =0; i< nb; i++){
            System.out.println(tab[i]);
        }
        myObj.close(); // Close the scanner to prevent resource leaks
        */
        }
        
    }
        
