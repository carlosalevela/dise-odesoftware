package herenciaA;

public class Perro extends Mamifero {
    public Perro(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Perro another) {
        System.out.println();
        System.out.println("Woof Woof");
    }

    public String toString() {
        return "Perro[" + super.toString() + "]";
    }
}
