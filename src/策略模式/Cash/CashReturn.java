package 策略模式.Cash;

import java.math.BigDecimal;

/**
 * @program: BigTalkDesignPattenSourceTest
 * @description: 返利收费子类
 * @author: LongJiangBo
 * @create: 2020-05-25 17:55
 **/
public class CashReturn extends CashSuper {

    //返利条件
    private BigDecimal moneyCondition = new BigDecimal("0.0");

    //返利值
    private BigDecimal moneyReturn = new BigDecimal("0.0");

    /**
     * @Description: 返利收费，初始化时必须要输入返利条件和返利值，比如满300返100，则moneyCondition为300，moneyReturn为100
     * @Author: LongJiangBo
     * @param moneyCondition
     * @param moneyReturn
     * @return:
     * @Date: 9:59 2020/5/26
    */
    public CashReturn (String moneyCondition,String moneyReturn){
        this.moneyCondition = new BigDecimal(moneyCondition);
        this.moneyReturn = new BigDecimal(moneyReturn);
    }

    @Override
    public BigDecimal acceptCash(BigDecimal money) {
        BigDecimal result = money;
        //若大于返利条件，则需要减去返利值
        if (money.compareTo(moneyCondition) == 0 || money.compareTo(moneyCondition) == 1){
            result = money.subtract(money.divide(moneyCondition,BigDecimal.ROUND_DOWN).multiply(moneyReturn));
        }
        return result;
    }
}
