public class StringManipulationTest{
  public static void main(String[] args){
    StringManipulation manipulator = new StringManipulation();
    
    char letter = 'o';
    Integer a = manipulator.getIndexOrNull("Coding", letter);
    Integer b = manipulator.getIndexOrNull("Hello World", letter);
    Integer c = manipulator.getIndexOrNull("Hi", letter);
    System.out.println(a); // 1
    System.out.println(b); // 4
    System.out.println(c); // null

    
    String word = "Hello";
    String subString = "llo";
    String notSubString = "world";
    Integer D = manipulator.getIndexOrNull(word, subString);
    Integer E = manipulator.getIndexOrNull(word, notSubString);
    System.out.println(a); // 2
    System.out.println(b); // null

    
    String word4 = manipulator.concatSubstring("Hello", 1, 2, "world");
    System.out.println(word); // eworld
  }
}