package com.codetears.ThreaPool;

/**
 * @author l'amour solitaire
 * @description TODO
 * @date 2019/10/8 下午3:38
 */
public class ThreaPoolTest {
    static int thread_count = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) {
        System.out.println(thread_count);
    }
}
