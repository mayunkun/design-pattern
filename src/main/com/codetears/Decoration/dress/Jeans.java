package main.com.codetears.Decoration.dress;

import main.com.codetears.Decoration.Dress;

/**
 * @Description 具体的装扮-牛仔裤
 * @Date 2019-05-15 13:48
 * @Author l'amour solitaire
 */
public class Jeans extends Dress {

    @Override
    public void wear() {
        System.out.print("牛仔裤");
        super.wear();
    }
}
