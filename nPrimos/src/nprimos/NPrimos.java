/*
 * PROGRAMA PARA SABER SI UN NUMERO ES PRIMO O NO
 */
package nprimos;
import java.util.*;     // libreria para el Scanner
/**
 *
 * @author leooosan
 */
public class NPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);   // para leer datos por consola
        int numero;     // numero para evaluar si es primo
        int j;
        System.out.println("ESCRIBA UN NUMERO: ");
        numero = entrada.nextInt();
        
        // codigo principal
        j=2;
        while(numero % j != 0)
            ++j;
        
        if(j == numero) System.out.println("EL NUMERO ES PRIMO");
        else System.out.println("EL NUMERO NO ES PRIMO");
    }
    
}
