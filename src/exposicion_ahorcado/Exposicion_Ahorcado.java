/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exposicion_ahorcado;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Exposicion_Ahorcado {

    static String[][] palabras = {
        { // Palabras Fáciles
            "elefante", "banana", "caramelo", "cascada", "espejismo",
            "camiseta", "palabra", "pelicula", "manzana", "armadura"
        },
        { // Palabras Medias
            "ventana", "escuela", "telefono", "camino", "limon",
            "piedra", "flora", "papel", "barco", "guitarra"
        },
        { // Palabras Difciles
            "dardo", "jinete", "truco", "circo", "yate",
            "cruz", "plomo", "globo", "sexto", "banco",}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Escanea caracteres
        Scanner num = new Scanner(System.in);

        // Inicializar clases
        Juego juego = new Juego();
        Palabra palabraSecreta = new Palabra();
        Jugador jugador = new Jugador();
        Ahorcado ahorcado = new Ahorcado();

        // Pedir datos del usuario
        jugador.setNombre("Jugador 1");
        // Definir máximo intentos posibles (depende de los pasos del dibujo)
        jugador.setVidasRestantes(ahorcado.estadoMaximo);

        // Menu de dificultad
        System.out.println("1. Facil");
        System.out.println("2. Mediano");
        System.out.println("3. Dificil");
        System.out.print("Ingrese el nivel de dificultad que desea: ");
        int dificultad = num.nextInt();

        // Validación. Solo permitir que el número ingresado por el usuario esté entre 1 y 3
        while (dificultad < 1 || dificultad > 3) {
            System.out.print("> Ingrese un numero valido: ");
            dificultad = num.nextInt();
            juego.setNivelDificultad(dificultad);
        }

        juego.setNivelDificultad(dificultad);

        // Selección de Subarreglo (nivel de dificultad)
        juego.setPiscinaPalabras(palabras);
        // Selección de Palabra Secreta (del subarreglo dependiendo del nivel de dificultad)
        String palabraSeleccionada = seleccionarPalabraAleatoria(palabras, dificultad);

        // Pasando el parámetro String palabra a la clase Palabra
        palabraSecreta.Palabra(palabraSeleccionada);

        // Lógica del juego
        while (true) {
            System.out.println("Letras disponibles: ");
            jugador.printLetrasDisponibles();

            System.out.print("> Ingrese una letra: ");
            char letra = Character.toUpperCase(scanner.next().charAt(0));
            jugador.updateLetrasIntentadas(letra);

            // Determina si existe la letra en la palabra secreta
            if (palabraSecreta.updatePalabraMostrada(letra)) {
                System.out.println("Letra correcta, vas muy bien");
                palabraSecreta.printPalabraMostrada();
            } else {
                System.out.println("Letra incorrecta, ten cuidado pierdes vidas");
                jugador.setVidasRestantes(jugador.getVidasRestantes() - 1);
                ahorcado.printPaso(ahorcado.estadoMaximo - jugador.getVidasRestantes() - 1);
                System.out.println("Te restan: " + jugador.getVidasRestantes() + " vidas");
                palabraSecreta.printPalabraMostrada();
            }

            if (palabraSecreta.isPalabraAdivinada()) {
                System.out.println("Ganaste!");
                break;
            } else if (jugador.getVidasRestantes() == 0) {
                System.out.println("Perdiste :(");
                System.out.println("La palabra secreta era: " + palabraSeleccionada);
                break;
            }

        }

    }

    public static String seleccionarPalabraAleatoria(String[][] piscinaPalabras, int dificultad) {
        Random random = new Random();
        dificultad = dificultad - 1;
        int indicePalabra = random.nextInt(piscinaPalabras[dificultad].length);
        return piscinaPalabras[dificultad][indicePalabra];
    }

}
