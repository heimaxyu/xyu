package com.itheima;

import java.util.*;



public class Test1 {

	/**
	 * 1�� ��дһ���࣬��main�����ж���һ��Map���󣨲��÷��ͣ�����������
	 * ������Ȼ���������ӡ����Ԫ�ص�key��value��
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����Map����map�������÷���Ϊ�������ͺ��ַ������͵����
		Map<Integer,String> map=new HashMap<Integer,String>();
		//����4������
		map.put(1, "xiaoyan");
		map.put(2,"xiaoming");
		map.put(3, "xiaobin");
		map.put(4, "xiaoyuan");
		//ʹ�ø߼�forѭ��������ȡ��map�Ķ�Ӧ��ϵ�����Set�У���������һȡ����
		for(Object obj:map.entrySet())
		{
			//��Object����ǿ��ת����Entry����
			Map.Entry<Integer,String> entry=(Map.Entry<Integer, String>)obj;
			//��һ��ӡ��Ԫ�ص�key��value
			System.out.println(entry.getKey()+"....."+entry.getValue());
		}
	}

}
