public class StringManipulation{

  public String trimAndConcat(String word1, String word2){
    return word1.trim() + word2.trim();
  }
  public Integer getIndexOrNull(String word1, char char1){
    int index = word1.indexOf(char1);

    return index == -1 ? null : index;
  }
  public Integer getIndexOrNull(String word1, String word2){
    int idx = word1.indexOf(word2);

    return idx == -1 ? null : idx;
  }
  public String concatSubstring(String word1, int int1, int int2, String word2){
    String substring = word1.substring(int1, int2);
    return substring + word2;
  } 

}