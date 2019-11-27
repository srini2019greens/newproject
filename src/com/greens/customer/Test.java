package com.greens.customer;

import java.io.EOFException;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {
		
		
		// Creating an empty TreeMap 
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>(); 
  
        // Mapping string values to int keys 
        tree_map.put(10, "Geeks"); 
        tree_map.put(40, "4"); 
        tree_map.put(20, "Geeks"); 
        tree_map.put(25, "Welcomes"); 
        tree_map.put(30, "You"); 
  
        // Displaying the TreeMap 
        System.out.println("Initial Mappings are: " + tree_map); 
  
        // Checking for the Value 'Geeks' 
        System.out.println("Is the value 'Geeks' present? " +  
        tree_map.containsValue("Geeks")); 
  
        // Checking for the Value 'World' 
        System.out.println("Is the value 'World' present? " + 
        tree_map.lastEntry()); 
        
        // Removing the existing key mapping 
        String returned_value = (String)tree_map.remove(20); 
  
        // Verifying the returned value 
        System.out.println("Returned value is: " + 
                                        returned_value);  
    } 
} 