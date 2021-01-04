package 观察者模式.模板;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 主题主题类或者具体通知者类
 * 将有关状态存入具体观察者对象；在具体主题的内部状态改变时，给所有登记过的观察者发出通知。具体主题角色通常用一个具体子类实现
 * @author: Mr.Wang
 * @create: 2020-08-15 15:59
 **/
public class ConcreteSubject extends Subject {
    //具体观察者状态
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
