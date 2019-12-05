package com.codetears.equalsandhashcode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author l'amour solitaire
 * @description TODO
 * @date 2019/10/18 上午11:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class XiaoMing extends People {

    private String name;

    public XiaoMing(String sex, String name) {
        this.name = name;
        super.setSex(sex);
    }
}
