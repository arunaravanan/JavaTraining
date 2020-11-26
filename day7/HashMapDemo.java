package com.java.training.day7;


import java.util.HashMap;

public class HashMapDemo {

	 public static void main(String[] args) {
		    
		    HashMap<Integer, String> alpha = new HashMap<Integer, String>();

		  // first is key next is value
		    alpha.put(22, "A");
		    alpha.put(11, "B");
		    alpha.put(14, "B");//executed since new key is given
		    alpha.put(35, "C");
		    System.out.println(alpha);
		    
		  }
}
