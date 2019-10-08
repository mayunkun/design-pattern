package main.com.codetears.Agent;

import main.com.codetears.Agent.object.House;
import main.com.codetears.Agent.object.User;

/**
 * @Description 买主
 * @Date 2019-05-15 15:36
 * @Author l'amour solitaire
 */
public class Buyers implements SecondHandHousing {

    private House house;
    private User user;

    public Buyers(House house, User user) {
        this.house = house;
        this.user = user;
    }

    @Override
    public void originalContract() {
        System.out.println(house.getUser().getName() + "房屋" + house.getName() + "合同作废");
    }

    @Override
    public void transfer() {
        System.out.println(house.getUser().getName() + "房屋" + house.getName() + "执行转让");
        house.setUser(user);
    }

    @Override
    public void newContract() {
        System.out.println("房屋" + house.getName() + "转让至" + house.getUser().getName());
    }
}
