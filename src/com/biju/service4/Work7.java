package com.biju.service4;

public class Work7 {

	public static void main(String[] args) {
		
		 String name = "prasantnasarp";
		 String name2 = "";
	       
	        for(int i= 0; i <= name.length()-1; i++) {
	            name2 = name2 + name.charAt(name.length()-1-i);
	        }
	        
	       if(name.equalsIgnoreCase(name2) ) {
	    	   System.out.println("it is a Palindrome string");
	       }else {
	    	   System.out.println("Not a Palindrome string");
	       }
	}

}
