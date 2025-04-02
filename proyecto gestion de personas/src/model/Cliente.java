package model;

public class Cliente extends persona {
    private int numeroCliente;
    private String historialCompras;

    public Cliente(String nombre, int edad, String direccion, int numeroCliente, String historialCompras){
        super(nombre,edad,direccion);
        this.numeroCliente=numeroCliente;
        this.historialCompras=historialCompras;

    }
    public int getNumeroCliente(){
        return numeroCliente;

    }
    public void setNumeroCliente(int numeroCliente){
        this.numeroCliente=numeroCliente;

    }
    public String gethistorialCompras(){
        return historialCompras;


    }
    public void setHistorialCompras(String historialCompras){
        this.historialCompras=historialCompras;

    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Numero de clinete:"+ numeroCliente);
        System.out.println("Historial de compras:"+ historialCompras);




    }
}
