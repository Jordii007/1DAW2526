public class Ud5Ej15 {
    public static void main(String[] args){
        //Entorno
        int a, b, c;
        double sol, raiz;
        //Algoritmo
        System.out.println("Introduzca un numero (a): ");
        a = Leer.datoInt();
        if (a == 0){
            System.out.println("ERROR: a no puede ser 0");
            return;
        }
        System.out.println("Introduzca un numero (b): ");
        b = Leer.datoInt();
        System.out.println("Introduzca un numero (c): ");
        c = Leer.datoInt();
        System.out.println("La ecuación es " + a + "x2 + " + b + "x + " + c + " = 0");
        raiz = (b * b) - (4 * a * c);
        if (raiz >= 0) {
            System.out.println("Las soluciones de la ecuación son: ");
            sol = (-b + Math.sqrt(raiz)) / (2 * a);
            System.out.println("Solucion 1: " + sol);
            sol = (-b - Math.sqrt(raiz)) / (2 * a);
            System.out.println("Solucion 2: " + sol); 
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }
}