package a1_new_preparation;

public class SwapWithThirdVariable {
	public static void main(String[] args) {
		int a = 10, b = 20;
		int temp;
		System.out.println("Before Swapping "+ " "+ a +"  "+ b);
		temp = a;
		a=b;
		b = temp;
		System.out.println("After Swapping "+ " "+ a +"  "+ b);
	}

}
