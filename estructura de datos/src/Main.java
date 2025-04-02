import model.Burro;
import model.Gato;
import model.Perro;
import model.Pez;
import service.Animal.Animalservice;

public class Main {
    public static void main(String[] args) {
        Animalservice service = new Animalservice();


        service.agregarAnimal(new Perro("firulais",4, 1.25f,"labrador"));
        service.agregarAnimal(new Gato("michi",3,4.2f,true));
        service.agregarAnimal(new Burro("tito",10,100.0f,"gris"));
        service.agregarAnimal(new Pez("Nemo",1,0.3f,"agua salada"));

        service.mostraraciones();
    }
}
