package com.itheima;

public class Test2 {

	/**
	 * 2、 自定义枚举 Week 用于表示星期，Mon,Tue，Wed...要
	 * 求每个枚举值都有toLocaleString 方法，用于获得枚举
	 * 所表示的星期的中文格式 星期一、星期二、星期三...
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//试验代码，如星期一
		System.out.println(Week.Mon.toLocaleString());
	}

}
//创建枚举Week
enum Week {
	//创建枚举对象Mon、Tue等，并覆盖toLocaleString方法
	Mon {
		@Override
		public String toLocaleString() {
			// TODO Auto-generated method stub
			return "星期一";
		}
	},Tue {
		@Override
		public String toLocaleString() {
			// TODO Auto-generated method stub
			return "星期二";
		}
	},Wed {
		@Override
		public String toLocaleString() {
			// TODO Auto-generated method stub
			return "星期三";
		}
	},Thu {
		@Override
		public String toLocaleString() {
			// TODO Auto-generated method stub
			return "星期四";
		}
	},Fri {
		@Override
		public String toLocaleString() {
			// TODO Auto-generated method stub
			return "星期五";
		}
	},Sat {
		@Override
		public String toLocaleString() {
			// TODO Auto-generated method stub
			return "星期六";
		}
	},Sun {
		@Override
		public String toLocaleString() {
			// TODO Auto-generated method stub
			return "星期日";
		}
	};
	//定义抽象方法toLocaleString()，让各个枚举值实现它，返回类型是String
	public abstract String toLocaleString();

}