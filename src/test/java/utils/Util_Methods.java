package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Util_Methods {

	public static Integer findMin(List<Integer> list) 
    { 
  
        // check list is empty or not 
        if (list == null || list.size() == 0) { 
            return Integer.MAX_VALUE; 
        } 
  
        // create a new list to avoid modification in the original list 
        List<Integer> sortedlist = new ArrayList<>(list); 
  
        // sort list in natural order 
        Collections.sort(sortedlist); 
  
        // first element in the sorted list would be minimum 
        return sortedlist.get(0); 
    } 
  
    // function return maximum value in an unsorted list in Java using Collection 
    public static Integer findMax(List<Integer> list) 
    { 
  
        // check list is empty or not 
        if (list == null || list.size() == 0) { 
            return Integer.MIN_VALUE; 
        } 
  
        // create a new list to avoid modification in the original list 
        List<Integer> sortedlist = new ArrayList<>(list); 
  
        // sort list in natural order 
        Collections.sort(sortedlist); 
  
        // last element in the sorted list would be maximum 
        return sortedlist.get(sortedlist.size() - 1); 
    } 
  
}
