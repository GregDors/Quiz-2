import java.util.Scanner;

public class Tuition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is the initial tuition: ");
		int initial_tuition = input.nextInt();
		
		System.out.print("What is the percentage increase per year: ");
		double percent_increase = input.nextDouble();
		
		float tuition = (float)initial_tuition;
		float percentage = (float) (percent_increase/100);
		float total = (float) 0;
		for(int i = 0; i<4; i++){
			tuition =  tuition*percentage + tuition;
			total += tuition;
			
		}
		
		System.out.printf("The final cost for tuition after 4 years is $%.2f%n " , total);
	}

}
