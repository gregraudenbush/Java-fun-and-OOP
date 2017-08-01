import java.util.ArrayList;

public class BasicsTest{
  public static void main(String[] args){
    Basics task = new Basics();
    // task.basicprint(255);
    // task.printodd(255);
    // task.printsum(255);
    // ArrayList x = [1,3,5,7,9,13];
    int[] x = new int[6];
    x[0] = 1;
    x[1] = 3;
    x[2] = -5;
    x[3] = 7;
    x[4] = 9;
    x[5] = 13;
    // task.printarray(x);
    // task.findmax(x);
    // task.findavg(x);
    // task.greaterthan(x, 5);
    // task.squarethevalues(x);
    // task.eliminatenegative(x);
    // task.minmaxavg(x);
    task.shift(x);
  }
}