package mail_send;

import java.util.Date;
import java.util.Properties;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.search.ReceivedDateTerm;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

class mail_smtp extends mail_main {

	public static void main(String[] args)throws Exception{
		  File file = new File(fileName);
		BufferedReader reader = null;
		try{
			System.out.println("以行为单位读取文件内容，一次读取一整行");
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			int line = 1; //一次读取一整行 直到null结束
			while((tempString = reader.readLine())!=null){
				System.out.println("line"+line+":"+tempString);
				line++;
				mail_main.sendEmailAdress = "admin@pangmaomi.info";
				mail_main.pwd = "dfwrestbfieqbcij";
				mail_main.smtpIP = "smtp.qq.com";
				mail_main.port   = "465";
				mail_main.receiveEmailAdress = tempString;
			    Properties props = new Properties();                    // 参数配置
		        props.setProperty("mail.transport.protocol", "smtp");   // 使用的协议（JavaMail规范要求）
		        props.setProperty("mail.smtp.host", smtpIP);   // 发件人的邮箱的 SMTP 服务器地址
		        props.setProperty("mail.smtp.auth", "true");            // 需要请求认证
		        props.setProperty("mail.smtp.port", port);
		        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		        props.setProperty("mail.smtp.socketFactory.fallback", "false");
		        props.setProperty("mail.smtp.socketFactory.port", port);
		        Session session = Session.getInstance(props);
		        session.setDebug(true);
		        MimeMessage message = createMimeMessage(session , sendEmailAdress , receiveEmailAdress);
		        Transport transport = session.getTransport();
		        transport.connect(sendEmailAdress,pwd);
		        transport.sendMessage(message, message.getAllRecipients());
		        transport.close();
			}
			reader.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally {
			if(reader != null){
				try {
					reader.close();
				} catch (IOException e1) {
					
				}
			}
		}
	}


	private static MimeMessage createMimeMessage(Session session, String sendEmailAdress, String receiveEmailAdress)throws Exception{
		 MimeMessage message = new MimeMessage(session);
		 message.setFrom(new InternetAddress(sendEmailAdress, "PUBG_HELP", "UTF-8"));
		 message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(receiveEmailAdress, "XX用户", "UTF-8"));
		 message.setSubject("PUBG_HELP", "UTF-8");
		 message.setContent("PUBG_WG QQ群：660582968", "text/html;charset=UTF-8");
		 message.setSentDate(new Date());

	        // 7. 保存设置
	        message.saveChanges();
		 
		 return message;
	}
	}
	

