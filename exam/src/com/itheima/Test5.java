package com.itheima;
import java.io.*;
public class Test5 {

	/**
	 * 5�� ��֪�ļ�a.txt�ļ��е�����Ϊ��bcdeadferwplkou����
	 * ���д�����ȡ���ļ����ݣ���������Ȼ˳������������b.txt�ļ��С�
	 * ��b.txt�е��ļ�����ӦΪ��abcd��������..��������˳��


	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����ַ����������ַ�������Ļ�����
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			//��a.txt�ж����ַ���Ŀ����b.txt��Դ��Ŀ�궼���ı��ļ�
			br=new BufferedReader(new FileReader("F://netlesson//a.txt"));
			bw=new BufferedWriter(new FileWriter("F://netlesson//b.txt"));
			try {
				//��������buf
				char[] buf=new char[100];
				//���ַ�����������buf�������ض����ַ���num
				int num=br.read(buf);
				//���������ð������
				bubbleSort(buf,num);
				//�����b.txt
				bw.write(buf,0,num);						
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("���ļ������ڣ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				//����Ŀ���ļ������ڣ�Ϊnullʱ���޷�ִ��close����
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
	//���������������Ч���ȣ�����ð������
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
