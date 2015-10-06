package Binario;

public class Binnario {
    int a,b,busqueda;
	int numero=0;
	int resto;
	
	
public int Sumar(int a, int b){
	this.numero=a;
	do{
	if(numero%2==1){
		resto++;
	}
	numero=numero/2;
	}while(numero>0);	
	return resto;
}


  public static void main(String[] args){
			
                  Binnario resultado = new Binnario();
                  Binnario buscando = new Binnario();      
     int digitoA=15;          
     int digitoB=18;
     
     int[] vector = new int[digitoB];
     
     vector[digitoA] = resultado.Sumar(digitoA,digitoB);   
     
                     // buscando.buscar(resultado.numero); 
   
                      System.out.println(resultado.Sumar(digitoA,digitoB));   
  }
		
	}

