package com.itheima;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.*;
import java.text.Collator;
import java.util.*;
import java.io.*;
public class Test6_Socket {

	/**
	 * 该段代码是Test6的客户端代码
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义好字符流缓冲区以及客户端s
		BufferedReader bufr=null;
		BufferedWriter bufw=null;
		BufferedReader bufIn=null;
		Socket s=null;
		try {
			//目标是本地回环地址，端口号10020
			s=new Socket("127.0.0.1",10020);
			bufr=
				new BufferedReader(new InputStreamReader(System.in));
			bufw=
				new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			String line=null;
			//从键盘逐一输入字符串，以end结束输入
			while((line=bufr.readLine())!=null)
			{
				if("end".equals(line))
					break;
				bufw.write(line);
				bufw.newLine();
				bufw.flush();
				
				
			}
			s.shutdownOutput();
			bufIn=
				new BufferedReader(new InputStreamReader(s.getInputStream()));
			String str=null;
			//将服务端发来的信息打印出来
			while((str=bufIn.readLine())!=null)
			{
				System.out.println(str);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			//关闭资源
			try {
				if(bufr!=null)
				bufr.close();
				if(bufw!=null)
				bufw.close();
				if(bufIn!=null)
				bufIn.close();
				if(bufIn!=null)
				s.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
