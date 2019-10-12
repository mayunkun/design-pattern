package com.codetears.straegy.charge;

/**
 * @Description 正常收费子类
 * @Date 2019-05-13 13:49
 * @Author l'amour solitaire
 */
public class ChargeNormal extends BaseChargeSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
