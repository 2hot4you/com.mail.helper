package mail_send;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

public class mail_jframe extends mail_main {
		public static void main (String []args)throws InterruptedException{
			JFrame jframe = new JFrame("jframe");     //�½�һ��JFrame����
			jframe.setSize(500, 500);  				  //���ڴ�С 500*500
	        JLabel label=new JLabel("A label");		  //������ʾ
	        jframe.add(label);						  //��ӽ�����
	        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������Ͻǹرհ�ť
	        jframe.setVisible(true);					//����ʾ
	        TimeUnit.SECONDS.sleep(1);					//��ʱ��ʾһ��֮��
	        label.setText("Hey! this is Different!");	//����ΪHey! this is different!
	         
	        try { 										//try ץȡ�쳣
				
			} catch (Exception e) {				
				
			}
		}
}
	
	