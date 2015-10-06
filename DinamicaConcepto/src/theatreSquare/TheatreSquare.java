package theatreSquare;
import java.util.Scanner;
public class TheatreSquare {
//wrong on test 16
	public static void main(String[] args) {
		int y=0;
		int x=0;
		int m=0;
		int n=0;
		int a=0;
		Scanner entrada = new Scanner(System.in);
			m=entrada.nextInt();
		    n=entrada.nextInt();
		    a=entrada.nextInt();
		    x=m/a;
		    if(m%a>0){
		    	x++;
		    }
		    y=n/a;
		    if(n%a>0){
		    y++;
		    }
		n=x*y;
		System.out.println(n);
		    
	}

}
