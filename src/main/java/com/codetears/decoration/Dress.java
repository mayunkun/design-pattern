package com.codetears.decoration;

/**
 * @Description 装扮类继承Person
 * @Date 2019-05-15 11:54
 * @Author l'amour solitaire
 */
public class Dress extends BasePerson {

    public BasePerson componet;

    public void setPerson(BasePerson person) {
        this.componet = person;
    }

    @Override
    public void wear() {
        if (componet != null) {
            componet.wear();
        }
    }
}
