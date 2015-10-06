package ejemploArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Number;
import java.util.LinkedList;
public class EjemploLinkedList {

	public static void main(String[] args) {

		LinkedList<String> miListaStrings = new LinkedList<String>();
		miListaStrings.add("Hola");
		miListaStrings.add("Chao");
		
		ArrayList<String> miArrayListStrings = new ArrayList<String>(miListaStrings);
		System.out.println("contenido LinkedList "+ miListaStrings);
		System.out.println("contenido del Array "+ miArrayListStrings);
		

	}

}
