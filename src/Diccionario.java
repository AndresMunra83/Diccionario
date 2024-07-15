import java.util.HashMap;
import java.util.Map;

public class Diccionario {
    private Map<String, String> palabras;

    public Diccionario() {
        palabras = new HashMap<>();
        inicializarDiccionario();
    }

    private void inicializarDiccionario() {
        palabras.put("dia", "day");
        palabras.put("noche", "night");
        palabras.put("perro", "dog");
        palabras.put("gato", "cat");
        palabras.put("helado", "ice cream");
        palabras.put("carro", "car");
        palabras.put("avion", "plane");
        palabras.put("helicoptero", "helicopter");
        palabras.put("poner", "put");
        palabras.put("llave", "key");
        palabras.put("raton", "mouse");
        palabras.put("cantar", "sing");
        palabras.put("dibujar", "draw");
        palabras.put("rojo", "red");
        palabras.put("amarillo", "yellow");
        palabras.put("libro", "book");
        palabras.put("mercado", "market");
        palabras.put("biblioteca", "library");
        palabras.put("mano", "hand");
        palabras.put("sonrisa", "smile");
    }

    public String getTraduccion(String palabraEspañol) {
        return palabras.get(palabraEspañol);
    }

    public Map<String, String> getPalabras() {
        return palabras;
    }
}