package com.csg.tau.TestProject.TestScript;

import java.util.HashMap;
import java.util.Map;

public class frequencyOfChar {

	public static void main(String[] args) {
		String s="I Am Learning Java";
		s=s.toLowerCase();
		char[] ch=s.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<Character, Integer>();
		for(char c:ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c,1);
			}
		}

		for(Map.Entry m: hm.entrySet()) {
				System.out.println(m.getKey() + " " +m.getValue() );
			}
		}
	}


