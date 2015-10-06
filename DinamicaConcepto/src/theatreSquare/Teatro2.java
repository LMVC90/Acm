package theatreSquare;

import java.util.Scanner;

public class Teatro2 {

	public static void main(String[] args) {
		int y=0;
		int x=0;
		int resta;
		int cont=1;
		Scanner entrada = new Scanner(System.in);
			int m=entrada.nextInt();
		    int n=entrada.nextInt();
		    int a=entrada.nextInt();
		    
		    x=m*n;
	    	y=a*a;
	    	resta=x;
	    	
		    do{
		    	resta-=y;
		    	cont++;
		    	System.out.println(resta);
		    }while(resta>0);
		    
		    if(resta<0){
		    System.out.println(cont);
		    }else{
		    	System.out.println(cont-1);
		  }
		    
	}

}
