package com.codetears.decoration.dress;

import com.codetears.decoration.Dress;

/**
 * @Description 具体的装扮-T恤
 * @Date 2019-05-15 13:45
 * @Author l'amour solitaire
 */
public class TShirt extends Dress {

    @Override
    public void wear() {
        System.out.print("T恤");
        super.wear();
    }
}
