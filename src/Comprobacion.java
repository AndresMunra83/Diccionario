import java.util.*;

public class Comprobacion {
    private Diccionario diccionario;
    private List<String> palabrasSeleccionadas;
    private int respuestasCorrectas;
    private int respuestasIncorrectas;

    public Comprobacion() {
        diccionario = new Diccionario();
        palabrasSeleccionadas = new ArrayList<>();
        respuestasCorrectas = 0;
        respuestasIncorrectas = 0;
        seleccionarPalabras();
    }

    private void seleccionarPalabras() {
        List<String> palabras = new ArrayList<>(diccionario.getPalabras().keySet());
        Collections.shuffle(palabras);
        palabrasSeleccionadas = palabras.subList(0, 5);
    }

    public void comprobar() {
        Scanner scanner = new Scanner(System.in);

        for (String palabraEspañol : palabrasSeleccionadas) {
            System.out.println("Traduce al inglés: " + palabraEspañol);
            String traduccionUsuario = scanner.nextLine().trim().toLowerCase();

            if (diccionario.getTraduccion(palabraEspañol).equals(traduccionUsuario)) {
                respuestasCorrectas++;
                System.out.println("¡Correcto!");
            } else {
                respuestasIncorrectas++;
                System.out.println("Incorrecto. La respuesta correcta es: " + diccionario.getTraduccion(palabraEspañol));
            }
        }

        scanner.close();
    }

    public void mostrarResultados() {
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }
}
