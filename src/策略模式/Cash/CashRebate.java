package 策略模式.Cash;

import java.math.BigDecimal;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 打折收费子类
 * @author: LongJiangBo
 * @create: 2020-05-25 17:39
 **/
public class CashRebate extends CashSuper {

    private BigDecimal moneyRebate = new BigDecimal("1");

    public CashRebate(String moneyRebate){
        this.moneyRebate = new BigDecimal(moneyRebate);
    }
    @Override
    public BigDecimal acceptCash(BigDecimal money) {
        return money.multiply(moneyRebate);
    }
}
