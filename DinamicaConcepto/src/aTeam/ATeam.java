package aTeam;

import watermelon.FileManager;
import java.util.Scanner;
public class ATeam {

	public static void main(String[] args) {
		//wrong on test 5
		Scanner entrada = new Scanner(System.in);
		//int i=0;
		int cont=0;
		int suma=0;
			int teclado= entrada.nextInt();
		
		for(int i=1;i<(teclado*3)+1;i++){
			 suma+=entrada.nextInt();
		   	 if(i%3==0){
		   		 if(suma>1){
		   		 cont++;
		   		 suma=0;
		   		 }
		   	 }
		}
		System.out.println(cont);
		}
	}


