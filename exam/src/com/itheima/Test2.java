package com.itheima;

public class Test2 {

	/**
	 * 2�� �Զ���ö�� Week ���ڱ�ʾ���ڣ�Mon,Tue��Wed...Ҫ
	 * ��ÿ��ö��ֵ����toLocaleString ���������ڻ��ö��
	 * ����ʾ�����ڵ����ĸ�ʽ ����һ�����ڶ���������...
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������룬������һ
		System.out.println(Week.Mon.toLocaleString());
	}

}
//����ö��Week
enum Week {
	//����ö�ٶ���Mon��Tue�ȣ�������toLocaleString����
	Mon {
		@Override
		public String toLocaleString() {
			// TODO Auto-generated method stub
			return "����һ";
		}
	},Tue {
		@Override
		public String toLocaleString() {
			// TODO Auto-generated method stub
			return "���ڶ�";
		}
	},Wed {
		@Override
		public String toLocaleString() {
			// TODO Auto-generated method stub
			return "������";
		}
	},Thu {
		@Override
		public String toLocaleString() {
			// TODO Auto-generated method stub
			return "������";
		}
	},Fri {
		@Override
		public String toLocaleString() {
			// TODO Auto-generated method stub
			return "������";
		}
	},Sat {
		@Override
		public String toLocaleString() {
			// TODO Auto-generated method stub
			return "������";
		}
	},Sun {
		@Override
		public String toLocaleString() {
			// TODO Auto-generated method stub
			return "������";
		}
	};
	//������󷽷�toLocaleString()���ø���ö��ֵʵ����������������String
	public abstract String toLocaleString();

}