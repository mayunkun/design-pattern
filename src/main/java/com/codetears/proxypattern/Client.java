package com.codetears.proxypattern;

/**
 * @Description 代理测试
 * @Date 2019-05-13 10:27
 * @Author l'amour solitaire
 */
public class Client {

    public static void main(String[] args) {
        XiaoMei xiaoMei = new XiaoMei("小梅", 18);
        XiaoWang xiaoWang = new XiaoWang(xiaoMei);
        xiaoWang.sendFlowers();
        xiaoWang.sendChocolate();
    }
}
