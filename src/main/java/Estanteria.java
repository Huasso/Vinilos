public class Estanteria {

    private String[][] vinilos;
    private int cantidad;

    public Estanteria() {
        vinilos = new String[100][3];
        cantidad = 0;
    }

    public void agregarVinilo(Vinilos v) {
        if (cantidad < 100) {
            vinilos[cantidad][0] = v.getartista();
            vinilos[cantidad][1] = v.getalbum();
            vinilos[cantidad][2] = String.valueOf(v.getaño());
            cantidad++;
            System.out.println("Vinilo agregado");
        } else {
            System.out.println("La estanteria está llena");
        }
    }

    public void eliminarVinilo(String album) {
        boolean encontrado = false;
        for (int i = 0; i < cantidad; i++) {
            if (vinilos[i][1].equalsIgnoreCase(album)) {
                for (int j = i; j < cantidad - 1; j++) {
                    vinilos[j][0] = vinilos[j + 1][0];
                    vinilos[j][1] = vinilos[j + 1][1];
                    vinilos[j][2] = vinilos[j + 1][2];
                }
                cantidad--;
                encontrado = true;
                System.out.println("Vinilo eliminado");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro el vinilo");
        }
    }

    public void mostrarEstanteria() {
        System.out.println("\n ESTANTERÍA DE VINILOS ");
        System.out.println("Cantidad de vinilos: " + cantidad + "/100");

        if (cantidad == 0) {
            System.out.println("La estantería está vacía.");
        } else {
            for (int i = 0; i < cantidad; i++) {
                System.out.println((i + 1) + ". Artista: " + vinilos[i][0]);
                System.out.println("   Álbum: " + vinilos[i][1]);
                System.out.println("   Año: " + vinilos[i][2]);
            }
        }
    }
}
