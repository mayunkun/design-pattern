package main.com.codetears.Decoration;

/**
 * @Description
 * @Date 2019-05-15 13:51
 * @Author l'amour solitaire
 */
public class XiaoMa extends Person {

    public String name;

    XiaoMa(String name) {
        this.name = name;
    }

    @Override
    public void wear() {
        System.out.print("着装的 " + name);
    }
}
