package chapter14;

public class FanBelt extends Belt{
	public static class Factory implements fact.Factory<FanBelt>{

		@Override
		public FanBelt create() {
			// TODO Auto-generated method stub
			return new FanBelt();
		}
		
	}
}
