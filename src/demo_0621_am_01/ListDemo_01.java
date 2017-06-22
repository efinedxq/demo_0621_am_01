package demo_0621_am_01;

import java.util.ArrayList;
import java.util.List;

public class ListDemo_01 {
    public static void main(String[] args) {
		List<String> lets = new ArrayList<String>(); 
		for(char i='a';i<='z';i++){
			lets.add(i+"");
		}
		for(char i='A';i<='Z';i++){
			lets.add(i+"");
		}
	}
}
