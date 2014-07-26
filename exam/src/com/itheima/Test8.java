package com.itheima;

import java.beans.PropertyDescriptor;
import java.lang.reflect.*;

public class Test8 {

	/**
	 * 8、 定义一个标准的JavaBean，名叫Person，
	 * 包含属性name、age。使用反射的方式创建一个实例、调用
	 * 构造函数初始化name、age，使用反射方式调用setName方法
	 * 对名称进行设置，不使用setAge方法直接使用反射方式对age赋值。
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//先获取Person类的字节码clazz
		Class clazz=Person.class;
		//定义好构造函数con
		Constructor con;
		try {
			//将第一个参数类型为String、第二个参数类型为int的构造函数定义在con
			con = clazz.getConstructor(String.class,int.class);
			//使用该构造函数创建实例
			Person p=(Person) con.newInstance("xiaoha",13);
			//用对象调用自己的方法打印出它的name和age值
			System.out.println(p.getName()+"..."+p.getAge());
			//反射setName方法
			Method sName=clazz.getMethod("setName", String.class);
			//将name值改为daha
			sName.invoke(p, "daha");
			//反射getName方法
			Method gName=clazz.getMethod("getName");
			//打印改变后的name值
			System.out.println(gName.invoke(p));
			//这里使用内省操作JavaBean
			String propertyName="age";
			PropertyDescriptor pd=
				new PropertyDescriptor(propertyName,clazz);
			//通过反射改变age值，并打印
			Method sAge=pd.getWriteMethod();
			sAge.invoke(p, 18);
			Method gAge=pd.getReadMethod();
			System.out.println(gAge.invoke(p));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
}
}
//创建Person类
class Person{
	private String name;	
	private int age;
	//一个空参数构造函数和一个带参数构造函数
	public Person(){}
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	//属性都有get和set方法，标准JavaBean
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}