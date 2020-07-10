package com.codetears.chainofresponsibility;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * @author l'amour solitaire
 * @description 请求
 * @date 2019/10/12 下午2:18
 */
@Data
@Accessors(chain = true)
public class Request {

    /** 请求类型(1:请假 2:加薪)*/
    private int type;

    /** 请假天数/加薪金额*/
    private BigDecimal amount;

}
