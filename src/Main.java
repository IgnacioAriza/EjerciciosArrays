import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejercicio 1
        int[] arreglo = new int[10];
        int max = Integer.MIN_VALUE;
        int posicionMax = -1;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el entero número " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
            if (arreglo[i] > max) {
                max = arreglo[i];
                posicionMax = i;
            }
        }
        System.out.println("La posición del mayor número (" + max + ") es: " + posicionMax);

        // Ejercicio 2
        max = Integer.MIN_VALUE;
        posicionMax = -1;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el entero número " + (i + 1) + ": ");
            int num = scanner.nextInt();
            if (esPrimo(num) && num > max) {
                max = num;
                posicionMax = i;
            }
        }
        System.out.println("La posición del mayor número primo (" + max + ") es: " + posicionMax);

        // Ejercicio 3
        int[] primos = new int[10];
        int count = 0;

        for (int i = 100; i <= 300 && count < 10; i++) {
            if (esPrimo(i)) {
                primos[count++] = i;
            }
        }
        System.out.println("Los 10 números primos entre 100 y 300 son:");
        for (int primo : primos) {
            System.out.print(primo + " ");
        }

        // Ejercicio 4
        int[] posicionesTerminadasEn4 = new int[10];
        int count4 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el entero número " + (i + 1) + ": ");
            int num = scanner.nextInt();
            if (num % 10 == 4) {
                posicionesTerminadasEn4[count4++] = i;
            }
        }
        System.out.println("Las posiciones de los números terminados en 4 son:");
        for (int i = 0; i < count4; i++) {
            System.out.print(posicionesTerminadasEn4[i] + " ");
        }

        // Ejercicio 5
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el entero número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        int mayor = encontrarMayor(numeros);
        int repeticiones = contarRepeticiones(numeros, mayor);
        System.out.println("El mayor número ingresado es " + mayor + " y está repetido " + repeticiones + " veces.");

        scanner.close();
    }

    // Funcion para determinar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Funcion para encontrar el mayor número en un arreglo
    public static int encontrarMayor(int[] arreglo) {
        int max = Integer.MIN_VALUE;
        for (int num : arreglo) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Funcion para contar las repeticiones de un número en un arreglo
    public static int contarRepeticiones(int[] arreglo, int numero) {
        int count = 0;
        for (int num : arreglo) {
            if (num == numero) {
                count++;
            }
        }
        return count;
    }
}
