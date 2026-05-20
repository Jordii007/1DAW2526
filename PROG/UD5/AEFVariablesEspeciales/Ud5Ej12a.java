public class Ud5Ej12a {
    public static void main(String[] args){
        //Entorno
        int n, sum;
        boolean neg=false;
        //Algoritmo
        sum=0;
        do{
        System.out.println("Introduce un numero (0 para terminar): ");
        n=Leer.datoInt();
        sum=sum+n;
        if(n<0){neg=true;}
        }while(n!=0);
        System.out.println("La suma de los numeros introducidos es: "+sum);
        if(neg){
            System.out.println("Se ha introducido algun numero negativo");
        }
    }
}
