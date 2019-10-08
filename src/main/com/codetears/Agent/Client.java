package main.com.codetears.Agent;

import main.com.codetears.Agent.object.House;
import main.com.codetears.Agent.object.User;

/**
 * @Description
 * @Date 2019-05-15 16:08
 * @Author l'amour solitaire
 */
public class Client {
    public static void main(String[] args) {
        User buyUser = new User("买家小王");
        User sellUser = new User("卖家刘海柱");
        House house = new House("海景别墅", sellUser);
        Buyers buyers  =new Buyers(house, buyUser);

        Middlemen shl = new Middlemen(buyers);
        shl.originalContract();
        shl.transfer();
        shl.newContract();
    }
}
