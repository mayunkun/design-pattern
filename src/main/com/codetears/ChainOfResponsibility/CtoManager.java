package com.codetears.ChainOfResponsibility;

import java.math.BigDecimal;

/**
 * 经理
 */
public class CtoManager extends Manager {

    public CtoManager(Manager supManager, String name) {
        super.name = name;
        super.supManager = supManager;
    }

    @Override
    public void deal(Request request) {
        int type = request.getType();
        BigDecimal amount = request.getAmount();
        switch (type) {
            case 1:
                if (amount.compareTo(new BigDecimal("10")) > 0) {
                    supManager.deal(request);
                } else {
                    System.out.printf(this.name + "批准");
                }
                break;
            case 2:
                if (amount.compareTo(new BigDecimal("8000")) > 0) {
                    supManager.deal(request);
                } else {
                    System.out.printf(this.name + "批准");
                }
        }
    }
}
