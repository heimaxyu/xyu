package com.itheima;

public class Test7 {

	/**
	 * 7�� �������³������н����˵��ԭ��(û�з���������÷�)

 
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
		//������MyThread�Ķ���t
		MyThread t = new MyThread();
		//���ö���t��run����
	    t.run();
	    //MyThread��̳�Thread�࣬�˿̵��õ��Ǵ�Thread��̳е�start����
	    //start�����ڲ�����run����������Ϊ�̣߳�������������CPU��Դ
	    t.start();
	    //��ӡA
	    System.out.println("A");
	}

}

//Mythread��̳�Thread��
class MyThread extends Thread {
	//run����
    public void run() {
        try {
        	//�ȴ�3000���뼴3��
            Thread.sleep(3000);
            } catch (InterruptedException e) {
         }
            //��ӡB
        System.out.println("B");
        }
}
/* B
 * A
 * B
 * ����Ϊ��ӡ������ӽ����ʼ������ִ�к���΢�ȴ���һ�£�Ȼ���ӡ�������B��A,
 * Ȼ������΢�ȴ���һ�£��ٴγ���B��
 * ��һ��B�����������ڵ���t��run�������ڷ����ڲ�ִ��Thread.sleep(3000)
 * �ȴ�3�����ִ�����System.out.println("B");����ӡ��B��
 * Ȼ��ص��������������߳�t.start();��������������������������ͬ����CPU��Դ��
 * 1.�������̻߳����Դ�������ڲ�run������Thread.sleep(3000)��䣬sleep������
 * �ͷ���Դ�����������CPUִ��Ȩ����ӡ������������һ��ִ�����
 * System.out.println("A")����ӡA�����������߳�Ҳ��˯��3���������ӡB��
 * 2.���������������Դ������һ������ӡA��������Ȼ��t�߳�ִ�У���ӡB��
 * ���Խ��Ϊ
 * B
 * A
 * B
 * 
 */
