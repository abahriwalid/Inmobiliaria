import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Inmueble> inmuebles = new ArrayList<>();

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bienvenido a la aplicación de gestión inmobiliaria.");

        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Dar de alta un inmueble");
            System.out.println("2. Modificar un inmueble");
            System.out.println("3. Dar de baja un inmueble");
            System.out.println("4. Salir");

            try {
                int opcion = Integer.parseInt(br.readLine());

                switch (opcion) {
                    case 1:
                        darDeAltaInmueble(br);
                        break;
                    case 2:
                        modificarInmueble(br);
                        break;
                    case 3:
                        darDeBajaInmueble(br);
                        break;
                    case 4:
                        System.out.println("Gracias por usar la aplicación. ¡Hasta luego!");
                        return;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione nuevamente.");
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("Error: Introduzca un número válido.");
            }
        }
    }
    private static void darDeAltaInmueble(BufferedReader br) throws IOException {
        System.out.println("Introduce la dirección del inmueble: ");
        String direccion = br.readLine();
        System.out.println("Introduzca el tipo de inmueble: ");
        String tipo = br.readLine();
        System.out.println("Introduzca un el precio: ");
        double precio = Double.parseDouble(br.readLine());
        Inmueble inmuebleNuevo = new Inmueble(direccion,tipo, precio);
        inmuebles.add(inmuebleNuevo);
        System.out.println("Inmueble nuevo creado correctamente.");

    }

    private static void modificarInmueble(BufferedReader br) throws IOException {
        System.out.println("ghghg");
    }

    private static void darDeBajaInmueble(BufferedReader br) throws IOException {

    }
}