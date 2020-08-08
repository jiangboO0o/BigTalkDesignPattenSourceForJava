package 建造者模式.基本代码;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 具体建造者2
 * @author: LongJiangBo
 * @create: 2020-08-06 11:11
 **/
public class ConcreteBuilder2 extends Builder {
    private Product product = new Product();

    @Override
    public void BuildPartA() {
    product.Add("部件X");
    }

    @Override
    public void BuildPartB() {
product.Add("部件Y");
    }

    @Override
    public Product GetResult() {
        return product;
    }
}
