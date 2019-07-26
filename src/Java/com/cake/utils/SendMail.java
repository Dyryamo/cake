package com.cake.utils;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;


public class SendMail {
    private String text;

    public String getText() {
        return text;
    }

    public SendMail() {
        text = "";
        for(int i=0; i<4; i++){
            text += ((int)(Math.random() * 987) % 10);
        }
    }

    public void SendYourMail(String address) throws AddressException, MessagingException{
        /**
         * 创建连接
         */
        Properties properties = new Properties();
        properties.setProperty("mail.host", "smtp.163.com");
        properties.setProperty("mail.smtp.auth", "true");// 制定验证为True 是否需要身份验证
        properties.setProperty("mail.transport.protocol", "SMTP");
        // 如果使用ssl，则去掉使用25端口的配置，进行如下配置,
        properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.port", "465");

        Authenticator auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication("SZMT_TEAM", "szmt317");
                // 这个szmt317 不是我163的密码 而是我的
            }
        };
        Session session = Session.getInstance(properties, auth);

        // 编辑邮件

        MimeMessage msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress("SZMT_TEAM@163.com"));		//设置发件人
        msg.setRecipients(RecipientType.TO, address);	//设置收件人，正常发送
//        msg.setRecipients(RecipientType.CC, address);	//设置收件人，抄送（即再发送一份样的）
//        msg.setRecipients(RecipientType.BCC, address);	//设置收件人，暗送

        msg.setSubject("Cake蛋糕工坊提醒，您的条件已初步符合注册的申请要求"); // 邮件的标题
        msg.setContent("你的验证码是 <b>"+ text +"</b> \n" +
                "请勿将验证码告诉其他人，保护自己账户安全。\n" , "text/html;charset=utf-8");	//邮件内容

        // 发送邮件
        Transport.send(msg);
        System.out.println("发送成功");

    }
}
