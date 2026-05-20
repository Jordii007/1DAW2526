public class Ud5Ej12b {
    public static void main(String[] args){
        //Entorno
        int n, sum, neg;
        //Algoritmo
        sum=0;
        neg=0;
        do{
        System.out.println("Introduce un numero (0 para terminar): ");
        n=Leer.datoInt();
        if (n<0){
            neg++;
        }
        sum=sum+n;
        }while(n!=0);
        System.out.println("La suma de los numeros introducidos es: "+sum);
        if (neg > 0){
            System.out.println("Se ha introducido algun numero negativo");
        }
    }
}
