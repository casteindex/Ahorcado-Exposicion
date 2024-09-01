/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicion_ahorcado;

/**
 *
 * @author Alejandro
 */
public class Jugador {
    
   // Atributos para el jugador
    private String nombre;
    private int puntuacion;
    private char[] letrasIntentadas;
    private int vidasRestantes;
    private int juegosGanados;
    
    //Setter y getter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public char[] getLetrasIntentadas() {
        return letrasIntentadas;
    }

    public void setLetrasIntentadas(char[] letrasIntentadas) {
        this.letrasIntentadas = letrasIntentadas;
    }

    public int getVidasRestantes() {
        return vidasRestantes;
    }

    public void setVidasRestantes(int vidasRestantes) {
        this.vidasRestantes = vidasRestantes;
    }

    public int getJuegosGanados() {
        return juegosGanados;
    }

    public void setJuegosGanados(int juegosGanados) {
        this.juegosGanados = juegosGanados;
    }
    
}
