package chapter12;

public abstract class Inning {
	public Inning()throws BaseballException{
		
	}
	public void event()throws BaseballException{
		
	}
	public abstract void atBat()throws Strike,Foul,UmpireArgument;
	abstract void decision() throws UmpireArgument;
	public void walk() {
		
	}
}
