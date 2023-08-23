/**
 * este es el programa principal
 */
package aplicacioncirculo;
import java.util.Scanner;

public class Program {

	public Program() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		// TODO Auto-generated method stub
		circulo miCirculo=new circulo();
		System.out.println("Ingrese el radio del circulo");
		miCirculo.setRadio(teclado.nextDouble());
		System.out.println(miCirculo.getArea());
		System.out.println(miCirculo);

	}

}
