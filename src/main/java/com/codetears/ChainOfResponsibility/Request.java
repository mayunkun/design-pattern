package com.codetears.ChainOfResponsibility;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Request {

    /** 请求类型(1:请假 2:加薪)*/
    private int type;

    /** 请假天数/加薪金额*/
    private BigDecimal amount;

}
