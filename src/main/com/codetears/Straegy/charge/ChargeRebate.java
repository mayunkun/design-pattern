package main.com.codetears.Straegy.charge;

/**
 * @Description 折扣类
 * @Date 2019-05-13 13:59
 * @Author l'amour solitaire
 */
public class ChargeRebate extends ChargeSuper {

    // 折扣率
    public double moneyRebate = 1d;

    public ChargeRebate(String rebate) {
        moneyRebate = Double.parseDouble(rebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
