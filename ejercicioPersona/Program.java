package herenciaP;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        Persona persona1 = new Persona();
        
        System.out.println("Ingrese el nombre");
        persona1.setName(teclado.nextLine());
        System.out.println("Ingrese la dirección");
        persona1.setDireccion(teclado.nextLine());
        
 
        System.out.println("Datos registrados: " + persona1);

        
        Estudiante estudiante = new Estudiante(persona1.getName(), persona1.getDireccion(), "", 0, 0);
        
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Ingrese el programa");
        estudiante.setPrograma(teclado2.nextLine());
        System.out.println("Ingrese el Año");
        estudiante.setAño(teclado2.nextInt());
        teclado2.nextLine();
        System.out.println("Ingrese la tarifa");
        estudiante.setTarifa(teclado2.nextDouble());
        

        System.out.println("Estudiante con datos registrados: " + estudiante);
        

        Personal empleado = new Personal(persona1.getName(), persona1.getDireccion(), "", 0);
        
        Scanner teclado3 = new Scanner(System.in);
        System.out.println("Ingrese La escuela");
        empleado.setEscuela(teclado3.nextLine());
        System.out.println("Ingrese Salario");
        empleado.setPago(teclado3.nextDouble());
        
        System.out.println("Trabajador con datos registrados: " + empleado);
    }
}
