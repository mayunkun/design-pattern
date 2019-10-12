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

        Request request = new Request();
        request.setType(1);
        request.setAmount(new BigDecimal("115"));

        commonManager.deal(request);

//        Request request1 = new Request();
//        request1.setType(2);
//        request1.setAmount(new BigDecimal("9500"));
//
//        commonManager.deal(request1);

    }
}
