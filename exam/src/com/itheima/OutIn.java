package com.itheima;

public class OutIn {

	/**
	 * @param args
	 */
	static class In
	{
		private String line="�����ڲ�";
		public static void method()
		{
			System.out.println("ʵ����");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

In.method();
Out.Ins.method();

	}

}

class Out
{
	private String line="�����ⲿ";
	public static int i=3;
	static  class Ins
	{
		private String line="�����ڲ�";
		public static void method()
		{
			System.out.println("ʵ����");
		}
	}


}