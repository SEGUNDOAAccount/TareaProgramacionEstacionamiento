package tarea2.src;

import java.util.ArrayList;

public class Estacionamiento {
    static int capacidad;
    static int horario = 7;
    static int cobroEntrada = 60;
    static ArrayList<Auto> autos = new ArrayList<Auto>();
    static int cobroNoche = 180;

    public static void inicializar(int capacidad, int cobroEntrada, int cobroNoche) {
        {
            Estacionamiento.capacidad = capacidad;
            Estacionamiento.cobroEntrada = cobroEntrada;
            Estacionamiento.cobroNoche = cobroNoche;
            Estacionamiento.autos = new ArrayList<Auto>();
        }
        ;
    }

    public static void cobrarEntrada(Auto auto) {
        Cliente cliente = auto.getCliente();
        cliente.setCuentaCorriente(cliente.getCuentaCorriente() + cobroEntrada);
    }

    public static void ingresarAuto(Auto auto) {
        if (capacidad > 0) {
            if (autos.contains(auto)) {
                System.out.println("El auto  ya ha sido ingresado");
            } else {
                if (autos.size() < capacidad) {

                    autos.add(auto);
                    auto.getCliente().sumarCuenta(cobroEntrada);

                    System.out.println("El auto " + auto.getMatricula() + " se ha añadido al estacionamiento");

                } else {
                    System.out.println("El estacionamiento se ha llenado, vuelva otro dia");
                }
            }
        }

    }

    public static void salidaAuto(Auto auto) {
        if (autos.contains(auto)) {
            autos.remove(auto);
            System.out.println("El auto " + auto.getMatricula() + " se ha retirado del estacionamiento");
            System.out.println(
                    auto.getCliente().getNombre() + " Su cuenta corriente Actual es:  " + auto.getCliente().getCuentaCorriente());

        } else {
            System.out.println("El auto " + auto.getMatricula() + " no esta en el estacionamiento");
        }
    }

    public static void nuevoDia() {
        for (Auto auto : autos) {
            if (autos.contains(auto)) {
                auto.getCliente().sumarCuenta(cobroNoche);
            }
        }
    }

    public static void calcular() {
        for (int i = 0; i < autos.size(); i++) {
            if (autos != null) {
                Cliente cliente = autos.get(i).getCliente();
                System.out.println("El cliente " + cliente.getNombre() + " tiene una cuenta corriente de: "
                        + cliente.getCuentaCorriente());
            }
        }
    }
}
