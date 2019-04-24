package chapter14;

public class OilFilter extends Filter{
	public static class Factory implements fact.Factory<OilFilter>{

		@Override
		public OilFilter create() {
			// TODO Auto-generated method stub
			return new OilFilter();
		}
		
	}
}
