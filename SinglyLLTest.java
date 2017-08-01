import java.util.*;

public class SinglyLLTest{
    public static void main(String[] args){
        SinglyLL sll = new SinglyLL();
        sll.add(3);
        sll.add(5);
        sll.add(6);
        sll.add(7);
        sll.add(33);
        sll.add(8);
        sll.add(9);
        sll.add(5);
        sll.add(3);
        sll.printValues();
        sll.remove();
        sll.printValues();
    }
}