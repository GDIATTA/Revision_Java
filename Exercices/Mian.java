package Exercices;
import java.util.ArrayList;

public class Mian {
    static void affich(String name, int age){
        System.out.println(name + " a "+ age+ " ans.");
    }
    static double volume(double Rayon, double hauteur){
        double vol1= (Math.pow(Rayon, 2)*hauteur*(Math.PI))/3;
        return vol1;

    }
    static void affich1(){
        String[] vec1={"Luka","27","marié"};
        System.out.println("Je m'appelle " +vec1[0]+ ", j'ai "
        +vec1[1]+ " ans et je suis " +vec1[2]);
    }
    static void affich2(){
        String[][] vec2={{"1230","ALLON","LEVY","13","Bien"},
        {"1230","ALLON","LEVY","13","Bien"},
        {"1230","ALLON","GAUSS","13","Bien"}};
        System.out.println(vec2[2][2]);
    }
    public static void main(String[] args) {
        System.out.println(volume(2, 3));
        affich1();
        affich2();
        
    }
}
