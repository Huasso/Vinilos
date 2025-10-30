import java.util.Scanner;

public class Menu {
    private Estanteria estanteria;
    private Scanner sc;

    public Menu() {
        estanteria = new Estanteria();
        sc = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("--- MENU DE VINILOS ---");
            System.out.println("1. Agregar vinilo");
            System.out.println("2. Eliminar vinilo");
            System.out.println("3. Mostrar estanteria");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            // Validar que sea un número
            while (!sc.hasNextInt()) {
                System.out.println("Ingresa un numero valido.");
                sc.next();
            }

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    agregarVinilo();
                    break;
                case 2:
                    eliminarVinilo();
                    break;
                case 3:
                    estanteria.mostrarEstanteria();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    private void agregarVinilo() {
        System.out.print("Ingrese el artista: ");
        String artista = sc.nextLine();

        System.out.print("Ingrese el nombre del album: ");
        String album = sc.nextLine();

        System.out.print("Ingrese el año del vinilo: ");
        int año;

        while (!sc.hasNextInt()) {
            System.out.println("Debe ingresar un numero para el año");
            sc.next();
        }
        año = sc.nextInt();
        sc.nextLine();

        Vinilos nuevo = new Vinilos(artista, album, año);
        estanteria.agregarVinilo(nuevo);
    }

    private void eliminarVinilo() {
        System.out.print("Ingrese el album a eliminar: ");
        String album = sc.nextLine();
        estanteria.eliminarVinilo(album);
    }
}
