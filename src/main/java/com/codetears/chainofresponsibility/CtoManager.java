package com.codetears.chainofresponsibility;

import java.math.BigDecimal;

/**
 * @author l'amour solitaire
 * @description CTO
 * @date 2019/10/12 下午2:17
 */
public class CtoManager extends AbstractManager {
    private static final BigDecimal DAYS = new BigDecimal("7");
    private static final BigDecimal MONEY = new BigDecimal("5000");

    public CtoManager(AbstractManager supManager, String name) {
        super.name = name;
        super.supManager = supManager;
    }

    @Override
    public void deal(Request request) throws InterruptedException {
        int type = request.getType();
        BigDecimal amount = request.getAmount();
        switch (type) {
            case 1:
                if (amount.compareTo(DAYS) > 0) {
                    System.out.println(name + "权限不够，转" + supManager.getName() + "处理~");
                    Thread.sleep(1000);
                    supManager.deal(request);
                } else {
                    System.out.printf(this.name + "批准请假");
                }
                break;
            case 2:
                if (amount.compareTo(MONEY) > 0) {
                    System.out.println(name + "权限不够，转" + supManager.getName() + "处理~");
                    Thread.sleep(1000);
                    supManager.deal(request);
                } else {
                    System.out.printf(this.name + "批准调薪");
                }
                break;
            default:
                break;
        }
    }
}
