package com.codetears;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Date 2019-05-15 16:48
 * @Author l'amour solitaire
 */
public class Test {
    private static final int MAX_THREADS = 10000;

    public static String execCurl(String[] cmds) {
        ProcessBuilder process = new ProcessBuilder(cmds);
        Process p;
        try {
            p = process.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream(),"UTF-8"));
            StringBuilder builder = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
                builder.append(System.getProperty("line.separator"));
            }
            System.out.println(builder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        String[] cmds1 = {"curl", "-H", "Host: blog.csdn.net", "-H", "Cache-Control: max-age=0", "--compressed", "https://blog.csdn.net/kuangni5808/article/details/90239154"};
        String[] cmds2 = {"curl", "-H", "Host: blog.csdn.net", "-H", "Cache-Control: max-age=0", "--compressed", "https://blog.csdn.net/kuangni5808/article/details/83384437"};
        String[] cmds3 = {"curl", "-H", "Host: blog.csdn.net", "-H", "Cache-Control: max-age=0", "--compressed", "https://blog.csdn.net/kuangni5808/article/details/90236410"};
        String[] cmds4 = {"curl", "-H", "Host: blog.csdn.net", "-H", "Cache-Control: max-age=0", "--compressed", "https://blog.csdn.net/kuangni5808/article/details/90174512"};
        String[] cmds5 = {"curl", "-H", "Host: blog.csdn.net", "-H", "Cache-Control: max-age=0", "--compressed", "https://blog.csdn.net/kuangni5808/article/details/90168086"};
        String[] cmds6 = {"curl", "-H", "Host: blog.csdn.net", "-H", "Cache-Control: max-age=0", "--compressed", "https://blog.csdn.net/kuangni5808/article/details/90044586"};
        String[] cmds7 = {"curl", "-H", "Host: blog.csdn.net", "-H", "Cache-Control: max-age=0", "--compressed", "https://blog.csdn.net/kuangni5808/article/details/88423718"};
        String[] cmds8 = {"curl", "-H", "Host: blog.csdn.net", "-H", "Cache-Control: max-age=0", "--compressed", "https://blog.csdn.net/kuangni5808/article/details/86245513"};
        String[] cmds9 = {"curl", "-H", "Host: blog.csdn.net", "-H", "Cache-Control: max-age=0", "--compressed", "https://blog.csdn.net/kuangni5808/article/details/85683880"};
        String[] cmds10 = {"curl", "-H", "Host: blog.csdn.net", "-H", "Cache-Control: max-age=0", "--compressed", "https://blog.csdn.net/kuangni5808/article/details/85282788"};
        String[] cmds11 = {"curl", "-H", "Host: blog.csdn.net", "-H", "Cache-Control: max-age=0", "--compressed", "https://blog.csdn.net/kuangni5808/article/details/85266105"};
        String[] cmds12 = {"curl", "-H", "Host: blog.csdn.net", "-H", "Cache-Control: max-age=0", "--compressed", "https://blog.csdn.net/kuangni5808/article/details/85229719"};
        String[] cmds13 = {"curl", "-H", "Host: blog.csdn.net", "-H", "Cache-Control: max-age=0", "--compressed", "https://blog.csdn.net/kuangni5808/article/details/84972335"};
        String[] cmds14 = {"curl", "-H", "Host: blog.csdn.net", "-H", "Cache-Control: max-age=0", "--compressed", "https://blog.csdn.net/kuangni5808/article/details/84629687"};
        String[] cmds15 = {"curl", "-H", "Host: blog.csdn.net", "-H", "Cache-Control: max-age=0", "--compressed", "https://blog.csdn.net/kuangni5808/article/details/84891053"};
        String[] cmds16 = {"curl", "-H", "Host: blog.csdn.net", "-H", "Cache-Control: max-age=0", "--compressed", "https://blog.csdn.net/kuangni5808/article/details/80959607"};
        String[] cmds17 = {"curl", "-H", "Host: blog.csdn.net", "-H", "Cache-Control: max-age=0", "--compressed", "https://blog.csdn.net/kuangni5808/article/details/78602351"};
        List<String[]> list = Arrays.asList(cmds1, cmds2, cmds3, cmds4, cmds5, cmds6, cmds7, cmds8, cmds9, cmds10, cmds11, cmds12, cmds13, cmds14, cmds15, cmds16, cmds17);
        for (int i = 0; i < MAX_THREADS; i++) {
            list.forEach((cmd) -> {
                execCurl(cmd);
            });
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
