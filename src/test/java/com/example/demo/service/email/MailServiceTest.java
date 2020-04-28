package com.example.demo.service.email;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2020/4/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {

    @Autowired
    private MailService mailService;

    @Test
    public void testSimpleMail() throws Exception {
        //TODO 请设置正确的邮箱地址
        mailService.sendSimpleMail("1320593779@qq.com","test simple mail"," hello this is simple mail");
    }

    @Test
    public void testHtmlMail() throws Exception {
        String content="<html>\n" +
                "<body>\n" +
                "    <h1>hello world ! 这是一封Html邮件!</h1>\n" +
                "    <h2>hello world ! 这是一封Html邮件!</h2>\n" +
                "    <h3>hello world ! 这是一封Html邮件!</h3>\n" +
                "</body>\n" +
                "</html>";
        //TODO 请设置正确的邮箱地址
        mailService.sendHtmlMail("1320593779@qq.com","test simple mail",content);
    }

    @Test
    public void sendAttachmentsMail() {
        //TODO 请设置正确的文件路径
        String filePath="E:\\weixin\\file2test.txt";
        //TODO 请设置正确的邮箱地址
        mailService.sendAttachmentsMail("1320593779@qq.com", "主题：带附件的邮件", "有附件，请查收！", filePath);
    }

    @Test
    public void sendInlineResourceMail() {
        String rscId = "neo006";
        String content="<html><body>这是有图片的邮件：<img src=\'cid:" + rscId + "\' ></body></html>";
        //TODO 请设置正确的文件路径
        String imgPath = "E:\\weixin\\ydyw.png";

        //TODO 请设置正确的邮箱地址
        mailService.sendInlineResourceMail("1320593779@qq.com", "主题：这是有图片的邮件", content, imgPath, rscId);
    }
}
