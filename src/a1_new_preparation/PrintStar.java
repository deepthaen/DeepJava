package a1_new_preparation;

public class PrintStar {
	
	public static void main(String[] args) {
		//trinagleStar();	
		//fourstar();
		revesrtrinagleStar();
	}
	/**
	 * *
	 * * *
	 * * * *
	 * * * * *
	 */
	/**
	 * 
	 * * * * * *
	 *   * * *
	 *     *
	 */
		
	public static void fourstar() {
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				System.out.print("*");
				
			}
			System.out.println("*");
			
		}
		
	}
	
	public static void trinagleStar() {
		for (int i = 0; i <3; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
				
			}
			System.out.println("*");
			
		}
	}
	
	
	public static void revesrtrinagleStar() {
		int n=3;
		for (int i = 0; i < n; i++) {
			
			for (int j = n-i; j>1 ; j--) {
				System.out.print(" "); 			
			}
			for (int j = 0; j <=i ; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		
			
		}
	}
	/**
	 * we need to travse N times -- N=3
	 * we need spaces -- how amny spaces --if  N=3 --> n-1/n-2/n-3 spacess we need -->2spaces
	 * we need to print * stars --> how many stars --> 1/2/3
	 * 
	 */
/**
 * We need to travese N times N = 3
 * we nedd spaces 
 * 	i=0 , j=n-i j>=i-->j=3-0 -- 3>=0  j--
 *  i=1,  j=n-i j>n -->j=3-1 -- 2>=3
 * 	
 */


}
