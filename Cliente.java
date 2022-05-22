package tarea2.src;
public class Cliente {

    String nombre;
    int cuentaCorriente;
    public Cliente(String nombre) {
        this.nombre = nombre;
    } 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(int cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }
    public void sumarCuenta (int cantidad) {
        this.cuentaCorriente += cantidad;
    }

}