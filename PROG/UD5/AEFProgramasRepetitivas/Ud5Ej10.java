public class Ud5Ej10 {
    public static void main(String[] args){
        int n1;
        System.out.print("Introduce un número: ");
        n1 = Leer.datoInt(); 
        System.out.println("Los múltiplos de 3 mayores que 0 y menores que " + n1 + " son:");
        for (int i = 1; i < n1; i++) {
            if (i % 3 == 0) {
                System.out.println(i); 
            }
            
        }
    }
}