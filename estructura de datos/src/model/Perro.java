package model;

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre , int edad , float peso, String raza) {
        super(nombre, edad, peso);
        this.raza = raza;
    }
    public String getRaza(){return raza ;}
    public void setRaza (String raza ) {this.raza=raza;}

    public void comer() {
        System.out.println("soy un perro y estoy comiendo croquetas.");
    }

    public void dormir () {
        System.out.println("estoy durmiendo en mi cama.");
    }
    @Override
    public void desplazar(){
        System.out.println("estoy corrirndo en el parque.");
    }
}
