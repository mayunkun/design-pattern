package com.codetears.SimpleFactory.operation;

import com.codetears.SimpleFactory.Operation;

/**
 * @Description 除法
 * @Date 2019-05-13 10:26
 * @Author l'amour solitaire
 */
public class DivideOperation extends Operation {

    private Double numA, numB;

    public DivideOperation(Double numA, Double numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public Double doOperation() {
        return super.result = numA / numB;
    }

}
