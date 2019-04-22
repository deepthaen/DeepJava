package javaPrograms;

public class MulTwoNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =1; i<=100; i++) {
			for(int j =1; j<=100; j++) {
				int k = i*j;
				if(k==20) {
				System.out.println("First Number ::" + i +"Second Number ::"+ j);
				}
			}
		}

	}

}
