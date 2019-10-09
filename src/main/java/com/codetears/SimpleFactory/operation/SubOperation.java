package com.codetears.SimpleFactory.operation;

/**
 * @Description 减法
 * @Date 2019-05-13 10:27
 * @Author l'amour solitaire
 */
public class SubOperation extends Operation {

    private Double numA, numB;

    public SubOperation(Double numA, Double numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public Double doOperation() {
        return super.result = numA - numB;
    }

}
