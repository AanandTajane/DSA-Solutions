package arrays;

public class RemoveDuplicates {
	
	   public static void main(String args[]) {
		   
		   int arr[] = {1,2,3,3,4};
		   
		    int length = removeDuplicatesElement(arr);
		     System.out.println(length);
		   
		   
	   }
	   
	    public static int removeDuplicatesElement(int nums[]) {
	    	
	    	int j=1;
	    	   for(int i=1; i< nums.length;i++) {
	    		   
	    		   if(nums[i] != nums[i-1]) {
	    			   nums[j]= nums[i];
	    			   j++;
	    		   }
	    		      
	    	   }
	    	  // Array contains only single appearing element  
	    	   for( int k=0; k<j;k++)
	    	    {
	    	    	 System.out.print(nums[k] + " ");
	    	    }	
	    
	    	 // returning the length of array after removing duplicates     
	    	return j;
	    	
	    }

}
