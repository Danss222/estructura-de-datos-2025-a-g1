package model;

public class Pez extends Animal {
    private String tipoAgua;
    public Pez(String nombre, int edad, float peso, String tipoAgua){
        super(nombre,edad,peso);
        this.tipoAgua=tipoAgua;
    }

    public String gettipoAgua(){return tipoAgua;}

    public void settipoAgua(String tipoAgua){this.tipoAgua=tipoAgua;}

    @Override
    public void comer (){
        System.out.println("sou un pez y esoty cominedo algas.");

    }
    @Override
    public void dormir(){
        System.out.println("estoy durminedo flotando.");

    }
    @Override
    public void desplazar(){
        System.out.println("estoy nadando en el agua.");
    }

}
