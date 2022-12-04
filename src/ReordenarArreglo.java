import java.util.Scanner;

public class ReordenarArreglo {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int count = a.length;
        int aux = 0;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < count; i++) {
            System.out.print("Ingrese un número entero: ");
            a[i] = s.nextInt();
        }

        System.out.println("\n\nEl arreglo ingresado es el siguiente:" );
        for (int i = 0; i < count; i++) {
            System.out.print("[" + a[i] + "];");
        }

        for (int i = 0; i < b.length/2; i++) {
            b[aux++] = a[count-1-i];
            b[aux++] = a[i];

        }

        System.out.println("\n\nEl nuevo arreglo con el orden solicitado es el siguiente:" );
        for (int i = 0; i < count; i++) {
            System.out.print("[" + b[i] + "];");
        }
        /*
        esta es la solucion planteada por el tutor, solo mostrar en el orden solicitado, sin modificar el arreglo
        System.out.println("\n\nEl nuevo orden es el siguiente:" );
        for (int i = 0; i < count/2; i++) {
            System.out.print("[" + a[count -1 - i] + "];[" + a[i] + "];");
        }
         */
    }
}
