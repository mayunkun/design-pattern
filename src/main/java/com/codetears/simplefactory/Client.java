package com.codetears.simplefactory;

import java.util.Scanner;

/**
 * @Description 工厂模式测试
 * @Date 2019-05-13 10:27
 * @Author l'amour solitaire
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("请输入数字A");
        Scanner a = new Scanner(System.in);
        Double numa = a.nextDouble();
        System.out.println("请输入数字B");
        Scanner b = new Scanner(System.in);
        Double numb = b.nextDouble();
        System.out.println("请输入运算操作");
        Scanner operation = new Scanner(System.in);
        System.out.println("运算结果为： " + OperationFactory.operation.apply(numa, numb, operation.nextLine()).doOperation());
    }
}
