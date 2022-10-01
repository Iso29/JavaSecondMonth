import main.svejiiso;

public class Main {

	public static void main(String[] args) {
//		Student st = new Student("iso","islamzade",19,"Mirze Cabbar MMzade 103");
//		Teacher tr = new Teacher("Ellada","Ibrahimov",29,"ASOIU");
//		printAllInfo(tr);
//		printAllInfo(st);
		
		//Exception
//		try {
//			int[] arr = null;
//			System.out.println(arr[0]);
//		}
//		catch(Exception extn) {
//			StackTraceElement[] ste = extn.getStackTrace();
//			System.err.println(extn.getClass().getName()+" : "+extn.getMessage() );
//			for(int i =0;i<ste.length;i++) {
//				StackTraceElement stE = ste[i];
//				System.err.println("\tat main.Main."+stE.getMethodName()+"("+stE.getFileName()+":"+stE.getLineNumber()+")");
//			}
//		}
		svejiiso.SvBuilder bl = svejiiso.build();
		bl.whatIsYourName("iso");
		bl.whatIsYourSurname("Islamzada");
		bl.howOldAreYou(19);
		svejiiso sv = bl.build();
		System.out.print(sv.getName()+" "+sv.getSurname()+" "+sv.getAge()); 
		
		
		
	}
	
	public static void printAllInfo(Person person) {
		System.out.println(person.name +"  "+ person.surname +"  "+ person.age +"   "+ person.address);
	}
	
}
