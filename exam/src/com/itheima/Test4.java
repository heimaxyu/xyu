package com.itheima;

import java.io.*;
import java.lang.reflect.Field;
import java.text.*;

public class Test4 {

	/**
	 * 4�� дһ���������˷����ɽ�obj��������ΪpropertyName�����Ե�ֵ����Ϊvalue.   

public void setProperty(Object obj, String propertyName, Object value){   

}
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������Ҫ�õ����䣬Ϊ�������½�Demo�࣬������������������d
		Demo1 d=new Demo1();
		//��ӡ����d��getStr����������÷������ص�ֵ
		System.out.println(d.getStr());
		//���÷������d�������Ϊstr�����Ե�ֵ����Ϊ���漣���֡�
		setProperty(d,"str","�漣����");
		//������ĺ��str�Ľ��
		System.out.println(d.getStr());
	}
	public static void setProperty(Object obj, String propertyName, Object value){   
		//������Ķ�����ֽ��뱣����clazz��
		Class clazz=obj.getClass();
		try {
			/*��ȡ������Ϊ������ַ��������ԣ�ע�⣺�����õ�getFiled,
			 * ���ֻ�ܼ��public�ĳ�Ա�������������Ҷ���ĳ�Ա����Ȩ��
			 * ��public�����û�б�����󡣣���ʹ��defaultҲ�ᱨ�����Ŷ��
			*/
			Field field=clazz.getField(propertyName);
			//�жϸó�Ա�����������Ƿ�ʹ���ֵ��������ͬ����ͬ��value�滻ԭ��ֵ
			if(field.getType()==value.getClass())
			try {
				//��
				field.set(obj,value);
				
					
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//���Ͳ�ͬ����ʾ
			else
				System.out.println("�����valueֵ���ͺ�Ŀ�����Ͳ�ͬ");
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
class Demo1{
	//����str��String������ֵΪ"�ȴ��漣��
	public String str="�ȴ��漣";
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
}

	



