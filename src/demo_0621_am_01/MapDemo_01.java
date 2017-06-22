package demo_0621_am_01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo_01 {
    public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("no", "T0001");
		map.put("name", "宇文玥");
		map.put("age", "20");
		map.put("sal", "kkk");
		System.out.println(map);
		System.out.println(map.get("no"));
	}
}
