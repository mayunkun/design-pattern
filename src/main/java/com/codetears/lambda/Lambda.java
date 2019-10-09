package com.codetears.lambda;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description: TODO
 * @Author mayunkun
 * @Date 2019-08-26
 * @Version V1.0
 **/
public class Lambda {

    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<Apple>();//存放apple对象集合

        Apple apple1 = new Apple(1, "苹果1", new BigDecimal("3.25"), 10);
        Apple apple12 = new Apple(1, "苹果2", new BigDecimal("1.35"), 20);
        Apple apple2 = new Apple(2, "香蕉", new BigDecimal("2.89"), 30);
        Apple apple3 = new Apple(3, "荔枝", new BigDecimal("9.99"), 40);
        appleList.add(apple1);
        appleList.add(apple12);
        appleList.add(apple2);
        appleList.add(apple3);


        // 分组
        Map<Integer, List<Apple>> group = appleList.stream().collect(Collectors.groupingBy(Apple::getId));

        //
        Map<Integer, Apple> map = appleList.stream().collect(Collectors.toMap(Apple::getId, a -> a, (k1, k2) -> k2));


        Map<Integer, Apple> map1 = appleList.stream().filter(a -> "香蕉".equals(a.getName())).collect(Collectors.toMap(Apple::getId, a -> a, (k1, k2) -> k2));

        Apple apple = appleList.stream().max(Comparator.comparingInt(Apple::getId)).get();

        int a[] = {10, 5, 8};

        int min = Arrays.stream(a).min().getAsInt();
        System.out.println(min);

        System.out.println(JSONObject.toJSONString(apple));
    }
}

@Data
class Apple {
    private Integer id;
    private String name;
    private BigDecimal money;
    private Integer num;

    public Apple(Integer id, String name, BigDecimal money, Integer num) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.num = num;
    }
}
