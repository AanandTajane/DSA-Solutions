package arrays;

import java.util.HashMap;

// check If an array contains duplicate or not and if it contains duplicate return true or return false

public class ContainsDuplicate {
	
	  public static void main(String args[]) {
		  
		   int nums[]= {1,2,3,1};
		   System.out.println(checkDuplicate(nums));
		    
	  }
	  
	  public static boolean checkDuplicate(int nums[]) {
		  
		    HashMap<Integer,Integer> map = new HashMap<>();
		    
		       for(int i=0 ;i<nums.length;i++) {
		    	    if(map.containsKey(nums[i])) {
		    	    	return true;
		    	    }
		       
		      map.put(nums[i],i);
		       }
		     return false;
		  
		  
	  }

}
