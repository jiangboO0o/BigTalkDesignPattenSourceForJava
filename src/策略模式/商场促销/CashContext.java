package 策略模式.商场促销;

import 策略模式.Cash.CashNormal;
import 策略模式.Cash.CashRebate;
import 策略模式.Cash.CashReturn;
import 策略模式.Cash.CashSuper;

import java.math.BigDecimal;

/**
 * @program: BigTalkDesignPattenSourceTest
 * @description: 策略与简单工厂结合
 * @author: LongJiangBo
 * @create: 2020-05-26 18:03
 **/
public class CashContext {
    CashSuper cashSuper = null;

    public CashContext(String type){
        switch (type){
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满300返100":
                CashReturn cashReturn = new CashReturn("300","100");
                cashReturn = cashReturn;
                break;
            case "打8折":
                CashRebate cashRebate = new CashRebate("0.8");
                cashSuper = cashRebate;
                break;
            default:
                break;
        }
    }

    public BigDecimal GetResult(BigDecimal money){
        return cashSuper.acceptCash(money);
    }
}
