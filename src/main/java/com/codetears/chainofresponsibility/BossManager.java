package com.codetears.chainofresponsibility;

import java.math.BigDecimal;

/**
 * @author l'amour solitaire
 * @description 老板
 * @date 2019/10/12 下午2:16
 */
public class BossManager extends AbstractManager {
    private static final BigDecimal DAYS = new BigDecimal("20");
    private static final BigDecimal MONEY = new BigDecimal("10000");

    public BossManager(String name) {
        super.name = name;
    }

    @Override
    public void deal(Request request) {
        int type = request.getType();
        BigDecimal amount = request.getAmount();
        switch (type) {
            case 1:
                if (amount.compareTo(DAYS) > 0) {
                    System.out.printf(this.name + "拒绝申请");
                } else {
                    System.out.printf(this.name + "批准请假");
                }
                break;
            case 2:
                if (amount.compareTo(MONEY) > 0) {
                    System.out.printf(this.name + "拒绝申请");
                } else {
                    System.out.printf(this.name + "批准调薪");
                }
                break;
            default:
                break;
        }
    }
}
