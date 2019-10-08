package com.codetears.lambda;

import io.vavr.*;
import io.vavr.API.Match;
import io.vavr.control.Option;
import io.vavr.control.Try;
import lombok.Data;

import java.util.Comparator;

import static io.vavr.API.*;


/**
 * @Description: TODO
 * @Author mayunkun
 * @Date 2019-08-27
 * @Version V1.0
 **/
public class Vavrs {

    public static void main(String[] args) {

        /**
         * @Description:
         *      Option的主要目标是通过利用Java类型系统来消除代码中的空值检查
         *      不建议直接使用对象值，而是将它们包装在Option实例中
         * @Author: l'amour solitaire
         * @Date: 2019-08-27 14:23
         */
        People people = new People();
        people.setName("张飞");
        System.out.println(Option.of(people.getName()).getOrElse("123"));

        /**
         * @Description: 元组数据
         * @Author: l'amour solitaire
         * @Date: 2019-08-27 14:52
         */
//        Tuple3<String, Integer, Long> tt = new Tuple3<>("123", 45, Long.valueOf("67"));
//        String s = tt._1;
//        Integer s1 = tt._2;
//        Long s2 = tt._3;
//        System.out.println(s);
//        System.out.println(s1);
//        System.out.println(s2);
//        tt.append("123");
//        System.out.println(tt.);

//        Tuple2<String, Integer> tuple2 = Tuple.of("Hello", 100);
//        Tuple2<String, Integer> updatedTuple2 = tuple2.map(String::toUpperCase, v -> v * 5);
//        String result = updatedTuple2.apply((str, number) -> String.join(", ",
//                str, number.toString()));
//        System.out.println(result);


        /**
         * @Description: Try
         * @Author: l'amour solitaire
         * @Date: 2019-08-27 15:02
         */
//        People people = new People();
//        people.setName("赵云");
//        Try<People> result = Try.of(() -> {
//            People people1 = new People();
//            people1.setName("张飞");
//            int i = 1 / 0;
//            return people1;
//        });
//        System.out.println(result.getOrElse(people).getName());
//        System.out.println(result.getOrElseThrow((Function<? super Throwable, MyException>) MyException::new).getName());
//        Function2<Integer,Integer,Integer> function2 = (k1,k2)-> k1/k2;
//        Try<Integer> result1 = Try.of(()->{
//           return function2.apply(1,0);
//        });
//        System.out.println(result1.getOrElseThrow(()->new RuntimeException("error")));


//        Function2<Integer, Long, Integer> pt = (s1, s2) -> s1 + s2.intValue();
//        System.out.println(pt.apply(3,Long.valueOf(5)));
//        Function2<String, String, String> function2 = (k1, k2) -> k1 + "@" + k2;
//        Function3<String, String, Integer, String> function3 = (k1, k2, k3) -> function2.apply(k1, k2) + k3;
//        System.out.println(function3.apply("1", "2", 3));


        /**
         * @Description: Match
         * @Author: l'amour solitaire
         * @Date: 2019-08-29 15:46
         */
        Function1<Integer, String> function1 = (k) -> Match(k).of(
                Case($(1), "ONE"),
                Case($(2), "TWO"),
                Case($(), "?"));
        System.out.println(function1.apply(2));


//        People people = new People();
//        people.setName("赵云");
//        People people1 = new People();
//        people1.setName("赵云");
//        Comparator<People> byname = (People p1, People p2)-> p1.getName().compareTo(p2.getName());
//        System.out.println(byname.compare(people1,people)==0?true:false);
    }

}

@Data
class People {
    private String name;
    private Integer age;
}