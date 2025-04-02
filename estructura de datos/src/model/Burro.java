package model;

public class Burro extends Animal {
    private String colorpelaje;

    public Burro(String nombre, int edad , float peso, String colorpelaje){
        super ( nombre,edad,peso);
        this.colorpelaje= colorpelaje;

    }

    public String getcolorpelaje(){return colorpelaje;}
    public void setcolorpelaje(String colorpleaje) {this.colorpelaje= colorpelaje; }

    @Override

    public void comer(){
        System.out.println("soy un burro y estoy comiendo pasto.");

    }
    @Override
    public void dormir(){
        System.out.println("estoy durminedo bajo un arbol. ");

    }
    @Override
    public void desplazar(){
        System.out.println("estoy caminando lentamente.");

    }
}
