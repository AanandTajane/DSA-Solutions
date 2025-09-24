package arrays;

import java.util.HashMap;

public class TwoSum {
	
	public static void main(String args[]) {
		
		int nums [] = {1,2,3,7};
		
		  int target =9;
		 
		  int newarr[] = twosum(nums, target) ;
		  
		    for(int i =0; i< newarr.length;i++) {
		    	 System.out.println(newarr[i]);
		    }
		 
		    
	}
	private static int[] twosum(int nums[], int target) {
		
		HashMap<Integer,Integer> map =  new HashMap<>();
		
		     for(int i=0; i<nums.length;i++) {
		    	 
		    	   int complement = target - nums[i];
		    	 
		    	    if(map.containsKey(complement)) {
		    	    	return new int[] {map.get(complement),i};
		    	    }
		    	    map.put(nums[i],i);
		     }
		     
		    
		   
		 
		 return new int[] {};
	 }
	
	  
	

}
