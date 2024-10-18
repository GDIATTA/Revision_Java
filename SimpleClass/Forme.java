package SimpleClass;

public class Forme {
    int largeur =0;
    int hauteur = 0;
    public Forme(int larg, int haut){
        this.largeur = larg;
        this.hauteur = haut;
    }
}
class Rectangle extends Forme {
    public Rectangle(int larg, int haut){
        super(larg, haut);
    }
    public int aire(){
        return largeur*hauteur;
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2,3);
        System.out.println(r1.aire());
    }

}
