package com.codetears.simplefactory.operation;

import com.codetears.simplefactory.Operation;

/**
 * @Description 除法
 * @Date 2019-05-13 10:26
 * @Author l'amour solitaire
 */
public class DivideOperation extends Operation {

    private Double numa, numb;

    public DivideOperation(Double numa, Double numb) {
        this.numa = numa;
        this.numb = numb;
    }

    @Override
    public Double doOperation() {
        return super.result = numa / numb;
    }

}
