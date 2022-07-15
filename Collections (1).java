package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collections {

	public static void main(String[] args) {
		//ArrayList
		List<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Mango");//Adding object in arraylist    
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");  
	      //Printing the arraylist object   
	      System.out.println(list);  
	      System.out.println("**************"); 
		// Set
      //  Set<String> setA = new HashSet<String>();
        Set<String> setA = new TreeSet<String>();

        setA.add("ram");
        setA.add("ram");
        setA.add("anu");
        setA.add("shiva");

        System.out.println( setA );
        
        //Map
        Map<String,String> map1 = new HashMap<>();
        map1.put("emp1", "1000");
        map1.put("emp2", "2000");
        map1.put("emm3", "3000");
        if( map1.containsKey("emp2")) {
        	System.out.println("true!!");
        }
       
        for (Map.Entry<String,String> entry : map1.entrySet()) {  
        	
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
        
        }
	}

}
