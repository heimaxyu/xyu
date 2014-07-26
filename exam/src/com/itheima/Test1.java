package com.itheima;

import java.util.*;



public class Test1 {

	/**
	 * 1、 编写一个类，在main方法中定义一个Map对象（采用泛型），加入若干
	 * 个对象，然后遍历并打印出各元素的key和value。
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建Map对象map，并设置泛型为整数类型和字符串类型的组合
		Map<Integer,String> map=new HashMap<Integer,String>();
		//加入4个对象
		map.put(1, "xiaoyan");
		map.put(2,"xiaoming");
		map.put(3, "xiaobin");
		map.put(4, "xiaoyuan");
		//使用高级for循环遍历，取出map的对应关系存放在Set中，并从中逐一取对象
		for(Object obj:map.entrySet())
		{
			//将Object对象强制转换成Entry对象
			Map.Entry<Integer,String> entry=(Map.Entry<Integer, String>)obj;
			//逐一打印个元素的key和value
			System.out.println(entry.getKey()+"....."+entry.getValue());
		}
	}

}
