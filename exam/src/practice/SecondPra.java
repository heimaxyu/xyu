package practice;

import java.lang.reflect.*;
import java.util.*;
class MyInvocationHandler implements InvocationHandler
{
	public Object invoke(Object proxy,Method method,Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		long start=System.currentTimeMillis();
		Object reval=method.invoke(proxy, args);
		long ending=System.currentTimeMillis();
		System.out.println(ending-start);
		return reval;
	}
}
public class SecondPra {

	/**
	 * @param args
	 */
	
	Map<String,Integer> map=new HashMap<String,Integer>();
	public static void main(String[] args) throws Exception {
		// TcODO Auto-generated method stub
		Class cs=Proxy.getProxyClass(Map.class.getClassLoader(), Map.class);
		Constructor conss=cs.getConstructor(InvocationHandler.class);
		HashMap tts=(HashMap)conss.newInstance(new MyInvocationHandler());
		
		System.out.println(tts);
		Class clazz=Student.class;
		Constructor[] cons=clazz.getConstructors();
		for(Constructor s:cons)
		{
			System.out.println(s.toString());
		}
		Class cla=SecondPra.class;  
		Field field=cla.getDeclaredField("map");
		System.out.println(field);
		System.out.println(field.getName());
		Class cls=field.getType();
		System.out.println(cls);
		Type type=field.getGenericType();
		System.out.println(type);
		ParameterizedType pt=(ParameterizedType)type;
		System.out.println(pt);
		Type t=pt.getRawType();
		System.out.println(t);
		System.out.println(t==cls);
		Type tt=pt.getOwnerType();
		System.out.println(tt);
		Type[] te=pt.getActualTypeArguments();
		for(Type tbb:te)
		{
			System.out.println(tbb==String.class);
			System.out.println(tbb);
		}
	}
	
	

}

class Student
{
	private String name=null;
	private int age=0;
 Student(String name,int num)
	{
		this.name=name;
		this.age=age;
	}
	public Student(){

}
  }








