package com.stonezaici;

public class Context {
	private Strategy strategy;

	public Context(String type) {
		
		switch(type)
		{
			case "²ßÂÔA":
				ConcreteStrategyA sa = new ConcreteStrategyA();
				strategy = sa;
				break;
			case "²ßÂÔB":
				ConcreteStrategyB sb = new ConcreteStrategyB();
				strategy = sb;
				break;
			case "²ßÂÔC":
				ConcreteStrategyC sc = new ConcreteStrategyC();
				strategy = sc;
				break;
		}
	}
	public void ContextInterface(){
		strategy.AlgorithmInterface();
	}
	
}
