import java.util.ArrayList;
import java.util.Arrays;

public class Basics{
  public void basicprint(int num){
    // int num = 1;
    for(int i = 1; i <= num; i++){
      System.out.println(i);
      
    }
  }
  public void printodd(int num){
    
    for(int i = 1; i <= num; i++){
      if(i % 2 == 1){
        System.out.println(i);
      }
    }
  }
  public void printsum(int num){
    int count = 0;
    for(int i = 1; i <= num; i++){
      count = count + i;
      System.out.println("New Number: " + i + " Sum: " + count);

    }
  }
  public void printarray(int[] x){
    for(int i = 0; i < x.length; i++){
      System.out.println(x[i]);
      
    }
  }
  public void findmax(int[] x){
    int max = x[0];
    for(int i = 1; i < x.length; i++){
      if(x[i] > max){
        max = x[i];
      }
    }
    System.out.println(max);
  }
  public void findavg(int[] x){
    int count = 0;
    for(int i = 1; i < x.length; i++){
      count = count + x[i];
    }
    int avg = count / x.length;
    System.out.println(avg);
  }
  public void arrayodd(int x){

    ArrayList<Integer> myArray = new ArrayList<Integer>();

    for(int i = 0; i <= x; i++){
      if(i % 2 == 1){
        myArray.add(i);
      }
    }
    System.out.println(myArray);
  }

  public void greaterthan(int[] arr, int y){
    int count = 0;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] > y){
        count +=1;
      }
    }
    System.out.println(count);
  }

  public void squarethevalues(int[] arr){
    
    ArrayList<Integer> myArray = new ArrayList<Integer>();

    for(int i = 0; i < arr.length; i++){
      int square = arr[i] * arr[i];
      myArray.add(square);
    }
    System.out.println(myArray);
  }

  public void eliminatenegative(int[] arr){
    
    for(int i = 0; i < arr.length; i++){
      if(arr[i] < 0){
        arr[i] = 0;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
  public void minmaxavg(int[] arr){
    int max = arr[0];
    int min = arr[0];
    int sum = 0;
    ArrayList<Integer> myArray = new ArrayList<Integer>();
    for (int i = 0; i < arr.length; i++){
      
      sum += arr[i];
      if(arr[i] > max){
        max = arr[i];
      }else if (arr[i] < min){
        min = arr[i];
      }
    }
    myArray.add(max);
    myArray.add(min);
    int avg = sum / arr.length;
    myArray.add(avg);
    System.out.println(myArray);
  }
  
  public void shift(int[] arr){
    
    for(int i = 0; i < arr.length-1; i++){
      arr[i] = arr[i+1];
    }
    arr[arr.length-1] = 0;
    System.out.println(Arrays.toString(arr));
  }

}