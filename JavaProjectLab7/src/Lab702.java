import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab702 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("###.00");
		Scanner scan = new Scanner(System.in);
		double[] score = new double[5];
		double sum = 0.00;
		for(int i = 0 ; i<score.length;i++) {
			System.out.print("Input score of student : ");
			score[i]=scan.nextDouble();
			sum += score[i];
		}
		double avr = sum/score.length;
		System.out.println("Average of 5 student is "+frm.format(avr));
		int j = 1;
		for(double _score : score) {
			if(_score>avr) {
				System.out.println("Student "+j+" ("+_score+")");
				
			}
			j++;
			/*23.5
			20
			18
			11.2
			22.72*/
		}

	}

}
