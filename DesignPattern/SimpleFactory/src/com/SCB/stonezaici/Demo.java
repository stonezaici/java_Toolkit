package com.SCB.stonezaici;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numberA = 0.0;
		double numberB = 0.0;
		String operator = null;
		System.out.println("Please input the first number:");
		Scanner scanner = new Scanner(System.in);
		numberA = scanner.nextDouble();
		while(true){
			System.out.println("Please input the operator:");
			operator = scanner.next();
			if(operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/")){
				break;
			}
			else{
				System.out.println("The operator is invalid, please input again...");
			}
		}
		
		System.out.println("Please input the second number:");
		numberB = scanner.nextDouble();
		
		Operator op = new OperatorSimpleFactory().getOperator(operator);
		op.setNumberA(numberA);
		op.setNumberB(numberB);
		System.out.println("The result is : " + op.getResult());
	}

}
