package Ch10;


import java.util.*;
import java.util.Map.Entry;

public class DumpProps {
  public static void main (String args[]) {
    Properties props = System.getProperties();
    Iterator<Entry<Object, Object>> iter = props.entrySet().iterator();
    while (iter.hasNext()) {
      Map.Entry entry = (Map.Entry)iter.next();
      System.out.println(entry.getKey() + " --- " + entry.getValue());
    }

    System.out.println("-------");

    Enumeration en = props.propertyNames();
    while (en.hasMoreElements()) {
      String key = (String)en.nextElement();
      System.out.println(key + " --- " + props.getProperty(key));
    }
  }
}