package herenciaA;

public class Program {
	    public static void main(String[] args) {
	        Animal animal = new Animal("Orlando");
	        System.out.println(animal);

	        Mamifero mal = new Mamifero("Vaca");
	        System.out.println(mal);

	        Gato gato = new Gato("Koda");
	        System.out.println(gato);
	        gato.greets();

	        Perro perro = new Perro("Coso");
	        System.out.println(perro);
	        perro.greets();
	        perro.greets(perro);
	    }
	}



