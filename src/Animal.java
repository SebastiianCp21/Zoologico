
public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String tipoAnimal;

    public Animal(String nombre, int edad, String tipoAnimal) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoAnimal = tipoAnimal;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Tipo de Animal: " + tipoAnimal);
    }

    public abstract void hacerSonido();
}
