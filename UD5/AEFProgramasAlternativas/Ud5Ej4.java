public class Ud5Ej4 {
    public static void main(String[] args) throws Exception {
        //Entorno:
        int n1, n2;
        //Algoritmo
        System.out.println("Introduzca el primer numero: ");
        n1=Leer.datoInt();
        System.out.println("Introduzca el segundo numero: ");
        n2=Leer.datoInt();
        if (n1==n2){
            System.out.println("Los dos numeros son iguales.");
        }else if(n1>n2){
            System.out.println("El numero "+n1+" es mayor que "+n2);
        }else{
            System.out.println("El numero "+n1+" es menor que "+n2);
        }
    }
}