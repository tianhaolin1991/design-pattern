package com.designPattern.create.prototype.clone;

/**假设我们每发送一个邮件都需要使用新的对象(模拟业务场景)
 * 而new Mail是一个非常消耗资源的事
 * saveOriginMailRecord必须放在最后(模拟业务场景)记录原始的mail
 * @author:tianhaolin
 * @version:1.0
 */
public class Test {
    public static void main(String[] args) {
        Mail originMail = new Mail();
        originMail.setContent("初始化模板");
        for (int i = 0; i < 10; i++) {
            Mail mail = new Mail();
            mail.setName("姓名"+i);
            mail.setEmailAddress("姓名"+i+"@imooc.com");
            mail.setContent("恭喜您,此次慕课网活动中奖了");
            MailUtil.senMail(mail);
        }
        MailUtil.saveOriginMailRecord(originMail);

    }
}
