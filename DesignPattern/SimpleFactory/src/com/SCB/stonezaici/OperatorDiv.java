package com.SCB.stonezaici;

public class OperatorDiv extends Operator {

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		if (this.getNumberB() == 0){
			System.out.println("Please input another divisor, this one is zero");
		}
		return this.getNumberA() / this.getNumberB();
	}
	
}
