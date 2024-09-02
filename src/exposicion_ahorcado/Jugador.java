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

    // Arreglo de letras disponibles
    public char[] letrasDisponibles = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
        'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',};

    public int numLetras = letrasDisponibles.length;

    // Atributos para el jugador
    private String nombre;
    private int puntuacion;
    private int vidasRestantes;
    private int juegosGanados;
    private int juegosPerdidos;

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

    public char[] getLetrasDisponibles() {
        return letrasDisponibles;
    }

    public void setLetrasDisponibles(char[] letrasDisponibles) {
        this.letrasDisponibles = letrasDisponibles;
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

    public int getJuegosPerdidos() {
        return juegosPerdidos;
    }

    public void setJuegosPerdidos(int juegosPerdidos) {
        this.juegosPerdidos = juegosPerdidos;
    }

    // Método
    public void printLetrasDisponibles() {
        for (int i = 0; i < numLetras; i++) {
            System.out.print(letrasDisponibles[i] + " ");
        }
        System.out.println();
    }

    public void updateLetrasIntentadas(char letra) {
        for (int i = 0; i < numLetras; i++) {
            if (letrasDisponibles[i] == letra) {
                letrasDisponibles[i] = '-';
            }
        }
    }

}
