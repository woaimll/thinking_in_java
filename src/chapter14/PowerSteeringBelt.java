package chapter14;

public class PowerSteeringBelt extends Belt{
	public static class Factory implements fact.Factory<PowerSteeringBelt>{

		@Override
		public PowerSteeringBelt create() {
			// TODO Auto-generated method stub
			return new PowerSteeringBelt();
		}
		
	}
}
