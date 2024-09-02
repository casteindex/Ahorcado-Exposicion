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
    private final String[] DIBUJO_PASOS = {
        " _______\n |/\n |\n |\n |\n |\n_|___\n",
        " _______\n |/\n |     O\n |\n |\n |\n_|___\n",
        " _______\n |/\n |     O\n |     |\n |     |\n |\n_|___\n",
        " _______\n |/\n |     O\n |     |\n |     |\n |    /\n_|___\n",
        " _______\n |/\n |     O\n |     |\n |     |\n |    / \\\n_|___\n",
        " _______\n |/\n |     O\n |    /|\n |     |\n |    / \\\n_|___\n",
        " _______\n |/\n |     O\n |    /|\\\n |     |\n |    / \\\n_|___\n",
        " _______\n |/   |\n |     O\n |    /|\\\n |     |\n |    / \\\n_|___\n"
    };

    private final int estadoMaximo = DIBUJO_PASOS.length;

    // Otros atributos
    private int estado;
    private boolean completo;

    // Constructor por defecto
    public Ahorcado() {
    }

    // Getters y Setters
    // Métodos
    public void printAll() { // Metodo de prueba (imprime todos las figuras)
        for (int i = 0; i < DIBUJO_PASOS.length; i++) {
            System.out.println(DIBUJO_PASOS[i]);
        }
    }
}
