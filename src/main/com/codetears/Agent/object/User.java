package main.com.codetears.Agent.object;

/**
 * @Description 人物
 * @Date 2019-05-15 15:53
 * @Author l'amour solitaire
 */
public class User {

    /**
     * 姓名
     */
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
