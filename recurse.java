import java.util.ArrayList;
public class recurse{
  public static ArrayList<String> makeAllWords(int k, int maxLetter){
ArrayList<String> news = new ArrayList<String>();
return makeAllWordsH(k, "", maxLetter, news);
  }

  public static ArrayList<String> makeAllWordsH(int k, String word, int maxLetter, ArrayList<String> list){
    if (k==0){
      list.add(word);
      return list;
    }
    else
    for(char c = 'A'; c <= 'A' + maxLetter-1; c++){
   makeAllWordsH(k-1,word+c, maxLetter, list);
    }

    return list;
  }

public static void main(String[] args) {
  System.out.println(makeAllWords(3, 3));
}
}
