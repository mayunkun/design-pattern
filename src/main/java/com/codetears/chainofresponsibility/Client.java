package com.codetears.chainofresponsibility;

import java.math.BigDecimal;

/**
 * @author l'amour solitaire
 * @description TODO
 * @date 2019/10/12 下午2:20
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        BaseManager bossManager = new BossManager("老板"), ctoManager = new CtoManager(bossManager, "总监"), commonManager = new CommonManager(ctoManager, "经理");

        Request request = new Request().setType(1).setAmount(new BigDecimal("13"));

        commonManager.deal(request);

    }
}
