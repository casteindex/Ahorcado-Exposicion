/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicion_ahorcado;

/**
 *
 * @author Alejandro
 */
public class Palabra {

    // Atributos
    private String palabra;
    private char[] palabraOriginal;
    private char[] palabraMostrada;
    private int longitudPalabra;

    // Constructor por defecto
    public Palabra() {
    }

    // Constructor con parámetros
    public Palabra(String palabra) {
        this.palabraOriginal = palabra.toUpperCase().toCharArray();
        this.longitudPalabra = palabra.length();
        // Inicializar palabraMostrada con '_'
        this.palabraMostrada = new char[longitudPalabra];
        for (int i = 0; i < longitudPalabra; i++) {
            this.palabraMostrada[i] = '_';
        }
    }

    // Métodos
    public void printPalabraOriginal() {
        for (int i = 0; i < longitudPalabra; i++) {
            System.out.print(palabraOriginal[i] + " ");
        }
        System.out.println();
    }

    public void printPalabraMostrada() {
        for (int i = 0; i < longitudPalabra; i++) {
            System.out.print(palabraMostrada[i] + " ");
        }
        System.out.println();
    }

    // Revela las letras encontradas
    public void updatePalabraMostrada(char letra) {
        for (int i = 0; i < longitudPalabra; i++) {
            if (letra == palabraOriginal[i]) {
                palabraMostrada[i] = letra;
            }
        }
    }
    

}
