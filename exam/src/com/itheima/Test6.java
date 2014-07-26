package com.itheima;


import java.io.IOException;
import java.net.*;
import java.text.Collator;
import java.util.*;
import java.io.*;
public class Test6 {

	/**
	 * 6、 编写程序，循环接收用户从键盘输入多个字符串，
	 * 直到输入“end”时循环结束，并将所有已输入的字符串按字典顺序倒序打印。
	 * @param args
	 */
	
	/*
	 * 本题，我采用了客户端和服务端互动的形式。客户端从键盘输入多个字符串
	 * 最后以end结束输入。服务端首先将客户端传输的字符串一一打印，当
	 * 得到客户端停止输入的信息时，将客户端输入的所有字符串按
	 * 字典顺序倒序打印。
	 * 附：我对于eclipse如何模拟服务端与客户端还不太熟悉
	 * 本题是在两个DOS窗口上实现的，客户端是Test6_Socket，同在com.itheima包下
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//首先将一些必备的成员先定义好
		Socket s=null;
		BufferedReader bufr=null;
		BufferedWriter bufw=null;
		//List表用于存储客户端输入的所有字符串
		List<String> list=new ArrayList<String>();
		try {
			ServerSocket ss=new ServerSocket(10020);
			s=ss.accept();
			//用字符流缓冲区存储流
			bufr=
				new BufferedReader(new InputStreamReader(s.getInputStream()));
			bufw=
				new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			String line=null;
			//接收客户端输入的字符串，打印并添加到List表中
			while((line=bufr.readLine())!=null)
			{
				System.out.println(line);
				list.add(line);
			}
			//该功能甚至能给中文排序
			Collator cmp = Collator.getInstance(java.util.Locale.CHINA);  
	        Collections.sort(list, cmp);
	        //将排序后的表输入给客户端
	        for(String str:list)
			{
				bufw.write(str);
				bufw.newLine();
				bufw.flush();
			}
	        s.shutdownOutput();
	        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			//关闭流和与客户端的连接，节省资源
			try {
				if (s!=null)
				bufr.close();				
				if (bufr!=null)
				bufr.close();
				if (bufw!=null)
				bufw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}
		
	}
	
}
