package com.codetears.ChainOfResponsibility;

import java.math.BigDecimal;

/**
 * 经理
 */
public class CommonManager extends Manager {

    public CommonManager(Manager supManager, String name) {
        super.name = name;
        super.supManager = supManager;
    }

    @Override
    public void deal(Request request) {
        int type = request.getType();
        BigDecimal amount = request.getAmount();
        switch (type) {
            case 1:
                if (amount.compareTo(new BigDecimal("3")) > 0) {
                    supManager.deal(request);
                } else {
                    System.out.printf(this.name + "批准");
                }
                break;
            case 2:
                if (amount.compareTo(new BigDecimal("5000")) > 0) {
                    supManager.deal(request);
                } else {
                    System.out.printf(this.name + "批准");
                }
        }
    }
}
