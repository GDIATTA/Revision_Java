/* Écrire en Python une classe «Rectangle» ayant deux variables « a »
 et « b » et une fonction membre « surface() » qui retournera la
  surface du rectangle. */

package SimpleClass;

public class Rectangle {
    float a;
    float b;
    public Rectangle(int x, int y){
        this.a=x;
        this.b=y;
    }
    public float surface(){
        return this.a*this.b;
    }
    public static void main(String[] args) {
        Rectangle p1 = new Rectangle(2,3);
        System.out.println(p1.surface());
    }
}
