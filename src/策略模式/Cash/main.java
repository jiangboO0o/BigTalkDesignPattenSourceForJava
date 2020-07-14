package 策略模式.Cash;

import java.math.BigDecimal;

/**
 * @program: BigTalkDesignPattenSourceTest
 * @description: 客户端程序
 * @author: LongJiangBo
 * @create: 2020-05-26 10:38
 **/
public class main {
    BigDecimal total = new BigDecimal("0");
    private BigDecimal buttonOkClick(BigDecimal money){
        CashSuper cashSuper = CashFactory.createCashAccept("");
        BigDecimal totalPrices = cashSuper.acceptCash(money);
        total = total.add(totalPrices);
        return total;
    }
}
