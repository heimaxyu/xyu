package com.itheima;

import java.io.*;

public class PictureIo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedInputStream bufr=null;
		BufferedOutputStream bops=null;
		try {
			
			bufr=new BufferedInputStream(new FileInputStream("c:\\a.jpg"));
			bops=
				new BufferedOutputStream(new FileOutputStream("d:\\a.jpg"));
				byte[] buf=new byte[1024];
				int len;
				try {
					while((len=bufr.read(buf))!=-1)
					{
						bops.write(buf,0,len);
						
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if (bufr != null)
			try {
				
					bufr.close();
			} catch(Exception e) {
				System.out.println("关闭输入流失败！");
			}
			if (bops != null)
			try {
				
					bops.close();
			} catch(Exception e){
				System.out.println("关闭输出流失败");
			}
		}
	}

}
