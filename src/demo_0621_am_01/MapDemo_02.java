package demo_0621_am_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapDemo_02 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Map<String,String>> stus = new ArrayList<Map<String,String>>();
        
        for(int i = 0 ; i < 2; i ++){
        	System.out.println("请输入第["+(i+1)+"]个学生的信息");
        	System.out.print("学号：");
        	String no = input.next();
        	System.out.print("姓名：");
        	String name = input.next();
        	System.out.print("性别：");
        	String sex = input.next();
        	System.out.print("微信号：");
        	String weiXin = input.next();
        	Map<String, String> stu = new HashMap<String, String>();
        	
        	stu.put("xuehao", no);
        	stu.put("xingMing", name);
        	stu.put("xingBie", sex);
        	stu.put("weiXin", weiXin);
        	
        	stus.add(stu);
        }
        
		// for(Map map:stus){
		// System.out.println(map);
		// }
        
        System.out.println("学生信息如下：");
        System.out.println("学号\t姓名\t性别\t微信");
        for(Map<String,String> map:stus){
        	String n = map.get("xuehao");
        	String xm = map.get("xingMing");
        	String xb = map.get("xingBie");
        	String wx = map.get("weiXin");
        	System.out.println(n+"\t"+xm+"\t"+xb+"\t"+wx);
        }
        
	}
} 
