/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exposicion_ahorcado;

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
        { // Palabras Dificiles
            "dardo", "jinete", "truco", "circo", "yate",
            "cruz", "plomo", "globo", "sexto", "banco",}
    };

    public static void main(String[] args) {
        Juego juego = new Juego();

        juego.setPiscinaPalabras(palabras);

    }

}
