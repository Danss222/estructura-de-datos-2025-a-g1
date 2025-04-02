package model;

public class Empleado extends persona{
    private int codigoEmpleado;
    private String cargo;
    private double salario;
    public Empleado(String nombre, int edad,String direccion, int codigoEmpleado, String cargo, double salario){
        super(nombre,edad,direccion);
        this.codigoEmpleado=codigoEmpleado;
        this.cargo=cargo;
        this.salario=salario;
    }
    public int getCodigoEmpleado(){
        return codigoEmpleado;

    }
    public void setCodigoEmpleado(int codigoEmpleado){
        this.codigoEmpleado=codigoEmpleado;

    }
    public String getCargo(){
        return cargo;

    }
    public void setCargo( String cargo ){
        this.cargo=cargo;

    }
    public double getSalario(){
        return salario;

    }
    public void setSalario(double salario){
        this.salario=salario;

    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Codigo Empleado:"+ codigoEmpleado);
        System.out.println("Cargo:"+ cargo);
        System.out.println("Salario:"+salario);

    }
}
