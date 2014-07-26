package com.itheima;


import java.io.IOException;
import java.net.*;
import java.text.Collator;
import java.util.*;
import java.io.*;
public class Test6 {

	/**
	 * 6�� ��д����ѭ�������û��Ӽ����������ַ�����
	 * ֱ�����롰end��ʱѭ������������������������ַ������ֵ�˳�����ӡ��
	 * @param args
	 */
	
	/*
	 * ���⣬�Ҳ����˿ͻ��˺ͷ���˻�������ʽ���ͻ��˴Ӽ����������ַ���
	 * �����end�������롣��������Ƚ��ͻ��˴�����ַ���һһ��ӡ����
	 * �õ��ͻ���ֹͣ�������Ϣʱ�����ͻ�������������ַ�����
	 * �ֵ�˳�����ӡ��
	 * �����Ҷ���eclipse���ģ��������ͻ��˻���̫��Ϥ
	 * ������������DOS������ʵ�ֵģ��ͻ�����Test6_Socket��ͬ��com.itheima����
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���Ƚ�һЩ�ر��ĳ�Ա�ȶ����
		Socket s=null;
		BufferedReader bufr=null;
		BufferedWriter bufw=null;
		//List�����ڴ洢�ͻ�������������ַ���
		List<String> list=new ArrayList<String>();
		try {
			ServerSocket ss=new ServerSocket(10020);
			s=ss.accept();
			//���ַ����������洢��
			bufr=
				new BufferedReader(new InputStreamReader(s.getInputStream()));
			bufw=
				new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			String line=null;
			//���տͻ���������ַ�������ӡ����ӵ�List����
			while((line=bufr.readLine())!=null)
			{
				System.out.println(line);
				list.add(line);
			}
			//�ù��������ܸ���������
			Collator cmp = Collator.getInstance(java.util.Locale.CHINA);  
	        Collections.sort(list, cmp);
	        //�������ı�������ͻ���
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
			//�ر�������ͻ��˵����ӣ���ʡ��Դ
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
