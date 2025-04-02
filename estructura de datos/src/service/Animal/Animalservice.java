package service.Animal;

import model.Animal;

import java.util.ArrayList;
import java.util.List;

public class Animalservice {
    private List<Animal> animales= new ArrayList<>();

    public void agregarAnimal(Animal animal){
        animales.add(animal);
    }

    public void mostraraciones(){
        for(Animal a : animales){
            System.out.println("Nombre: "+ a.getNombre());
            a.comer();
            a.dormir();
            a.desplazar();
            System.out.println();
        }
    }
}
