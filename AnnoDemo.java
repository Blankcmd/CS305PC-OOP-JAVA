class AnnoP{
	@Deprecated
	public void depM(){
		System.out.println("Deprecatedmethod");
	}
	public void OvR(){
		System.out.println("AnnoP");
	}
}
class AnnoC extends AnnoP{
	@Override
	public void OvR(){
		System.out.println("AnnoC");
	}	
}
public class AnnoDemo{
	@SuppressWarnings("Deprecation")
	public static void main(String...args){
		AnnoC ac = new AnnoC();
		ac.OvR();
		ac.depM();
	}
}
