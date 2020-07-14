package 策略模式.Cash;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 现金收费工厂类
 * @author: LongJiangBo
 * @create: 2020-05-26 10:26
 **/
public class CashFactory {
    public static CashSuper createCashAccept(String type){
        CashSuper cs = null;
        switch (type){
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300返100":
                CashReturn cashReturn = new CashReturn("300","100");
                cs = cashReturn;
                break;
            case "打8折":
                CashRebate cashRebate = new CashRebate("0.8");
                cs = cashRebate;
                break;
            default:
                break;
        }
        return cs;
    }
}
