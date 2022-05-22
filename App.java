package tarea2.src;
public class App {
    public static void main(String[] args) {
        Estacionamiento.inicializar(2, 60, 180); 
        // se inicializa el estacionamiento con 2 lugares, 
        // $60 para el ingreso, $180 la noche
            
        Cliente juan = new Cliente("Juan");
        Auto autoJuan = new Auto(Auto.MERCEDEZ_BENZ,"BCF-235", juan);
        
        Estacionamiento.ingresarAuto(autoJuan); 
        // se inicializa la cuenta corriente a Juan y se le agrega $60
        
        Cliente ana = new Cliente("Ana");
        Auto autoAna = new Auto(Auto.FIAT, "BRF-535", ana);
        Estacionamiento.ingresarAuto(autoAna);
        
        Estacionamiento.salidaAuto(autoJuan);
        
        Estacionamiento.nuevoDia(); 
        // cierra el estacionamiento y abre el dia siguiente
        
        Estacionamiento.ingresarAuto(autoJuan);
        Cliente felipe = new Cliente("Felipe");
        Auto autoFelipe = new Auto(Auto.PEUGEOT, "BFD-124", felipe);
        Estacionamiento.ingresarAuto(autoFelipe);
            // notar que no entra el auto, asi que no tiene ningun efecto
        
        Estacionamiento.calcular();
        }
        
    }

    