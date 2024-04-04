/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PalindromoApp;

import java.util.Scanner;


/**
 *
 * @author jenni
 */
public class PalindromoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase para verificar si es palindromo:");
        String frase = scanner.nextLine();

        if (esPalindromo(frase)) {
            System.out.println("La frase SI es un palindromo.");
        } else {
            System.out.println("La frase NO es un palindromo.");
        }
    }

    // Método para eliminar caracteres no deseados y convertir la frase a minúsculas
    public static String limpiarFrase(String frase) {
        return frase.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }

    // Método para verificar si la frase es un palíndromo
    public static boolean esPalindromo(String frase) {
        String fraseLimpia = limpiarFrase(frase);
        Pila pila = new Pila();

        // Inserta caracteres en la pila
        for (int i = 0; i < fraseLimpia.length(); i++) {
            pila.push(fraseLimpia.charAt(i));
        }

        // Compara caracteres de la frase original con los de la pila
        for (int i = 0; i < fraseLimpia.length(); i++) {
            if (fraseLimpia.charAt(i) != (char) pila.pop()) {
                return false; // Verifica que no es un palíndromo
            }
        }
        return true; // Verifica que es palíndromo
    }
}

