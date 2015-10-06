package watermelon;
import java.util.Scanner;
public class Watermelon {

	//wrong answer on test 5
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int digito=0;
		int resto=0;
		digito = entrada.nextInt();
		if(digito>0){
			resto=digito/2;
		if(digito%2==0){
			if(resto%2==0){
			System.out.println("YES");
			}}else{
			System.out.println("NO");
		}
		}
	}
}
