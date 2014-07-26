package com.itheima;
import java.io.*;
public class Test5 {

	/**
	 * 5、 已知文件a.txt文件中的内容为“bcdeadferwplkou”，
	 * 请编写程序读取该文件内容，并按照自然顺序排序后输出到b.txt文件中。
	 * 即b.txt中的文件内容应为“abcd…………..”这样的顺序。


	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义字符输入流和字符输出流的缓冲区
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			//从a.txt中读入字符，目标是b.txt，源和目标都是文本文件
			br=new BufferedReader(new FileReader("F://netlesson//a.txt"));
			bw=new BufferedWriter(new FileWriter("F://netlesson//b.txt"));
			try {
				//定义数组buf
				char[] buf=new char[100];
				//将字符输入流读入buf，并返回读入字符数num
				int num=br.read(buf);
				//对数组进行冒泡排序
				bubbleSort(buf,num);
				//输出到b.txt
				bw.write(buf,0,num);						
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("此文件不存在！");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				//倘若目标文件不存在，为null时，无法执行close方法
				if(br!=null)
				br.close();				
				if(bw!=null)
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	//传入数组和数组有效长度，进行冒泡排序
	public static void bubbleSort(char[] arr,int num)
	{
		char a;
		for(int i=0;i<num;num--)
		{
			for(int x=0;x<num-1;x++)
			if(arr[x]>arr[x+1])
			{
				a=arr[x];
				arr[x]=arr[x+1];
				arr[x+1]=a;
	
			}
		}
		
	}

}
