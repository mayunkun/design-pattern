package com.codetears.straegy;

import com.codetears.straegy.charge.BaseChargeSuper;
import com.codetears.straegy.charge.ChargeNormal;
import com.codetears.straegy.charge.ChargeRebate;

import static io.vavr.API.*;

/**
 * @Description
 * @Date 2019-05-13 14:09
 * @Author l'amour solitaire
 */
public class ChargeContext {
    public BaseChargeSuper charge = null;

    ChargeContext(String type) {
        charge = Match(type).of(
                Case($("正常收款"), new ChargeNormal()),
                Case($("折扣收款"), new ChargeRebate("0.85")));
    }

    public double money(double money) {
        return charge.acceptCash(money);
    }

}
