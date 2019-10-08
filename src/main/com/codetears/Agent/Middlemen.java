package main.com.codetears.Agent;

/**
 * @Description
 * @Date 2019-05-15 16:03
 * @Author l'amour solitaire
 */
public class Middlemen implements SecondHandHousing {
    private Buyers buyer;

    public Middlemen(Buyers buyer) {
        this.buyer = buyer;
    }

    @Override
    public void originalContract() {
        System.out.print("中间商代替执行 ");
        buyer.originalContract();
    }

    @Override
    public void transfer() {
        System.out.print("中间商代替执行 ");
        buyer.transfer();
    }

    @Override
    public void newContract() {
        System.out.print("中间商代替执行 ");
        buyer.newContract();
    }
}
