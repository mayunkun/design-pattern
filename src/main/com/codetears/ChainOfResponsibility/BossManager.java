package com.codetears.ChainOfResponsibility;

import java.math.BigDecimal;

/**
 * 经理
 */
public class BossManager extends Manager {

    public BossManager(String name) {
        super.name = name;
    }

    @Override
    public void deal(Request request) {
        int type = request.getType();
        BigDecimal amount = request.getAmount();
        switch (type) {
            case 1:
                if (amount.compareTo(new BigDecimal("20")) > 0) {
                    System.out.printf(this.name + "拒绝申请");
                } else {
                    System.out.printf(this.name + "批准");
                }
                break;
            case 2:
                if (amount.compareTo(new BigDecimal("10000")) > 0) {
                    System.out.printf(this.name + "拒绝申请");
                } else {
                    System.out.printf(this.name + "批准");
                }
        }
    }
}
