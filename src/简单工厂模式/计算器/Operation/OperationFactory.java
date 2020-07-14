package 简单工厂模式.计算器.Operation;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 简单运算工厂类
 * @author: LongJiangBo
 * @create: 2020-05-21 11:00
 **/
public class OperationFactory {
    public static Operation createOperate(String operate) {
        Operation operation = null;
        switch (operate)
        {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                break;
        }
        return operation;
    }

    public static void main(String[] args) {
        Operation operation;
        operation = createOperate("+");
        operation.setNumberA(1);
        operation.setNumberB(2);
        double result = operation.getResult();
        System.out.println(result);
    }
}
