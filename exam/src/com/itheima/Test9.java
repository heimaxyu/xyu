package com.itheima;

public class Test9 {

	/**
	 * 9、 在一个类中编写一个方法，这个方法搜索一个
	 * 字符数组中是否存在某个字符，如果存在，则返回这个
	 * 字符在字符数组中第一次出现的位置（序号从0开始计算），
	 * 否则，返回-1。要搜索的字符数组和字符都以参数形式传递
	 * 传递给该方法，如果传入的数组为null，应抛
	 * 出IllegalArgumentException异常。在类的main方法中以各种
	 * 可能出现的情况测试验证该方法编写得是否正确，例如，字符不存在，字符
	 * 存在，传入的数组为null等。


	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义字符数组arr，存放三个字符c、a、b
		char[] arr=new char[]{'c','a','b'};
		//定义空数组brr
		char[] brr=null;
		//分别打印三种情况的值，若数组为null则报告异常
		try {
			System.out.println("第一种情况："+indexOf(arr, 'b'));
			System.out.println("第二种情况："+indexOf(arr, 'k'));
			System.out.println("第三种情况："+indexOf(brr, 'b'));
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			//数组为空：报告IllegalArgumentException异常
			e.printStackTrace();
			System.out.println("您传递了不合法参数！");
		}
	}
	public static int indexOf(char arr[],char a)
	{
		//数组为空，则抛出IllegalArgumentException异常
		if (arr==null)
			throw new IllegalArgumentException();
		//查找第一次出现时，对应的下标
		for(int i=0;i<arr.length;i++)
		{
			if(a==arr[i])
				return i;
		}
		//没有，则返回-1
		return -1;
	}

}
