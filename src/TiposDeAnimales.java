
public class TiposDeAnimales {

    public static class Leon extends Animal {
        public Leon(String nombre, int edad) {
            super(nombre, edad, "Carnivoro");
        }

        @Override
        public void hacerSonido() {
            System.out.println(nombre + " dice: ¡Grgr Grgr!");
        }
    }

    public static class Serpiente extends Animal {
        public Serpiente(String nombre, int edad) {
            super(nombre, edad, "Carnivoro");
        }

        @Override
        public void hacerSonido() {
            System.out.println(nombre + " dice: ¡Ssss Ssss!");
        }
    }
    public static class Vaca extends Animal{
        public Vaca(String nombre, int edad){
            super(nombre, edad, "Herbivoro");
        }
        @Override
        public void hacerSonido(){
            System.out.println(nombre + "dice: ¡Muuuu!");
        }
    }
    public static class Lobo extends Animal {
        public Lobo(String nombre, int edad) {
            super(nombre, edad, "Carnivoro");
        }

        @Override
        public void hacerSonido() {
            System.out.println(nombre + "dice: ¡Auuuu Auuu!");
        }
    }
    public static class Buho extends Animal {
        public Buho(String nombre, int edad) {
            super(nombre, edad, "Carnivoro");
        }

        @Override
        public void hacerSonido() {
            System.out.println(nombre + "dice: ¡Uuuu Uuuu!");
        }
    }

}
