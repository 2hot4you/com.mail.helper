package mail_send;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.sound.midi.Receiver;
import java.util.Date;
import java.util.Properties;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
public class mail_main {
	
	public static String receiveEmailAdress;//接收邮件的邮箱地址
	public static String sendEmailAdress;//发送邮件的邮箱地址
	public static String smtpIP; //邮箱IP地址
	public static String user; //发件人
	public static String pwd;//邮箱密码 （授权码）
	public static String content;//邮件正文
	public static String port;	//邮箱端口
	public static String str;  //输出流
	public static String str1; //输出流1
	public static String fileName = "C://Users//Pangmaomi//Desktop//1.txt"; //需要读取邮件地址的txt文件地址
}

