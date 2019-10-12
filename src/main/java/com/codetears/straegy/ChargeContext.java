package com.codetears.straegy;

import com.codetears.straegy.charge.ChargeNormal;
import com.codetears.straegy.charge.ChargeRebate;
import com.codetears.straegy.charge.ChargeSuper;

/**
 * @Description
 * @Date 2019-05-13 14:09
 * @Author l'amour solitaire
 */
public class ChargeContext {
    public ChargeSuper charge = null;

    ChargeContext(String type) {
        switch (type) {
            case "正常收款":
                charge = new ChargeNormal();
                break;
            case "折扣收款":
                charge = new ChargeRebate("0.85");
                break;
            default:
                break;
        }
    }

    public double money(double money){
        return charge.acceptCash(money);
    }

}