package arrays;

 // Move zero to start 


public class Solution {
	
	 public static void main(String args[]) {
		 
		 int nums[] = {1,3,0,6,9,0};
		 
		   int j= nums.length-1;
		   
		     for(int i = nums.length -1 ;i>=0 ;i--) {
		    	 
		    	    if( nums[i] != 0) {
		    	    	 int temp = nums[i];
		    	    	   nums[i] = nums[j];
		    	    	   nums[j] = temp;
		    	    	   j--;
		    	    }
		    	 
		     }
		     
		      for(int i=0 ;i<nums.length;i++) {
		    	   System.out.println(nums[i]);
		      }
		 
	 }

}
