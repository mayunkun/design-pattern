package com.codetears.ProxyPattern;

/**
 * @author l'amour solitaire
 * @description 小张(追求者)
 * @date 2019/10/11 下午3:20
 */
public class XiaoZhang implements ShowWell {

    XiaoMei xiaoMei;

    public XiaoZhang(XiaoMei xiaoMei) {
        this.xiaoMei = xiaoMei;
    }

    @Override
    public void sendFlowers() {
        System.out.println(xiaoMei + "送你鲜花");
    }

    @Override
    public void sendChocolate() {
        System.out.println(xiaoMei + "送你巧克力");
    }
}
