/*
 * PROGRAMA PARA SABER SI UN NUMERO ES PRIMO O NO
 */
package nprimos;
import java.util.*;
/**
 *
 * @author leooosan
 */
public class NPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int j;
        System.out.println("ESCRIBA UN NUMERO: ");
        numero = entrada.nextInt();
        j=2;
        while(numero % j != 0)
            ++j;
        if(j == numero) System.out.println("EL NUMERO ES PRIMO");
        else System.out.println("EL NUMERO NO ES PRIMO");
    }
    
}
