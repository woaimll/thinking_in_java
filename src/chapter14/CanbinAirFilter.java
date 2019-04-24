package chapter14;

public class CanbinAirFilter extends Filter{
	public static class Factory implements fact.Factory<CanbinAirFilter>{

		@Override
		public CanbinAirFilter create() {
			// TODO Auto-generated method stub
			return new CanbinAirFilter();
		}
		
	}
}
