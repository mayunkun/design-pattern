package com.codetears.SimpleFactory;

import com.codetears.SimpleFactory.operation.*;
import io.vavr.Function3;

import static io.vavr.API.*;

/**
 * @Description 代理工厂
 * @Date 2019-05-13 10:27
 * @Author l'amour solitaire
 */
public class OperationFactory {

    static Function3<Double, Double, String, Operation> operation = (numA, numB, operation) -> Match(operation).of(
            Case($("+"), new AddOperation(numA, numB)),
            Case($("-"), new SubOperation(numA, numB)),
            Case($("*"), new MulOperation(numA, numB)),
            Case($("/"), new DivideOperation(numA, numB)),
            Case($(), new Operation()));

}
