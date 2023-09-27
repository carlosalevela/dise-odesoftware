package herenciaS;

public class Program {

	public Program() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape1 = new Shape("red", true);
		Circulo circulo1 = new Circulo(3.14);
		Rectangulo rectangulo1 = new Rectangulo(3.15,2.3); 
		Cuadrado cuadrado1 = new Cuadrado(23.1, rectangulo1.color,rectangulo1.filled,rectangulo1.getLength(),rectangulo1.getWidth());
		
		
		System.out.println(shape1);
		System.out.println(circulo1);
		System.out.println(rectangulo1);
		System.out.println(cuadrado1);
		

	}

	}


