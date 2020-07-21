package 原型模式.简历的深复制;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 工作经历类
 * @author: LongJiangBo
 * @create: 2020-07-21 22:00
 **/
public class WorkExperience implements Cloneable {
    private String workDate;

    private String conpany;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getConpany() {
        return conpany;
    }

    public void setConpany(String conpany) {
        this.conpany = conpany;
    }

    public Object workExperienceClone() throws CloneNotSupportedException {
        return this.clone();
    }
}
