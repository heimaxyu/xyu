package com.itheima;

public class Test9 {

	/**
	 * 9�� ��һ�����б�дһ�������������������һ��
	 * �ַ��������Ƿ����ĳ���ַ���������ڣ��򷵻����
	 * �ַ����ַ������е�һ�γ��ֵ�λ�ã���Ŵ�0��ʼ���㣩��
	 * ���򣬷���-1��Ҫ�������ַ�������ַ����Բ�����ʽ����
	 * ���ݸ��÷�����������������Ϊnull��Ӧ��
	 * ��IllegalArgumentException�쳣�������main�������Ը���
	 * ���ܳ��ֵ����������֤�÷�����д���Ƿ���ȷ�����磬�ַ������ڣ��ַ�
	 * ���ڣ����������Ϊnull�ȡ�


	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����ַ�����arr����������ַ�c��a��b
		char[] arr=new char[]{'c','a','b'};
		//���������brr
		char[] brr=null;
		//�ֱ��ӡ���������ֵ��������Ϊnull�򱨸��쳣
		try {
			System.out.println("��һ�������"+indexOf(arr, 'b'));
			System.out.println("�ڶ��������"+indexOf(arr, 'k'));
			System.out.println("�����������"+indexOf(brr, 'b'));
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			//����Ϊ�գ�����IllegalArgumentException�쳣
			e.printStackTrace();
			System.out.println("�������˲��Ϸ�������");
		}
	}
	public static int indexOf(char arr[],char a)
	{
		//����Ϊ�գ����׳�IllegalArgumentException�쳣
		if (arr==null)
			throw new IllegalArgumentException();
		//���ҵ�һ�γ���ʱ����Ӧ���±�
		for(int i=0;i<arr.length;i++)
		{
			if(a==arr[i])
				return i;
		}
		//û�У��򷵻�-1
		return -1;
	}

}
