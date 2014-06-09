package com.SCB.stonezaici;

public class OperatorSimpleFactory {

	


	public Operator getOperator(String strOper){
		 Operator operator = null;
		 String strOperator = strOper;
		 
		switch(strOperator){
		case "+":
			operator = new OperatorAdd();
			break;
		case "-":
			operator = new OperatorMinus();
			break;
		case "*":
			operator = new OperatorMultip();
			break;
		case "/":
			operator = new OperatorDiv();
			break;
			
		}
		return operator;
		
	}
}
