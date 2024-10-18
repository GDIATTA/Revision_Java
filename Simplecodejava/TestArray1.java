package Simplecodejava;

public class TestArray1 {
    public static void main(String[] args){
        int [] vec = {0};
        String [][] vec1={{"Ananas", "Banana", "Orange"},{"Pomme","Mangue","Mandarin"}};
        vec1[0][0]="Raisin";
        for(int i=0; i<2;i++){
            for(int j=0; j<vec1[1].length;j++){
                System.out.println(vec1[i][j]);
            }
            }
        System.out.println(vec[0]);
        
    }
}
