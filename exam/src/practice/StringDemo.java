package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.*;


public class StringDemo <Y> {
	List<Y> list =new ArrayList();
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		StringBuffer line=new StringBuffer("sdd7");
		String s=new String(line);

	//Class clazz=Class.forName(className);
	//System.out.println("clazz="+clazz);
		StringBuffer d=new StringBuffer(s);
		List<String> list=new ArrayList();
		list.add("lisi");
		Map map2=new HashMap();
		map2.put(1,"lisi");
		map2.put(1,"lisi");
		Set<Map.Entry<Integer, String>> entrySet=map2.entrySet();
		for(Object obj:entrySet)
		{
			System.out.println("开始一次数数");
			Map.Entry<Integer,String> entry=(Map.Entry)obj;
			Integer x=4;
			int ad=x+1;
		
			String key= x.toString();
			String value=(String) entry.getValue();
			System.out.println(key+value);
		}
		for(String qq:list)
		{
			
		}
		StringBuilder gg=new StringBuilder(s);
		char[] brr={'3','f'};
		int b=24;
		String num=Integer.toString(b);
		String text=Short.toString((short)b);
		System.out.println(text);
		char cc='f';
		File[] f=File.listRoots();
		boolean flag=false;
		PrintWriter pr=new PrintWriter(new FileOutputStream("c:\\a.txt"),flag);
		for(File t: f)
		{
			System.out.println(t);
		}
		String srr=String.copyValueOf(brr);
		System.out.println(srr.compareTo(s));
		System.out.println(srr);
		//StringBuffer s=line.reverse();
		line.insert(0,"a");
		Map map=new HashMap();
		map.put(3,4);
		map.put(1, 2);
		ArrayList arr=new ArrayList(map.values());
		for(Object a:arr)
		{
			System.out.println(a);
		}
		
		
		
		System.out.println(line);
		System.out.println(s);
	}

}
