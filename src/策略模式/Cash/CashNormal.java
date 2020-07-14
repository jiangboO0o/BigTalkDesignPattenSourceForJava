package 策略模式.Cash;

import java.math.BigDecimal;

/**
 * @program: BigTalkDesignPattenSourceTest
 * @description: 正常收费子类
 * @author: LongJiangBo
 * @create: 2020-05-25 17:38
 **/
public class CashNormal extends CashSuper {
    /**
     * @Description: 正常收费，原价返回
     * @Author: LongJiangBo
     * @param money
     * @return: Bigdecimal
     * @Date: 17:39 2020/5/25
    */
    @Override
    public BigDecimal acceptCash(BigDecimal money) {
        return money;
    }
}
