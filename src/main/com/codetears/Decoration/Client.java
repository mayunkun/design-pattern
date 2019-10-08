package main.com.codetears.Decoration;

import main.com.codetears.Decoration.dress.Jeans;
import main.com.codetears.Decoration.dress.TShirt;

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

        ts.set_person(xm);
        js.set_person(ts);

        js.wear();
    }
}
