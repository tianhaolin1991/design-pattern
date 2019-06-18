package com.designPattern.create.prototype.clone;

import java.text.MessageFormat;

/**这个工具类用来发送邮件,和存储发送记录
 * @author:tianhaolin
 * @version:1.0
 */
public class MailUtil {
    public static void senMail(Mail mail){
        String outputContent = "向{0}同学发送邮件成功,邮件地址:{1},邮件内容:{2}";
        System.out.println(MessageFormat.format(outputContent,mail.getName(),mail.getEmailAddress(),mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail){
        System.out.println("存储OriginMail记录:"+mail.getName()+mail.getEmailAddress()+mail.getContent());
    }
}
