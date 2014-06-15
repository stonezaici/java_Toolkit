package com.stonezaici;

public class Context {
	private Strategy strategy;

	public Context(String type) {
		
		switch(type)
		{
			case "����A":
				ConcreteStrategyA sa = new ConcreteStrategyA();
				strategy = sa;
				break;
			case "����B":
				ConcreteStrategyB sb = new ConcreteStrategyB();
				strategy = sb;
				break;
			case "����C":
				ConcreteStrategyC sc = new ConcreteStrategyC();
				strategy = sc;
				break;
		}
	}
	public void ContextInterface(){
		strategy.AlgorithmInterface();
	}
	
}
