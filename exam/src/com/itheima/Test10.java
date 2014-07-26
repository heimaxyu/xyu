package com.itheima;

public class Test10 {

	/**
	 * 10、 28人买可乐喝，3个可乐瓶盖可以换一瓶可乐，
	 * 那么要买多少瓶可乐，够28人喝？假如是50人，
	 * 又需要买多少瓶可乐？（需写出分析思路）
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(total1(28));
		System.out.println(total1(50));
		System.out.println(total2(28));
		System.out.println(total2(50));
	}

	/*1.最简单方法：三个瓶盖=一瓶可乐，一瓶可乐又由一个瓶盖和喝的可乐组成。
	 * 可以换算：两个瓶盖+一个瓶盖=喝的可乐+一个瓶盖，即喝的可乐=两个瓶盖
	 * 即喝的可乐占一瓶可乐的三分之二
	 * 28人买可乐喝，其实就是满足28人各自都有喝的可乐。
	 * 一个人需要三分之二瓶可乐，28个人即28*2/3，结果为小数，这时取大于此小数的
	 * 最小整数，即19
	 * 50个人即50*2/3，结果为小数，这时取大于此小数的
	 * 最小整数，即34，下面用代码实现。
	 * 
	 * 
	 */
	public static double total1(double amount)
	{	
		//定义bottle来计算瓶数，瓶数必须为完整的个数
		double bottle=Math.ceil(amount*2/3);
		return bottle;
	}
	/*
	 * 2.按步骤分析的方法，每当买三瓶，就凑出三个瓶盖，三个瓶盖又能换一瓶。
	 * 这里有必要为瓶盖设置变量。
	 */
	public static double total2(double amount)
	{	
		//定义瓶子数量bottle和得到的瓶盖cap，并初始值设置0
		int bottle=0;
		int cap=0;
		//当有人没喝到可乐，循环就继续进行
		while(amount>0)
		{
			//每次买一瓶可乐，可乐数和瓶盖数自增
			bottle++;
			cap++;
			//当瓶盖数是3的倍数时，
			if(cap==3)
			{
				//三个瓶盖换了一瓶可乐，一人喝到可乐，并且得到一个瓶盖。
				cap=1;
				amount--;
			}
			//每次买可乐，没喝到可乐的人数减一
			amount--;
			
		}
		return bottle;
	}
}
