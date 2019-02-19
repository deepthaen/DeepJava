package javaClasses;

public class MulClassesOneClass {
	
	
	      
		public void add() {
			System.out.println("class one");
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MulClassesOneClass MCC = new MulClassesOneClass();
		MCC.add();
		
		Books b = new Books();
		b.author();
		
		movie m = new movie() ;
		m.sub();
		
		

	}

}


 class movie{
	public void sub() {
		System.out.println("class two");
	}
}


 class Books{
	public void author() {
		System.out.println("Author");
	}
}