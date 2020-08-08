package 建造者模式.基本代码;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: bigtalkdesignpattensourceforjava
 * @description: 产品类
 * @author: LongJiangBo
 * @create: 2020-08-06 10:54
 **/
public class Product {
    List<String> parts = new ArrayList<>();

    /**
     * @Description: 添加产品部件
     * @Author: LongJiangBo
     * @param part
     * @return: void
     * @Date: 10:56 2020/8/6
    */
    public void Add(String part){
        parts.add(part);
    }

    /**
     * @Description: 展示产品部件
     * @Author: LongJiangBo
     * @param
     * @return: void
     * @Date: 10:59 2020/8/6
    */
    public void Show(){
        System.out.println("\n产品 创建 ----");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
