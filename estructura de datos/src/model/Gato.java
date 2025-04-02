package model;

public class Gato extends Animal {
    private boolean esDomestico;
    public Gato(String nombre, int edad, float peso, boolean esDomestico) {
        super (nombre,edad, peso);
        this.esDomestico= esDomestico;

    }
    public boolean isesDomestico() {return esDomestico;}
public void setDomestico( boolean esDomestico){this. esDomestico= esDomestico;}

    @Override
    public void comer (){
        System.out.println("soy un gato y estoy cominedo atun.");
    }
    @Override
    public void dormir(){
       System.out.println("estoy durmiendo en el sofan.");

    }
    @Override
    public void desplazar (){
        System.out.println("estoy saltando por los tejados.");


    }


}
