package victor;
import java.util.ArrayList;
import java.util.Scanner;
public class Victor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int victor=entrada.nextInt();
		int ayudante=entrada.nextInt();
		int cont=0; int suma=0;int sub=0;
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		for(int i=0;i<victor;i++){
			numeros.add(entrada.nextInt());
			if(numeros.get(i)==ayudante){
				cont++;
			}
				 suma+=numeros.get(i);
				  if(i>0 && suma==ayudante){
					  cont++;
				  }if(i>1 ){
					  sub=suma-numeros.get(i-2);
					  if(sub==ayudante){
						  cont++;
						  System.out.println(sub);
						  System.out.println(cont);
					  }
				  }
		}
		suma=0;
		for(int j=victor-1;j>-1;j--){
			suma+=numeros.get(j);
			if(suma==ayudante){
				cont++;
			}if(j<numeros.size()-3){
				  suma-=numeros.get(j+2);
				  if(suma==ayudante){
					  cont++;
					  System.out.println(suma);
					  System.out.println(cont);
				  }
			  }
		}  
		System.out.println(cont);
	}

}
