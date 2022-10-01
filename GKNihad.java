
public class GKNihad implements Gk{

	@Override
	public void foo2() {
		// TODO Auto-generated method stub
		
	}
	private GKNihad () {}
	
	private static GKNihad gk = null;
	public static GKNihad obyektiyarad() {
		if(gk==null) {
			gk=new GKNihad();
		}
		return gk;
	}
	
}
