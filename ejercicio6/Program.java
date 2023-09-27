package herenciaEj6;

public class Program {

	public Program() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nombre nombre1 = new Nombre ("Carlos ","Alegria ","Velasco ");
		Direccion direccion = new Direccion(nombre1.getNombre(),nombre1.getPrimerApellido(),nombre1.getSegundoApellido(),"Panoramico","Pasto","Nariño",520002);
		System.out.println("Datos registrados con exito:" + direccion);
	}


	}


