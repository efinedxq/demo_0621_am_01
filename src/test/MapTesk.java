package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapTesk {

	public static void main(String[] args) {
		String no;

		Scanner input = new Scanner(System.in);
		while (true) {
			no = input.next();

			Map<String, Integer> map = new HashMap<String, Integer>();
			List<String> list = new ArrayList<String>();
		    for(char i = 'A';i <= 'Z';i++){
		    	list.add(i+"");
		    	map.put(i+"",0);
		    }
		    System.out.println(map);
		    no = no.toUpperCase();
		    System.out.println(no);
			for (int i = 0; i < no.length(); i++) {
				String ch = no.substring(i, i + 1);
				int cnt = map.get(ch).intValue();
				cnt = cnt + 1;
				map.put(ch, cnt);
			}
			System.out.println("结果：");
			System.out.println(map.toString());

			// 便利灭一个不重复的字符获取对应的次数
			System.out.println("字符：次数");
			for (String key : list) {
				Integer value = map.get(key);
				System.out.println(" " + key + " : " + value);
			}

		}

	}

}
