package main.com.codetears.Decoration;

/**
 * @Description 装扮类继承Person
 * @Date 2019-05-15 11:54
 * @Author l'amour solitaire
 */
public class Dress extends Person {

    public Person componet;

    public void set_person(Person person) {
        this.componet = person;
    }

    @Override
    public void wear() {
        if (componet != null) {
            componet.wear();
        }
    }
}
