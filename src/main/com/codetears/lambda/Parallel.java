package com.codetears.lambda;

import io.vavr.Function1;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.Optional;
import java.util.Random;

/**
 * @author l'amour solitaire
 * @description TODO
 * @date 2019/10/8 下午2:51
 */
public class Parallel {


    public static void main(String[] args) {
        Function1<String, String> function1 = (k) -> {
            int i = new Random().nextInt(10000);
            System.out.println(k + " 休眠 " + i);
            try {
                Thread.sleep(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return " k >>> " + i;
        };
        String[] names = {"张云", "张飞", "马超"};
//        Arrays.stream(names).parallel().forEach((k) -> {
//            System.out.println(function1.apply(k));
//        });

        Optional<String> result = Arrays.stream(names).parallel().map((k) -> {
            String temp = function1.apply(k);
            System.out.println(temp);
            return temp;
        }).findAny();
        System.out.println(result.get());
    }
}


