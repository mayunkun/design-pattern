package main.com.codetears.Agent;

/**
 * @Description 二手房购买
 * @Date 2019-05-15 15:30
 * @Author l'amour solitaire
 */
public interface SecondHandHousing {

    /**
     * @Description 原购房合同登记
     * @Date 2019-05-15 15:33
     * @Author l'amour solitaire
     */
    public void originalContract();


    /**
     * @Description 房屋过户
     * @Date 2019-05-15 15:33
     * @Author l'amour solitaire
     */
    public void transfer();

    /**
     * @Description 新购房合同
     * @Date 2019-05-15 15:33
     * @Author l'amour solitaire
     */
    public void newContract();
}
