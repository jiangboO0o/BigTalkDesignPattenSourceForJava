package 原型模式.简历;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 客户端代码
 * @author: LongJiangBo
 * @create: 2020-07-21 21:02
 **/
public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男", "29");
        a.setWorkExperience("1998-2000", "xx公司");

        Resume b = (Resume)a.resumeClone();
        b.setWorkExperience("1998-2006", "YY企业");

        Resume c = (Resume)a.resumeClone();
        c.setPersonalInfo("男", "24");

        a.display();
        b.display();
        c.display();
    }
}
