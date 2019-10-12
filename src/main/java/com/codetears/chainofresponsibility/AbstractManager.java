package com.codetears.chainofresponsibility;

import lombok.Data;

/**
 * 管理者
 */
@Data
abstract class AbstractManager {

    /**
     * @author l'amour solitaire
     * @description 姓名
     * @date 2019/10/12 下午2:21
     */
    protected String name;

    /**
     * @author l'amour solitaire
     * @description 上级
     * @date 2019/10/12 下午2:22
     */
    protected AbstractManager supManager;

    abstract public void deal(Request request) throws InterruptedException;

}
