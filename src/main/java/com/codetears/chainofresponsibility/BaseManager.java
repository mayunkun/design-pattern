package com.codetears.chainofresponsibility;

import lombok.Data;

/**
 * @author l'amour solitaire
 * @description 管理者
 * @date 2019/10/12 下午2:26
 */
@Data
abstract class BaseManager {

    /**
     * 姓名
     */
    protected String name;

    /**
     * 上级
     */
    protected BaseManager supManager;

    abstract public void deal(Request request) throws InterruptedException;

}
