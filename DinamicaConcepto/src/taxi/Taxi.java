package taxi;

import java.util.ArrayList;
import java.util.Scanner;

import watermelon.FileManager;

public class Taxi {

	public static void main(String[] args) {
         int taxi=0; 
         int cant1=0;
         int cant2=0;
         int grupos=0;
                 
//      String lineas [] = FileManager.readLines("C:\\Users\\Leandro\\Desktop\\Workspace\\Nueva carpeta\\DinamicaConcepto\\src\\taxi\\lectura.txt");
//      datos=lineas[1];
//      String numeros[] = datos.split(" ");
        Scanner entrada =new Scanner(System.in);
         grupos= entrada.nextInt();
      
      ArrayList<Integer> ni�os = new ArrayList<Integer>();
      
      for(int i=0;i<grupos;i++){ //ingreso datos al arraylist
    	  ni�os.add(entrada.nextInt());
      }
          
      while(ni�os.contains(4)==true){      //buscar 4, agregar al contador y eliminar del arreglo
    	  taxi++;
      	 ni�os.remove(ni�os.indexOf(4));
      }
      
      //System.out.println("taxi despues de buscar 4= "+taxi+" cantidad de unos= "+cant1);
      
      while(ni�os.contains(1)){ // buscar 1
    	  cant1++;
    	  ni�os.remove(ni�os.indexOf(1));
         if(cant1%4==0){ // si el resto es 0 sumar un taxi y restar 4
        	 taxi++;
        	 cant1=cant1-4;
         }
      }
    	  
      //System.out.println("taxi despues de buscar 1 ="+taxi+" cantidad de unos= "+cant1 );
      
      while(ni�os.contains(3)==true){ //buscar 3
    	  if(cant1>0){
    		  taxi++;
    		  ni�os.remove(ni�os.indexOf(3));
    		  cant1=cant1-1;
    	  } else{ //sino se queda solo con el 3
    		  taxi++;
    		  ni�os.remove(ni�os.indexOf(3));
    	  } 
    	  
      }
      
     // System.out.println("taxi despues de buscar 3= "+taxi+" cantidad de unos= "+cant1);
      
      while(ni�os.contains(2)==true){//buscar 2
    	  cant2=cant2+2;
    	  ni�os.remove(ni�os.indexOf(2));
    	  if(cant2%4==0){  //si cantidad 2 es divisible por 2
    		  taxi++;
    		  cant2=cant2-4;
    	  }else{ //sino intentar unir algun 1 sobrante con un 2
    		  if(cant1>0 && cant2==2){
    			  taxi++;
    			  cant1=cant1-2;
    		  }else{if(cant1>0 && cant2>0){
    			  taxi++;
    			  cant2=cant2-2;
    			  cant1=cant1-1;
    		       }}
    		  }}
      if(cant1>0 || cant2>0){
    	  taxi++;
      }
      
     // System.out.println("taxi despues de buscar 2= "+taxi+" cantidad de unos= "+cant1);
      
      System.out.println(taxi);
     // System.out.println("unos sobrantes"+cant1);
    //  System.out.println("dos sobrantes "+cant2);
	}

}
