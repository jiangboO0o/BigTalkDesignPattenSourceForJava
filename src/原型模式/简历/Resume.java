package 原型模式.简历;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 简历类
 * @author: LongJiangBo
 * @create: 2020-07-16 21:46
 **/
public class Resume implements Cloneable{
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resume(String name){
        this.name = name;
    }

    //设置个人信息
    public void setPersonalInfo(String sex,String age){
        this.sex = sex;
        this.age = age;
    }

    //设置工作经历
    public void setWorkExperience(String timeArea,String company){
        this.timeArea = timeArea;
        this.company = company;
    }

    //显示
    public void display(){
        System.out.printf("%s %s %s", name, sex, age);
        System.out.println();
        System.out.printf("工作经历： %s %s", timeArea, company);
        System.out.println();
    }

    public Object resumeClone() throws CloneNotSupportedException {
        return this.clone();
    }
}
