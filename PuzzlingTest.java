import java.util.*;

public class PuzzlingTest{
  public static void main(String[] args){
    Puzzling p = new Puzzling();
    int[] myArray = {3,5,1,2,7,9,8,13,25,32};
    // p.sum10(myArray);
    String[] myArray2 = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
    // p.rando(myArray2);
    Character[] alph = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    // p.alphabet(alph); 
    // p.randomnumber(55, 100);
    // p.randomarr(55, 100);
    // p.randomstring(5);
    p.randomstringarray(5, 10);
  }
}