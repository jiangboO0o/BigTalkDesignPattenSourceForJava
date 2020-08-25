package 观察者模式.解耦实践二;

public abstract class Subject {

    //通知者状态,java的变量默认为final或static类型，该如何定义变量
    private String SubjectState;

    //绑定观察者
    abstract void Attach(Observer observer);
    //解绑观察者
    abstract void Detach(Observer observer);
    //通知
    abstract void Notify();

    public String getSubjectState() {
        return SubjectState;
    }

    public void setSubjectState(String subjectState) {
        SubjectState = subjectState;
    }
}
