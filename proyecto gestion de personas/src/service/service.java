package service;
import model.persona;
import java.util.ArrayList;
import java.util.List;


public class service {
    private List<persona> personas= new ArrayList<>();
    public void agregarPersonas ( persona perosana ){personas.add(perosana);}
    public void mostrarDatos(){
        for(persona persona : personas ){
            persona.mostrarInformacion();
        }
    }
}
