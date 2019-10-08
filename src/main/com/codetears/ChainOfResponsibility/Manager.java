package com.codetears.ChainOfResponsibility;

import lombok.Data;

/**
 * 管理者
 */
@Data
abstract class Manager {

    protected String name;
    protected Manager supManager;

    abstract public void deal(Request request);

}
