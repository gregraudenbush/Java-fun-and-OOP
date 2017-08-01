import java.util.*;
import java.lang.*;

public class Puzzling{
  public void sum10(int[] arr){
    ArrayList<Integer> overten = new ArrayList<Integer>();
    
    int sum = 0;

    for(int i = 0; i < arr.length; i++){
      sum += arr[i];
      if(arr[i] > 10){
        overten.add(arr[i]);
      }
    }
    System.out.println(overten);
    System.out.println(sum);
  }
  public void rando(String[] a){
    ArrayList<String> overfive = new ArrayList<String>();
      
   Collections.shuffle(Arrays.asList(a));

    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
      int str = a[i].length();
        if(str > 5){
          overfive.add(a[i]);
        }   
    }
    System.out.println(overfive);
  }
public void alphabet(Character[] a){
   
  List<Character> a2 = Arrays.asList(a);
  Collections.shuffle(a2); 
  Character[] myShuffledArray = (Character[]) a2.toArray();
  System.out.println("last one " + myShuffledArray[myShuffledArray.length-1]);
  if(myShuffledArray[0] == 'a' || myShuffledArray[0] == 'e' || myShuffledArray[0] == 'i' || myShuffledArray[0] == 'o' || myShuffledArray[0] == 'u' ){
    System.out.println("First one is a Vowel: " + myShuffledArray[0]);
  }else{
    System.out.println("first one :" + myShuffledArray[0]);
  }
}

public void randomnumber(int min, int max){
  Random r = new Random();
  int Low = min;
  int High = max;
  int Result = r.nextInt(High-Low) + Low;
  System.out.println(Result);
}

public void randomarr(int min, int max){
  ArrayList<Integer> randarr = new ArrayList<Integer>();

  for(int i = 1; i <= 10; i ++){  
    Random r = new Random();
    int Low = min;
    int High = max;
    int Result = r.nextInt(High-Low) + Low;
    randarr.add(Result);
  }
    System.out.println(randarr);
}

public void randomstring(int num){
  String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() <= num) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        System.out.println(saltStr);

}

public void randomstringarray(int num, int num2){
  ArrayList<String> arr = new ArrayList<String>();
  String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  
  for(int i = 1; i <= num2; i++){
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() <= num) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        
        String saltStr = salt.toString();
        arr.add(saltStr);
  }
  System.out.println(arr);

}

 
}