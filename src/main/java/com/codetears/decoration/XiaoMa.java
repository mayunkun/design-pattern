package com.codetears.decoration;

/**
 * @Description
 * @Date 2019-05-15 13:51
 * @Author l'amour solitaire
 */
public class XiaoMa extends BasePerson {

    public String name;

    XiaoMa(String name) {
        this.name = name;
    }

    @Override
    public void wear() {
        System.out.print("着装的 " + name);
    }
}
