package com.itheima;

public class Test10 {

	/**
	 * 10�� 28������ֺȣ�3������ƿ�ǿ��Ի�һƿ���֣�
	 * ��ôҪ�����ƿ���֣���28�˺ȣ�������50�ˣ�
	 * ����Ҫ�����ƿ���֣�����д������˼·��
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(total1(28));
		System.out.println(total1(50));
		System.out.println(total2(28));
		System.out.println(total2(50));
	}

	/*1.��򵥷���������ƿ��=һƿ���֣�һƿ��������һ��ƿ�ǺͺȵĿ�����ɡ�
	 * ���Ի��㣺����ƿ��+һ��ƿ��=�ȵĿ���+һ��ƿ�ǣ����ȵĿ���=����ƿ��
	 * ���ȵĿ���ռһƿ���ֵ�����֮��
	 * 28������ֺȣ���ʵ��������28�˸��Զ��кȵĿ��֡�
	 * һ������Ҫ����֮��ƿ���֣�28���˼�28*2/3�����ΪС������ʱȡ���ڴ�С����
	 * ��С��������19
	 * 50���˼�50*2/3�����ΪС������ʱȡ���ڴ�С����
	 * ��С��������34�������ô���ʵ�֡�
	 * 
	 * 
	 */
	public static double total1(double amount)
	{	
		//����bottle������ƿ����ƿ������Ϊ�����ĸ���
		double bottle=Math.ceil(amount*2/3);
		return bottle;
	}
	/*
	 * 2.����������ķ�����ÿ������ƿ���ʹճ�����ƿ�ǣ�����ƿ�����ܻ�һƿ��
	 * �����б�ҪΪƿ�����ñ�����
	 */
	public static double total2(double amount)
	{	
		//����ƿ������bottle�͵õ���ƿ��cap������ʼֵ����0
		int bottle=0;
		int cap=0;
		//������û�ȵ����֣�ѭ���ͼ�������
		while(amount>0)
		{
			//ÿ����һƿ���֣���������ƿ��������
			bottle++;
			cap++;
			//��ƿ������3�ı���ʱ��
			if(cap==3)
			{
				//����ƿ�ǻ���һƿ���֣�һ�˺ȵ����֣����ҵõ�һ��ƿ�ǡ�
				cap=1;
				amount--;
			}
			//ÿ������֣�û�ȵ����ֵ�������һ
			amount--;
			
		}
		return bottle;
	}
}
