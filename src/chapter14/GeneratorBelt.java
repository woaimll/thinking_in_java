package chapter14;

public class GeneratorBelt extends Belt{
	public static class Factory implements fact.Factory<GeneratorBelt>{

		@Override
		public GeneratorBelt create() {
			// TODO Auto-generated method stub
			return new GeneratorBelt();
		}
		
	}
}
