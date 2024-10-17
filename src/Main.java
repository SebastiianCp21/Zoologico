
public class Main {
    public static void main(String[] args) {
        Animal leon = new TiposDeAnimales.Leon("Leon Simba", 5);
        Animal serpiente = new TiposDeAnimales.Serpiente("Serpiente Mimi", 3);
        Animal vaca = new TiposDeAnimales.Vaca("Vaca Lola", 7);
        Animal lobo = new TiposDeAnimales.Lobo("Lobo Raul", 2);
        Animal buho = new TiposDeAnimales.Buho("Buho Julio", 1);

        leon.mostrarInformacion();
        leon.hacerSonido();

        serpiente.mostrarInformacion();
        serpiente.hacerSonido();

        vaca.mostrarInformacion();
        vaca.hacerSonido();

        lobo.mostrarInformacion();
        lobo.hacerSonido();

        buho.mostrarInformacion();
        buho.hacerSonido();

    }
}
