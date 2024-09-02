/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicion_ahorcado;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Juego {

    // Atributos
    private String palabraSecreta;
    private String[][] piscinaPalabras;
    private char[] letrasAdivinadas;
    private int nivelDificultad;
    private boolean juegoTerminado;

    // Getters y Setters
    public String getPalabraSecreta() {
        return palabraSecreta;
    }

    public void setPalabraSecreta(String palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }

    public String[][] getPiscinaPalabras() {
        return piscinaPalabras;
    }

    public void setPiscinaPalabras(String[][] piscinaPalabras) {
        this.piscinaPalabras = piscinaPalabras;
    }

    public char[] getLetrasAdivinadas() {
        return letrasAdivinadas;
    }

    public void setLetrasAdivinadas(char[] letrasAdivinadas) {
        this.letrasAdivinadas = letrasAdivinadas;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public boolean isJuegoTerminado() {
        return juegoTerminado;
    }

    public void setJuegoTerminado(boolean juegoTerminado) {
        this.juegoTerminado = juegoTerminado;
    }

}
