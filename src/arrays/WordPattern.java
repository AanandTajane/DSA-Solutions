package arrays;

import java.util.HashMap;

public class WordPattern {
	
	 public static void main(String args[]) {
		 
		 String s= "Dog Cat Dog Fish";
		 String pattern = "abab";
		 
		    System.out.println(checkWordPattern(s, pattern));	 
	 }

	private static boolean checkWordPattern(String s, String pattern) {

		
		     String words[] = s.trim().split("\\s+");
		        int n= words.length;
		       // check if words and pattern have same lenght
		         if(n != pattern.length()) {
		        	  return false;
		         }
		        
		         HashMap<Character,String> map = new HashMap<>();
		         
		          for(int i=0 ;i < pattern.length();i++) {
		        	  
		              char ch = pattern.charAt(i);
		        	     String word = words[i];
		        	     
		        	     if(map.containsKey(ch)){
		        	    	 if( !map.get(ch) .equals(word) ) {
		        	    		 return false; 
		        	    	 }
		        	    	 
		        	     }
		        	     else {
		        	    	 if( map.containsValue(word)) 
		        	    		  return false;
		        	    	 else 
		        	    		  map.put(ch, word);  
		        	     }    
		          }
		         
		return true;
	}

}
