package 策略模式.Cash;

import java.math.BigDecimal;

/**
 * @program: BigTalkDesignPattenSourceTest
 * @description: 现金收费抽象类
 * @author: LongJiangBo
 * @create: 2020-05-25 17:25
 **/
public abstract class CashSuper {
    /**
     * @Description: 现金收取超类的抽象方法，收取现金，参数为原价，返回为当前价
     * @Author: LongJiangBo
     * @param money
     * @return:
     * @Date: 17:37 2020/5/25
    */
    public abstract BigDecimal acceptCash(BigDecimal money);
}
