package Ch10;



import java.util.*;

public class BackStates 
{
  public static void main (String args[])
  {
    TreeMap<String,String> map = new TreeMap<String,String>();
    map.put("Virginia", "Richmond");
    map.put("Massachusetts", "Boston");
    map.put("New York", "Albany");
    map.put("Maryland", "Annapolis");
    map.put("Rhode Island", "Providence");
    map.put("Connecticut", "Hartford");
    map.put("Delaware", "Dover");
    map.put("New Hampshire", "Concord");
    map.put("North Carolina", "Raleigh");
    map.put("South Carolina", "Columbia");
    map.put("New Jersey", "Trenton");
    map.put("Pennsylvania", "Harrisburg");
    map.put("Georgia", "Atlanta");
    
//    System.out.println("DISPLAY avec TOSTRING = " + map.toString());
//    System.out.println("DISPLAY all KEYS = " + map.keySet());
    
    System.out.println("---------------------");
   	System.out.println("---------------------");
   	
    System.out.println("DISPLAY all VALUES = " + map.values());
    
    System.out.println("DISPLAY avec ENTRYSET = " + map.entrySet());
    
    System.out.println("---------------------");
   	System.out.println("---------------------");
    
    System.out.println("DISPLAY containsKey   = " + map.containsKey("Delaware"));
    System.out.println("DISPLAY containsValue = " + map.containsValue("Trenton"));
    
    System.out.println("---------------------");
	System.out.println("---------------------");
    
	 System.out.println("TOSTRING = " + map.toString());
    
    System.out.println("---------------------");
	System.out.println("---------------------");
	
	
    if (!map.isEmpty()) 
    {
    	//Object lastK = map.lastKey();
    	String lastK  = map.lastKey();
    	String firstK = map.firstKey();
    	
    	System.out.println("firstKey = " + firstK);
    	System.out.println("lastkey = " + lastK);
    	System.out.println("---------------------");
    	System.out.println("---------------------");
    	
    	boolean first = true;
    	
    do {
    		if (!first) 
    		{
    			//System.out.print(", ");
    		}
    		//System.out.println(last);
    		System.out.println("last_do = " + lastK);
    		lastK=map.headMap(lastK).lastKey();
    		first=false;
    } 
    while (lastK != map.firstKey());
    //System.out.println();
    System.out.println("---------------------");
    }
    System.out.println("---------------------");
    for (String name : map.keySet()) {
    	System.out.println("name = " + name);
    	System.out.println("value = " + map.get(name));
    }
    System.out.println("---------------------");
  }
}