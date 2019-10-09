package com.codetears.SimpleFactory;

import com.codetears.SimpleFactory.operation.AddOperation;
import com.codetears.SimpleFactory.operation.MulOperation;
import com.codetears.SimpleFactory.operation.Operation;
import com.codetears.SimpleFactory.operation.SubOperation;

/**
 * @Description 代理工厂
 * @Date 2019-05-13 10:27
 * @Author l'amour solitaire
 */
public class OperationFactory {
	
	protected static Operation operation(Double numA, Double numB, String operation) {
		switch (operation) {
		case "+":
			return new AddOperation(numA, numB);
		case "-":
			return new SubOperation(numA, numB);
		case "*":
			return new MulOperation(numA, numB);
		default:
			return new AddOperation(numA, numB);
		}
	}

}
