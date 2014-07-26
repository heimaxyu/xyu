package com.itheima;

import java.lang.reflect.*;
import java.util.*;

public class Test3 {

	/**
	 * 3、 ArrayList<Integer> list = new ArrayList<Integer>(); 
	 * 在这个泛型为Integer的ArrayList中存放一个String类型的对象。
	 * @param args
	 */
	private static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		/*ArrayList<Integer> list = new ArrayList<Integer>();
		//将该列表使用迭代器封装，迭代器是List特有的ListIterator
		ListIterator listit=list.listIterator();
		//使用迭代器ListIterator的add方法，存放字符串
		listit.add("字符串");
		//打印该字符串进行试验
		System.out.println(listit.previous().toString());*/
		Class c=Test3.class;
		Field f=c.getDeclaredField("list");
		Class clazz=f.getType();
		Method method=clazz.getMethod("add", Object.class);
		method.invoke(list, "字符串");
		for(Object obj:list)
		{
			System.out.println(obj);
		}

		
	}
}
/*
 * 在本题中，不知道该题的期望是不是我这样的。
 * 因为我感觉我这样的方法应该算最简单了。
 * 感觉代码有点短。如果期望不是这样的，希望老师给我回馈。
 * */
