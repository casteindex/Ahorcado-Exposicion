/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exposicion_ahorcado;

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
        Scanner scanner = new Scanner(System.in);

        Juego juego = new Juego();
        juego.setPiscinaPalabras(palabras);

        // ===== Pruebas (borrar después)      
        Palabra palabra = new Palabra("Azucar");
        palabra.printPalabraMostrada();
        palabra.printPalabraOriginal();

        while (true) {
            System.out.print("> Ingrese una letra: ");
            char letra = Character.toUpperCase(scanner.next().charAt(0));

            palabra.updatePalabraMostrada(letra);
            palabra.printPalabraMostrada();
            System.out.println(palabra.isPalabraAdivinada());
        }
        // ===== Fin de pruebas
    }

}
