package com.codetears.threapool;

import io.vavr.Function1;
import io.vavr.control.Try;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.stream.Collectors;

/**
 * @author l'amour solitaire
 * @description TODO
 * @date 2019/10/8 下午3:38
 */
public class ThreaPoolTest {



    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Executor executor = Executors.newFixedThreadPool(100);
        List<String> list = Arrays.asList("赵云", "马超", "张飞", "关羽", "刘备", "孙权"
                , "马超", "张飞", "关羽", "刘备", "孙权"
                , "马超", "张飞", "关羽", "刘备", "孙权"
                , "马超", "张飞", "关羽", "刘备", "孙权"
                , "马超", "张飞", "关羽", "刘备", "孙权"
                , "马超", "张飞", "关羽", "刘备", "孙权"
                , "马超", "张飞", "关羽", "刘备", "孙权"
                , "马超", "张飞", "关羽", "刘备", "孙权");
        File file = new File("/Users/mayunkun/Desktop/test.txt");
        if (file.exists()) {
            file.delete();
        }

//        CompletableFuture[] futures = list.stream().map(m -> CompletableFuture.supplyAsync(() -> function1.apply(m))).toArray(size -> new CompletableFuture[size]);
//        List<CompletableFuture<String>> futures = list.stream().map(m -> CompletableFuture.supplyAsync(() -> function1.apply(m))).collect(Collectors.toList());
//        futures.stream().forEach(System.out::println);

        long start = System.currentTimeMillis();
        CompletableFuture<List<Boolean>> result = CompletableFuture.supplyAsync(() -> list.parallelStream().map(m -> function1.apply(m)).collect(Collectors.toList()),executor);
//        CompletableFuture.anyOf(result).join();
        result.whenComplete((r,e) -> {
            r.stream().forEach((m) -> function2.apply(m.toString()));
        });

        System.out.println("用时:" + (System.currentTimeMillis() - start));

//        long start = System.currentTimeMillis();
//        List<CompletableFuture<Boolean>> listTemp = list.parallelStream().map(m -> CompletableFuture.supplyAsync(() -> function1.apply(m),executor)).collect(Collectors.toList());
//        listTemp.stream().map(CompletableFuture::join).collect(Collectors.toList()).stream().forEach((m) -> {
//            function2.apply(m.toString());
//        });
//        System.out.println("用时:" + (System.currentTimeMillis() - start));

//        long start = System.currentTimeMillis();
//        List<CompletableFuture<String>> priceFuture = list.stream().map(m -> CompletableFuture.supplyAsync(() -> function1.apply(m))).collect(Collectors.toList());
//        List<String> listTemp = priceFuture.stream().map((m)->CompletableFuture.anyOf(m)).collect(Collectors.toList());
//        System.out.println("用时:" + (System.currentTimeMillis() - start));
//        listTemp.stream().forEach(System.out::println);
    }

    static Function1<String, Boolean> function1 = (k) -> {
        return Try.of(() -> {
            int i = 5;
            Thread.sleep(i * 1000);
            if (i == 2 || i == 4) {
                int m = 1 / 0;
            }
            String result = k + "执行完毕";
            System.out.println("method:" + result);
            return true;
        }).getOrElse(false);
    };

    static Function1<String, Boolean> function2 = (k) -> {
        try {
            InputStream in = new ByteArrayInputStream(k.getBytes("utf-8"));
            File file = new File("/Users/mayunkun/Desktop/test.txt");
            //写入相应的文件
            FileOutputStream out;
            if (!file.exists()) {
                file.createNewFile();//如果文件不存在，就创建该文件
                out = new FileOutputStream(file);//首次写入获取
            } else {
                //如果文件已存在，那么就在文件末尾追加写入
                out = new FileOutputStream(file, true);//这里构造方法多了一个参数true,表示在文件末尾追加写入
            }

            //读取数据
            //一次性取多少字节
            byte[] bytes = new byte[2048];
            //接受读取的内容(n就代表的相关数据，只不过是数字的形式)
            int n = -1;
            //循环取出数据
            while ((n = in.read(bytes, 0, bytes.length)) != -1) {
                //转换成字符串
                String str = new String(bytes, 0, n, "UTF-8");
                System.out.println(str);
                //写入相关文件
                out.write(bytes, 0, n);
                out.write("\n".getBytes());
            }
            //关闭流
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    };

}
