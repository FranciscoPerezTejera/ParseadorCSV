package actividad_2_2_1;

import actividad_2_2_1.clases.Operaciones;

public class Main {

    public static void main(String[] args) {

        Operaciones operaciones = new Operaciones();
        String datos;

        datos = operaciones.mostrarDatosCSV("src\\ficheros\\DatosAleatorios.csv");
        System.out.println(datos);
        operaciones.escribirFicheroBinario();
    }

}
