/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicion_ahorcado;

/**
 *
 * @author Alejandro
 */
public class Ahorcado {

    // Todos los pasos de la figura del Ahorcado
    private final String[] dibujoPasos = {
        " _______\n |/\n |\n |\n |\n |\n_|___\n",
        " _______\n |/\n |     O\n |\n |\n |\n_|___\n",
        " _______\n |/\n |     O\n |     |\n |     |\n |\n_|___\n",
        " _______\n |/\n |     O\n |     |\n |     |\n |    /\n_|___\n",
        " _______\n |/\n |     O\n |     |\n |     |\n |    / \\\n_|___\n",
        " _______\n |/\n |     O\n |    /|\n |     |\n |    / \\\n_|___\n",
        " _______\n |/\n |     O\n |    /|\\\n |     |\n |    / \\\n_|___\n",
        " _______\n |/   |\n |     O\n |    /|\\\n |     |\n |    / \\\n_|___\n"
    };

    public final int estadoMaximo = dibujoPasos.length;

    // Otros atributos
    private int estado;
    private boolean completo;

    // Constructor por defecto
    public Ahorcado() {
    }

    // Getters y Setters
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public boolean isCompleto() {
        return completo;
    }

    public void setCompleto(boolean completo) {
        this.completo = completo;
    }

    // Métodos
    public void printAll() { // Metodo de prueba (imprime todos las figuras)
        for (int i = 0; i < dibujoPasos.length; i++) {
            System.out.println(dibujoPasos[i]);
        }
    }

    public void printPaso(int paso) {
        System.out.println(dibujoPasos[paso]);
    }

}
