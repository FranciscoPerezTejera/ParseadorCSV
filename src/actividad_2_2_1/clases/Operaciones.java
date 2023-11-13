package actividad_2_2_1.clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operaciones {

    private static int contador = 0;
    private List<Estudiante> estudiantes;

    public String mostrarDatosCSV(String fichero) {

        List<Estudiante> estudiantes = new ArrayList<>();
        StringBuilder resultado = new StringBuilder();

        try (Scanner scanner = new Scanner(new File(fichero))) {

            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] campos = line.split(",");

                if (campos.length == 6) {
                    String dni = campos[0].trim();
                    String nombre = campos[1].trim();
                    int edad = Integer.parseInt(campos[2].trim());
                    int dia = Integer.parseInt(campos[3].trim());
                    int mes = Integer.parseInt(campos[4].trim());
                    int anno = Integer.parseInt(campos[5].trim());

                    Fecha fechaMatricula = new Fecha(dia, mes, anno);
                    Estudiante estudiante = new Estudiante(dni, nombre, edad, fechaMatricula);
                    estudiantes.add(estudiante);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        this.estudiantes = estudiantes;

        estudiantes.forEach(estudiante -> {
            resultado.append("Alumnado nº ").append(++contador).append(" --> ");
            resultado.append(String.format("DNI: %s", estudiante.getDni()));
            resultado.append(String.format(" Nombre: %s", estudiante.getNombre()));
            resultado.append(String.format(" Edad: %d", estudiante.getEdad()));
            resultado.append(estudiante.toString());
            resultado.append("\n-------------------------------------------------------------------------\n");
        });
        resultado.append("[i]Numero de estudiantes matriculados para alñmacenar en fichero externo: " + contador);

        return resultado.toString();
    }

    public void escribirFicheroBinario() {

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src\\ficheros\\estudiantes.dat"))) {
            for (Estudiante estudiante : estudiantes) {
                outputStream.writeObject(estudiante);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
