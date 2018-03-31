package mail_send;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

public class mail_jframe extends mail_main {
		public static void main (String []args)throws InterruptedException{
			JFrame jframe = new JFrame("jframe");     //新建一个JFrame窗口
			jframe.setSize(500, 500);  				  //窗口大小 500*500
	        JLabel label=new JLabel("A label");		  //窗口显示
	        jframe.add(label);						  //添加进窗口
	        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //添加右上角关闭按钮
	        jframe.setVisible(true);					//可显示
	        TimeUnit.SECONDS.sleep(1);					//延时显示一秒之后
	        label.setText("Hey! this is Different!");	//更改为Hey! this is different!
	         
	        try { 										//try 抓取异常
				
			} catch (Exception e) {				
				
			}
		}
}
	
	