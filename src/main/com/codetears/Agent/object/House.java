package main.com.codetears.Agent.object;

/**
 * @Description
 * @Date 2019-05-15 15:51
 * @Author l'amour solitaire
 */
public class House {

    /**
     * 房屋名称
     */
    private String name;

    /**
     * 房屋户主
     */
    private User user;

    public House(String name, User user) {
        this.name = name;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
