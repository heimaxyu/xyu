package com.itheima;

public class Test7 {

	/**
	 * 7、 分析以下程序运行结果，说明原理。(没有分析结果不得分)

 
    public class ThreadTest {
        public static void main(String args[]) {
        MyThread t = new MyThread();
        t.run();
        t.start();
        System.out.println("A");
        }
    }
 
    class MyThread extends Thread {
        public void run() {
            try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
             }
            System.out.println("B");
            }
    }

	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建了MyThread的对象t
		MyThread t = new MyThread();
		//调用对象t的run方法
	    t.run();
	    //MyThread类继承Thread类，此刻调用的是从Thread类继承的start方法
	    //start方法内部调用run方法，并成为线程，和主函数竞争CPU资源
	    t.start();
	    //打印A
	    System.out.println("A");
	}

}

//Mythread类继承Thread类
class MyThread extends Thread {
	//run方法
    public void run() {
        try {
        	//等待3000毫秒即3秒
            Thread.sleep(3000);
            } catch (InterruptedException e) {
         }
            //打印B
        System.out.println("B");
        }
}
/* B
 * A
 * B
 * 如上为打印结果。从结果开始分析，执行后稍微等待了一下，然后打印结果出现B、A,
 * 然后又稍微等待了一下，再次出现B。
 * 第一个B，是主函数在调用t的run方法，在方法内部执行Thread.sleep(3000)
 * 等待3秒后，在执行语句System.out.println("B");，打印出B。
 * 然后回到主函数，开启线程t.start();它已脱离主函数，与主函数共同竞争CPU资源。
 * 1.假若该线程获得资源，调用内部run方法的Thread.sleep(3000)语句，sleep方法会
 * 释放资源，主函数获得CPU执行权，打印主函数体的最后一条执行语句
 * System.out.println("A")，打印A。最后结束，线程也在睡眠3秒后，醒来打印B。
 * 2.假若主函数获得资源，如上一样，打印A，结束。然后t线程执行，打印B。
 * 所以结果为
 * B
 * A
 * B
 * 
 */
