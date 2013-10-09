package Ch10;


import java.io.*;
import java.util.*;

public class WordCount4 {
  static final Integer ONE = new Integer(1);

  public static void main (String args[]) 
      throws IOException {

    HashMap<String,Integer> map = new HashMap<String,Integer>();
    FileReader fr = new FileReader(args[0]);
    BufferedReader br = new BufferedReader(fr);
    String line;
    while ((line = br.readLine()) != null) {
      processLine(line, map);
    }
    System.out.println("MOTS NON TRIES :");
    printMap(map);
    System.out.println("--------------------");
    System.out.println("MOTS TRIES :");
    printMap(new TreeMap<String,Integer>(map));
    System.out.println("--------------------");
  }
  static void printMap(Map<String,Integer> map) {
    Iterator itor = map.entrySet().iterator();
    while (itor.hasNext()) {
      Map.Entry entry = (Map.Entry)itor.next();
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
  }
  static void processLine(String line, Map<String,Integer> map) {
    StringTokenizer st = new StringTokenizer(line);
    while (st.hasMoreTokens()) {
      addWord(map, st.nextToken());
    }
  }
  static void addWord(Map<String,Integer> map, String word) {
    Object obj = map.get(word);
    if (obj == null) {
      map.put(word, ONE);
    } else {
      int i = ((Integer)obj).intValue() + 1;
      map.put(word, new Integer(i));
    }
  }
}
