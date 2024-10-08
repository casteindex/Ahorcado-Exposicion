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
    public void Palabra(String palabra) {
        this.palabraOriginal = palabra.toUpperCase().toCharArray();
        this.longitudPalabra = palabra.length();
        // Inicializar palabraMostrada con '_'
        this.palabraMostrada = new char[longitudPalabra];
        for (int i = 0; i < longitudPalabra; i++) {
            this.palabraMostrada[i] = '_';
        }
    }

    // Getters y setters
    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public char[] getPalabraOriginal() {
        return palabraOriginal;
    }

    public void setPalabraOriginal(char[] palabraOriginal) {
        this.palabraOriginal = palabraOriginal;
    }

    public char[] getPalabraMostrada() {
        return palabraMostrada;
    }

    public void setPalabraMostrada(char[] palabraMostrada) {
        this.palabraMostrada = palabraMostrada;
    }

    public int getLongitudPalabra() {
        return longitudPalabra;
    }

    public void setLongitudPalabra(int longitudPalabra) {
        this.longitudPalabra = longitudPalabra;
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
    public boolean updatePalabraMostrada(char letra) {
        boolean resultado = false;
        for (int i = 0; i < longitudPalabra; i++) {
            if (letra == palabraOriginal[i]) {
                palabraMostrada[i] = letra;
                resultado = true;
            }
        }
        return resultado; // Devuelve si se hizo o cambio a palabraMostrada
    }

    public boolean isPalabraAdivinada() {
        for (int i = 0; i < longitudPalabra; i++) {
            if (palabraOriginal[i] != palabraMostrada[i]) {
                return false;
            }
        }
        return true;
    }

}
