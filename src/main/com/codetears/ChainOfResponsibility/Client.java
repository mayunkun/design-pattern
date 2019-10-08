package com.codetears.ChainOfResponsibility;

import java.math.BigDecimal;

public class Client {

    public static void main(String[] args) {
        Manager bossManager = new BossManager("王老板");
        Manager ctoManager = new CtoManager(bossManager, "赵总监");
        Manager commonManager = new CommonManager(ctoManager,"张经理");


//        Request request = new Request();
//        request.setType(1);
//        request.setAmount(new BigDecimal("115"));
//
//        commonManager.deal(request);

        Request request1 = new Request();
        request1.setType(2);
        request1.setAmount(new BigDecimal("9500"));

        commonManager.deal(request1);

    }
}
