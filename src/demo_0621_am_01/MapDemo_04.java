package demo_0621_am_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapDemo_04 {
    public static void main(String[] args) {
    	String no;
    	
		Scanner input = new Scanner(System.in);
		while(true){
			no = input.next();
			
			Map<String, Integer> map = new HashMap<String,Integer>();
			List<String> list = new ArrayList<String>();
			
			for(int i = 0; i < no.length(); i ++){
				String ch = no.substring(i, i+1);
				int cnt = 1;
				if(map.containsKey(ch)){
					cnt = map.get(ch)+1;
				}else{
					list.add(ch);
				}
				map.put(ch, cnt);
			}
			System.out.println("结果：");
			System.out.println(map.toString());
		
		    //便利灭一个不重复的字符获取对应的次数
			System.out.println("字符：次数");
			for(String key:list){
				Integer value = map.get(key);
				System.out.println(" "+key+" : "+value);
			}
			
		}
	}
}
