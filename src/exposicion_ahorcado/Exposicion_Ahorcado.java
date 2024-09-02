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

    static Scanner scanner = new Scanner(System.in); // Escanea caracteres
    static Scanner num = new Scanner(System.in);

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

    // Inicializar clases
    static Juego juego = new Juego();
    static Palabra palabraSecreta = new Palabra();
    static Jugador jugador = new Jugador();
    static Ahorcado ahorcado = new Ahorcado();

    public static void main(String[] args) {

        // Pedir datos del usuario
        System.out.print("> Ingresa tu nombre: ");
        jugador.setNombre(scanner.nextLine());
        System.out.println("Bienvenido " + jugador.getNombre() + "!\n");

        // Definir máximo intentos posibles (depende de los pasos del dibujo)
        jugador.setVidasRestantes(ahorcado.estadoMaximo);

        boolean salir = false;
        while (!salir) {
            System.out.println("---------- Menu ----------");
            System.out.println("1. Jugar");
            System.out.println("2. Ver tu informacion");
            System.out.println("3. Salir");

            System.out.print("> Ingrese una opcion: ");
            int opcion = num.nextInt();

            switch (opcion) {
                case 1:
                    runAhorcado();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("---------- Informacion del jugador ----------");
                    System.out.println("Partidas ganadas: " + jugador.getJuegosGanados());
                    System.out.println("Partidas perdidas: " + jugador.getJuegosPerdidos());
                    System.out.println("Puntuacion: " + jugador.getJuegosGanados() * 10);
                    System.out.println();
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida\n");
                    break;
            }

        }

    }

    public static void runAhorcado() {
        // Menu de dificultad
        System.out.println();
        System.out.println("---------- Nivel de Dificultad ----------");
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

        System.out.println(); // Espacio para separar Menu de dificultad del resto del juego
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
                jugador.setJuegosGanados(jugador.getJuegosGanados() + 1);
                System.out.println("Felicidades " + jugador.getNombre() + "! Ganaste!");
                System.out.println();
                break;
            } else if (jugador.getVidasRestantes() == 0) {
                jugador.setJuegosPerdidos(jugador.getJuegosPerdidos() + 1);
                System.out.println("Perdiste :(");
                System.out.println("La palabra secreta era: " + palabraSeleccionada);
                System.out.println();
                break;
            }

            System.out.println();
        }
    }

    public static String seleccionarPalabraAleatoria(String[][] piscinaPalabras, int dificultad) {
        Random random = new Random();
        dificultad = dificultad - 1;
        int indicePalabra = random.nextInt(piscinaPalabras[dificultad].length);
        return piscinaPalabras[dificultad][indicePalabra];
    }

}
