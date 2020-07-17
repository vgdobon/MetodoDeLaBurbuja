import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a ordenar un array. ¿De que tamaño quieres tu array?");
        int tamañoArray = sc.nextInt();
        MetodoDeLaBurbuja ordenacion = new MetodoDeLaBurbuja(tamañoArray);

        ordenacion.rellenar();
        ordenacion.sort();
        ordenacion.dibujar();
    }
}
