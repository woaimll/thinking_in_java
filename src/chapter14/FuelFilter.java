package chapter14;

public class FuelFilter extends Filter{
	public static class Factory implements fact.Factory<FuelFilter>{

		@Override
		public FuelFilter create() {
			// TODO Auto-generated method stub
			return new FuelFilter();
		}
		
	}
}
