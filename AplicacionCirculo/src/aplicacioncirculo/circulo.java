package aplicacioncirculo;

public class circulo {
	
	private double radio;

	public circulo() {
		// TODO Auto-generated constructor stub
		radio=1.0;
	}

	public circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getArea() {
		double miArea=Math.PI*Math.pow(this.radio, 2);
		return miArea;
		
	}
	public double getCircuferencia() {
		double circuferencia=2*this.radio;
		return circuferencia;
	}

	@Override
	public String toString() {
		return "circulo [radio=" + radio + "]";
	}	
	
	
	
}
