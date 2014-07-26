package com.itheima;

import java.beans.PropertyDescriptor;
import java.lang.reflect.*;

public class Test8 {

	/**
	 * 8�� ����һ����׼��JavaBean������Person��
	 * ��������name��age��ʹ�÷���ķ�ʽ����һ��ʵ��������
	 * ���캯����ʼ��name��age��ʹ�÷��䷽ʽ����setName����
	 * �����ƽ������ã���ʹ��setAge����ֱ��ʹ�÷��䷽ʽ��age��ֵ��
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Ȼ�ȡPerson����ֽ���clazz
		Class clazz=Person.class;
		//����ù��캯��con
		Constructor con;
		try {
			//����һ����������ΪString���ڶ�����������Ϊint�Ĺ��캯��������con
			con = clazz.getConstructor(String.class,int.class);
			//ʹ�øù��캯������ʵ��
			Person p=(Person) con.newInstance("xiaoha",13);
			//�ö�������Լ��ķ�����ӡ������name��ageֵ
			System.out.println(p.getName()+"..."+p.getAge());
			//����setName����
			Method sName=clazz.getMethod("setName", String.class);
			//��nameֵ��Ϊdaha
			sName.invoke(p, "daha");
			//����getName����
			Method gName=clazz.getMethod("getName");
			//��ӡ�ı���nameֵ
			System.out.println(gName.invoke(p));
			//����ʹ����ʡ����JavaBean
			String propertyName="age";
			PropertyDescriptor pd=
				new PropertyDescriptor(propertyName,clazz);
			//ͨ������ı�ageֵ������ӡ
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
//����Person��
class Person{
	private String name;	
	private int age;
	//һ���ղ������캯����һ�����������캯��
	public Person(){}
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	//���Զ���get��set��������׼JavaBean
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