package com.codetears.SimpleFactory.operation;

/**
 * @Description 加法
 * @Date 2019-05-13 10:26
 * @Author l'amour solitaire
 */
public class AddOperation extends Operation {

    private Double numA, numB;

    public AddOperation(Double numA, Double numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public Double doOperation() {
        return super.result = numA + numB;
    }

}
