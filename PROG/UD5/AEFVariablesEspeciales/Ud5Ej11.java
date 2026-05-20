public class Ud5Ej11 {
    public static void main(String[] args){
        //Entorno
        int n, sum;
        //Algoritmo
        sum=0;
        do{
        System.out.println("Introduce un numero (0 para terminar): ");
        n=Leer.datoInt();
        sum=sum+n;
        }while(n!=0);
        System.out.println("La suma de los numeros introducidos es: "+sum);
    }
}
