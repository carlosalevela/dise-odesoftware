package herenciaA;

public class Gato extends Mamifero {
    public Gato(String name) {
        
       
super(name);
    }

    public void greets() {
        System.out.println();
        System.out.println ("Meow");
    }

    public String toString() {
        return "Gato[" + super.toString() + "]";
    }


    }

