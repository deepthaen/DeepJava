package javaPrograms;

import java.util.Scanner;

public class GetStudntRankNPrectnge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks[] = new int[6];
        int i;
        float total=0, avg;
        
        Scanner scanner = new Scanner(System.in);
        for(i=0; i<6; i++) { 
            System.out.print("Enter Marks of Subject"+(i+1)+":");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
        
      //Calculating average here
        avg = total/6;
        System.out.print("The student Rank is: ");
        if(avg>=80)
        {
            System.out.print("First - I");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("Second - II");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("Third - III");
        }
        else
        {
            System.out.print("Fourth - IV");
        }
    


	}

}
