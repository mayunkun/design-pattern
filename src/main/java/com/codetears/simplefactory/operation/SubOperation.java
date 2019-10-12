package com.codetears.simplefactory.operation;

import com.codetears.simplefactory.Operation;

/**
 * @Description 减法
 * @Date 2019-05-13 10:27
 * @Author l'amour solitaire
 */
public class SubOperation extends Operation {

    private Double numa, numb;

    public SubOperation(Double numa, Double numb) {
        this.numa = numa;
        this.numb = numb;
    }

    @Override
    public Double doOperation() {
        return super.result = numa - numb;
    }

}
