package chapter12;

public class CleanupIdiom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NeedsCleanup nc1 = new NeedsCleanup();
		try {
			
		}finally {
			nc1.dispose();
		}
		
		NeedsCleanup nc2 = new NeedsCleanup();
		NeedsCleanup nc3 = new NeedsCleanup();
		try {
			
		}finally {
			nc3.dispose();
			nc2.dispose();
		}
		
		try {
			NeedsCleanup2 nc4 = new NeedsCleanup2();
			try {
				NeedsCleanup2 nc5 = new NeedsCleanup2();
				try {
					
				}finally {
					nc5.dispose();
				}
			}catch (ConstructionException e) {
				System.out.println(e);
			}finally {
				nc4.dispose();
			}
		}catch (ConstructionException e) {
			System.out.println(e);
		}
	}

}
