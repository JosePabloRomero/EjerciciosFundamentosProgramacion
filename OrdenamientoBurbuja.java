package ordenamientoburbuja;
import java.util.Scanner;
public class OrdenamientoBurbuja {
    public static final int N_ARREGLO = 5;
    private Scanner scanner;
    private int[] arreglo;
    
    public void llenarVector(){
        arreglo = new int[N_ARREGLO];
        scanner = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese el numero "+i);
            arreglo[i] = scanner.nextInt();
        }
    }  
    
    public void ordenamiento() {
        int aux;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = (i+1); j < arreglo.length; j++) {                
                if (arreglo[i] > arreglo[j]) {
                    //Si se pone ">" va a ordenar de menor a mayor, si se pone "<" va a ordenar de mayor a menor
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
    }
    
    public void imprimirArreglo(){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Posicion # "+i+" = "+arreglo[i]);
        }
    }
    
    public static void main(String[] args) {
        OrdenamientoBurbuja ordenar = new OrdenamientoBurbuja();
        ordenar.llenarVector();
        ordenar.ordenamiento();
        ordenar.imprimirArreglo();
        
    }
    
}
