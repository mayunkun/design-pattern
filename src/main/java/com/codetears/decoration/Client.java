package com.codetears.decoration;

import com.codetears.decoration.dress.Jeans;
import com.codetears.decoration.dress.TShirt;

/**
 * @Description
 * @Date 2019-05-15 13:53
 * @Author l'amour solitaire
 */
public class Client {
    public static void main(String[] args) {
        XiaoMa xm = new XiaoMa("小马哥");
        TShirt ts = new TShirt();
        Jeans js = new Jeans();

        ts.setPerson(xm);
        js.setPerson(ts);

        js.wear();
    }
}
