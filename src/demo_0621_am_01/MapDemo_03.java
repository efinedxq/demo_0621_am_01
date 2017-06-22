package demo_0621_am_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo_03 {
    public static void main(String[] args) {
    	String no;
    	
		Scanner input = new Scanner(System.in);
		while(true){
			no = input.next();
			Map<String, Integer> map = new HashMap<String,Integer>();
			for(int i = 0; i < no.length(); i ++){
				String ch = no.substring(i, i+1);
				int cnt = 1;
				if(map.containsKey(ch)){
					cnt = map.get(ch)+1;
				}
				map.put(ch, cnt);
			}
			System.out.println("结果：");
			System.out.println(map.toString());
			System.out.println("字符：次数");
			for(Map.Entry<String, Integer> entry:map.entrySet()){
				String key = entry.getKey();
				Integer value = entry.getValue();
				System.out.println(" "+key+" : "+value);
			}
			
		}
	}
}
