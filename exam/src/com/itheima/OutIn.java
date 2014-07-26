package com.itheima;

public class OutIn {

	/**
	 * @param args
	 */
	static class In
	{
		private String line="我是内部";
		public static void method()
		{
			System.out.println("实现了");
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
	private String line="我是外部";
	public static int i=3;
	static  class Ins
	{
		private String line="我是内部";
		public static void method()
		{
			System.out.println("实现了");
		}
	}


}