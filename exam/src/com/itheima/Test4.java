package com.itheima;

import java.io.*;
import java.lang.reflect.Field;
import java.text.*;

public class Test4 {

	/**
	 * 4、 写一个方法，此方法可将obj对象中名为propertyName的属性的值设置为value.   

public void setProperty(Object obj, String propertyName, Object value){   

}
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//该题需要用到反射，为此我们新建Demo类，并在主函数创建对象d
		Demo1 d=new Demo1();
		//打印对象d的getStr方法，输出该方法返回的值
		System.out.println(d.getStr());
		//利用反射更改d对象的名为str的属性的值，改为“奇迹出现”
		setProperty(d,"str","奇迹出现");
		//输出更改后的str的结果
		System.out.println(d.getStr());
	}
	public static void setProperty(Object obj, String propertyName, Object value){   
		//将传入的对象的字节码保存在clazz中
		Class clazz=obj.getClass();
		try {
			/*获取对象名为传入的字符串的属性，注意：这里用到getFiled,
			 * 因此只能检查public的成员变量，该题中我定义的成员变量权限
			 * 是public，因此没有报告错误。（即使是default也会报告错误哦）
			*/
			Field field=clazz.getField(propertyName);
			//判断该成员变量的类型是否和传入值的类型相同，相同则将value替换原有值
			if(field.getType()==value.getClass())
			try {
				//将
				field.set(obj,value);
				
					
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//类型不同则提示
			else
				System.out.println("赋予的value值类型和目标类型不同");
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
	//定义str的String变量，值为"等待奇迹“
	public String str="等待奇迹";
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
}

	



