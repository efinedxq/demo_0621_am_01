package demo_0621_am_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringDemo_01 {
    public static void main(String[] args) {
		String no = "370629198811020035";
//		String no = "370629881102003";
		char s = no.charAt(16);
		int a = s-48;
		if(s%2==0){
			System.out.println("女");
		}else{
			System.out.println("男");
		}
		
		String y = no.substring(6, 10);
		String m = no.substring(10, 12);
		String d = no.substring(12, 14);
		System.out.println(y+"-"+m+"-"+d);
		
	}
}
