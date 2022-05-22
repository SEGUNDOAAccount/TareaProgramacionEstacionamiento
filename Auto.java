package tarea2.src;

public class Auto{
    String matricula;
    String Modelo;
    Cliente cliente;
    public static final String MERCEDEZ_BENZ = "mercedes_benz";
    public static final String FIAT = "fiat";
    public static final String PEUGEOT = "peugeot";


    public Auto(String Modelo,String matricula, Cliente cliente) {
        this.matricula = matricula;
        this.Modelo = Modelo;
        this.cliente = cliente;
    }
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
