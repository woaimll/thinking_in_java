package chapter14;

public class AirFilter extends Filter{
	public static class Factory implements fact.Factory<AirFilter>{

		@Override
		public AirFilter create() {
			// TODO Auto-generated method stub
			return new AirFilter();
		}
		
	}
}
