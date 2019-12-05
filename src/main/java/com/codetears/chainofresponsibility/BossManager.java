package com.codetears.chainofresponsibility;

import com.sun.jdi.VoidValue;
import io.vavr.Function0;
import io.vavr.Function1;
import io.vavr.PartialFunction;
import io.vavr.control.Option;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.Optional;
import java.util.function.Function;

import static io.vavr.API.*;

/**
 * @author l'amour solitaire
 * @description 老板
 * @date 2019/10/12 下午2:16
 */
public class BossManager extends BaseManager {
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
