package model;

public abstract class persona {
    private String nombre;
    private int edad;
    private String direccion;

    public persona (String nombre, int edad, String direccion){
        this.nombre=nombre;
        this.edad=edad;
        this.direccion=direccion;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre ){
        this.nombre=nombre;

    }
    public int getEdad(){
        return edad;

    }
    public void setEdad(int edad){
        this.edad= edad;
    }
    public String getDireccion(){
        return direccion;

    }
    public void setDireccion(String direccion){
        this.direccion=direccion;

    }
    public void mostrarInformacion(){
        System.out.println("Nombre:"+nombre);
        System.out.println("Edad:"+ edad);
        System.out.println("Direccion"+direccion);

    }
}
