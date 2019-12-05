package com.codetears.equalsandhashcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author l'amour solitaire
 * @description TODO
 * @date 2019/10/18 上午11:24
 */
public class Client {
    public static void main(String[] args) {
        XiaoMing xm = new XiaoMing("男","小明");
        XiaoMing xm1 = new XiaoMing("女","小明");
        System.out.println(xm.equals(xm1));

        Set<XiaoMing> st = new HashSet<>();
        st.add(xm);
        st.add(xm1);
        st.stream().forEach((m)->{
            System.out.println(m.getSex());
        });
    }
}
