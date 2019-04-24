package chapter12;

public class StromyInning extends Inning implements Storm{
	public StromyInning()throws RainedOut,BaseballException{
		
	}
	public StromyInning(String s)throws Foul,BaseballException{
		
	}
	@Override
	public void rainHard() throws RainedOut {
		// TODO Auto-generated method stub
		
	}
	public void event(){
		
	}

	@Override
	public void atBat() throws PopFoul {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		try {
			StromyInning si = new StromyInning();
			si.atBat();
		}catch (PopFoul e) {
			System.out.println("Pop foul");
		}catch(RainedOut e) {
			System.out.println("Rained out");
		}catch(BaseballException e) {
			System.out.println("Generic baseball exception");
		}
		
		try {
			Inning i = new StromyInning();
			i.atBat();
		}catch (Strike e) {
			System.out.println("Strike");
		}catch(Foul e) {
			System.out.println("Foul");
		}catch(RainedOut fe) {
			System.out.println("Rined out");
		}catch(UmpireArgument e) {
			System.out.println("Generic UmpireArgument Exception");
		}catch(BaseballException e) {
			System.out.println("Generic baseball Exception");
		}
	}
	@Override
	void decision() throws UmpireArgument {
		// TODO Auto-generated method stub
		
	}

}
