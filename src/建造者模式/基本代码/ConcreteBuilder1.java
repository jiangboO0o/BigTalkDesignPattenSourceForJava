package 建造者模式.基本代码;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 建造者1
 * @author: LongJiangBo
 * @create: 2020-08-06 11:08
 **/
public class ConcreteBuilder1 extends Builder {
    private Product product = new Product();
    @Override
    public void BuildPartA() {
        product.Add("部件A");
    }

    @Override
    public void BuildPartB() {
        product.Add("部件B");
    }

    @Override
    public Product GetResult() {
        return product;
    }
}
