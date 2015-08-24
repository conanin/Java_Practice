/**
 * 
 */
package com.alf.str;

import java.util.Date;  
import java.util.Properties;  
import javax.mail.Message.RecipientType;  
import javax.mail.Message;  
import javax.mail.MessagingException;  
import javax.mail.Session;  
import javax.mail.Transport;  
import javax.mail.internet.AddressException;  
import javax.mail.internet.InternetAddress;  
import javax.mail.internet.MimeMessage;  
import javax.naming.NamingException;  
import javax.naming.directory.Attributes;  
import javax.naming.directory.DirContext;  
import javax.naming.directory.InitialDirContext;  

public class Javamailtest {  
     public static String  getSMTPHost(String domain,String dnsServer) throws NamingException{  
          DirContext ctx=new InitialDirContext();  
          Attributes mxAttrs=null;  
          if(null != dnsServer){  
              mxAttrs=ctx.getAttributes("dns://" + dnsServer+"/"+domain,new String[]{"MX"});  
          }else{  
              mxAttrs=ctx.getAttributes("dns:/"+domain,new String[]{"MX"});  
          }  
            
          String mx=(String) mxAttrs.get("MX").get();  
          String smtpServerName=mx.substring(mx.indexOf(" ")+1);  
          return smtpServerName;  
     }  
      
     private static Message getMessage(Session session) throws AddressException, MessagingException{  
          String from="Qing-Wen.Han@hp.com";  
          String subject="hello,JavaMail";  
          String content="Amaing Java Mail";  
            
          MimeMessage msg=new MimeMessage(session);  
          msg.setFrom(new InternetAddress(from));  
          msg.setSubject(subject);  
          msg.setText(content);  
          msg.setSentDate(new Date()); 
           
          return msg;  
     }  
       
     private static Session getSession(){  
          Properties props=new Properties();  
          //设置ehlo命令中的主机名,若检测到主机名与其IP地址一致，则认为这时的发送方是SMTP服务器，就不需要验证;否则就是邮件客户端软件，则需要验证。  
          //props.put("mail.smtp.localhost", "smtp3.hp.com");  
          props.put("mail.smtp.host", "smtp3.hp.com");
          props.put("mail.smtp.auth", "false");   
          props.put("mail.smtp.port", "25");   
          Session session=Session.getDefaultInstance(props);  
          session.setDebug(true);  
          return session;  
     }  
       
    @SuppressWarnings("static-access")  
     private static void sendEmail(Message message,Session session,String to)   
       throws AddressException, MessagingException, NamingException{  
          message.setRecipients(RecipientType.TO, InternetAddress.parse(to));  
          message.saveChanges();  
            
          Transport transport=session.getTransport("smtp");  
            
          String domain=to.substring(to.indexOf("@")+1);  
          String host=getSMTPHost(domain,null);  
           
          transport.connect(host, null, null);  
          transport.send(message, message.getRecipients(Message.RecipientType.TO));  
            
          transport.close();  
     }  
      
     public static void main(String []args)   
      throws AddressException, MessagingException, NamingException{  
          String []to=new String[]{"gang.yin@hp.com"};  
          Session session=getSession();  
          Message msg=getMessage(session);  
          for(String email:to){  
              sendEmail(msg,session,email);  
          }  
     }  
} 

