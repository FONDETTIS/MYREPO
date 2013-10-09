package Ch10;

import java.util.*;

public class LinkedHashMapModel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	HashMap<Integer, String> maHashMap = new HashMap<Integer, String>(10);
	for( int i = 0; i<10; ++i)
	{
		 if (i != 5)
	     maHashMap.put(new Integer(i),""+i);
	}
	maHashMap.put(new Integer(5),""+5);
	
	System.out.println("maHashMap = " + maHashMap);
	
	System.out.println("---------------------");
	System.out.println("---------------------");
	
	LinkedHashMap<Integer, String> maLinkedHashMap = new LinkedHashMap<Integer, String>(10);
	for( int i = 0; i<10; ++i)
	{
		if (i != 5)
		maLinkedHashMap.put(new Integer(i),""+i);
	}
	
	maLinkedHashMap.put(new Integer(5),""+5);
	
	System.out.println("maLinkedHashMap = " + maLinkedHashMap);
	
	System.out.println("---------------------");
	System.out.println("---------------------");
	
	for (Integer i : maHashMap.keySet()) {
    	System.out.println("maHashMap.key = " + i);
    	System.out.println("maHashMap.value = " + maHashMap.get(i));
    }
	
	System.out.println("---------------------");
	System.out.println("---------------------");

	for (Integer i : maLinkedHashMap.keySet()) {
    	System.out.println("maLinkedHashMap.key = " + i);
    	System.out.println("maLinkedHashMap.value = " + maLinkedHashMap.get(i));
    }
	
	System.out.println("---------------------");
	System.out.println("---------------------");
	
	
	}

}
