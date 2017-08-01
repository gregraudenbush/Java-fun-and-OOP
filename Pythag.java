import java.lang.Math;

public class Pythag {
  public double calculateHypotenuse(int legA, int legB){
    
    
    
    double c = Math.sqrt((legA * legA) + (legB * legB));
    return c;
  }
}