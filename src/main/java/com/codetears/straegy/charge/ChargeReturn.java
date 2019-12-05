package com.codetears.straegy.charge;

/**
 * @author l'amour solitaire
 * @description 满额返现
 * @date 2019/10/14 上午10:27
 */
public class ChargeReturn extends BaseChargeSuper {

    private static Double rateMoney = null;
    private static Double returnMoney = null;

    public ChargeReturn(Double rateMoney, Double returnMoney) {
        this.rateMoney = rateMoney;
    }

    @Override
    public double acceptCash(double money) {
        return money > rateMoney ? money - returnMoney : money;
    }
}
