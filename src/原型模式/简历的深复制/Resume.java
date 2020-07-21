package 原型模式.简历的深复制;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 简历类
 * @author: LongJiangBo
 * @create: 2020-07-21 22:05
 **/
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private WorkExperience work;

    public Resume(String name){
        this.name = name;
        work = new WorkExperience();
    }

    private Resume(WorkExperience work) throws CloneNotSupportedException {
        this.work = (WorkExperience)work.workExperienceClone();
    }

    //设置个人信息
    public void setPersonalInfo(String sex, String age){
        this.sex = sex;
        this.age = age;
    }

    //设置工作经历
    public void setWorkExperience(String workDate, String company){
        work.setWorkDate(workDate);
        work.setConpany(company);
    }

    //显示
    public void display(){
        System.out.printf("%s %s %s", name, sex, age);
        System.out.println();
        System.out.printf("工作经历：%s %s", work.getWorkDate(), work.getConpany());
        System.out.println();
    }

    public Object resumeClone() throws CloneNotSupportedException {
        Resume obj = new Resume(this.work);
        obj.name = this.name;
        obj.sex = this.sex;
        obj.age = this.age;
        return obj;
    }
}
