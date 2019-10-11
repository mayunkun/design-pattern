package com.codetears.ProxyPattern;

/**
 * @author l'amour solitaire
 * @description 隔壁小王(代理类)
 * @date 2019/10/11 下午3:25
 */
public class XiaoWang implements ShowWell {

    XiaoZhang xiaoZhang;

    public XiaoWang(XiaoMei xiaoMei) {
        this.xiaoZhang = new XiaoZhang(xiaoMei);
    }

    @Override
    public void sendFlowers() {
        xiaoZhang.sendFlowers();
    }

    @Override
    public void sendChocolate() {
        xiaoZhang.sendChocolate();
    }
}
