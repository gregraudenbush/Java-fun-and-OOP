import java.util.*;

public class SinglyLL{
    Node head;


    public void SLLHead(){
        this.head = null;
    }

    public void add(int val){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
        }else {
            Node runner = head;
            while(runner.next != null){
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public void remove(){
        Node runner = this.head;

        if(head == null) {
            System.out.println("no nodes in SLL");
        }else if(head.next == null){
            runner = runner.next;
        }
        runner.next = null;
    }
    public void printValues(){
        Node runner = this.head;

        if(runner == null){
            System.out.println("There are no nodes in SLL");
        }else{
            while(runner != null) {
                System.out.println(runner.val);
                runner = runner.next;
            }
        }
    }

    // public Node find(int val) {
    //     if(head == null) {
    //         return null;
    //     }

    //     Node runner = this.head;

    //     while(runner != null) {
    //         if(runner.value == val) {
    //             return runner;
    //         }

    //         runner = runner.next;
    //     }

    //     return null;
    // }

    // public void removeAt(int index) {
    //     Node previous = head;
    //     int count = 0;

    //     if(head == null) {
    //         System.out.println("There are no nodes in the SLL");
    //     } else if(index == 0) {
    //         head = head.next;
    //     } else {
    //         while(count < index - 1) {
    //             if(previous.next == null) {
    //                 return;
    //             }
    //             previous = previous.next;
    //             count++;
    //         }
    //         Node current = previous.next;
    //         previous.next = current.next;
    //         current.next = null;
    //     }
     
    // }
}