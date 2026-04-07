package a02t03;
/**
 *
 * @author Gabriel Santos de Sousa
 */
public class A02t03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        
        System.out.println("Resto da Divisao: " + x % y);
        System.out.println("Produto: " + x * y);
        System.out.println("Media: " + (double) (x + y) / 2);
    }    
}
