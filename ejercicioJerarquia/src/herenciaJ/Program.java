package herenciaJ;

public class Program {

	public Program() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circulo circulo = new Circulo();
        circulo.leerRadio(6);
        System.out.println("Área del círculo: " + circulo.area());
        System.out.println("Circunferencia del círculo: " + circulo.circunferencia());

        Cilindro cilindro = new Cilindro();
        cilindro.leerRadio(6);
        cilindro.leerAltura(3,8);
        System.out.println("area del cilindro: " + cilindro.areac());
        System.out.println("Volumen del cilindro: " + cilindro.volumen());
        CilindroHueco cilindroHueco = new CilindroHueco();
        cilindroHueco.leerRadio(4);
        cilindroHueco.leerAltura(2,0);
        cilindroHueco.leerRadioInterior(2.0);
        System.out.println("Área superficial externa del cilindro hueco: " + cilindroHueco.areaSuperficialExterna());
        System.out.println("Área superficial interna del cilindro hueco: " + cilindroHueco.areaSuperficialInterna());
        System.out.println("Volumen del cilindro hueco: " + cilindroHueco.volumen());
    }


	}


