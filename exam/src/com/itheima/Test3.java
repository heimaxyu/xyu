package com.itheima;

import java.lang.reflect.*;
import java.util.*;

public class Test3 {

	/**
	 * 3�� ArrayList<Integer> list = new ArrayList<Integer>(); 
	 * ���������ΪInteger��ArrayList�д��һ��String���͵Ķ���
	 * @param args
	 */
	private static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		/*ArrayList<Integer> list = new ArrayList<Integer>();
		//�����б�ʹ�õ�������װ����������List���е�ListIterator
		ListIterator listit=list.listIterator();
		//ʹ�õ�����ListIterator��add����������ַ���
		listit.add("�ַ���");
		//��ӡ���ַ�����������
		System.out.println(listit.previous().toString());*/
		Class c=Test3.class;
		Field f=c.getDeclaredField("list");
		Class clazz=f.getType();
		Method method=clazz.getMethod("add", Object.class);
		method.invoke(list, "�ַ���");
		for(Object obj:list)
		{
			System.out.println(obj);
		}

		
	}
}
/*
 * �ڱ����У���֪������������ǲ����������ġ�
 * ��Ϊ�Ҹо��������ķ���Ӧ��������ˡ�
 * �о������е�̡�����������������ģ�ϣ����ʦ���һ�����
 * */
