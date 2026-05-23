public class Ud5Ej16 {
    public static void main(String[] args){
        //Entorno
        int n, n1;
        //Algoritmo
        System.out.println("Introduzca el primero numero: ");
        n1=Leer.datoInt();
        if (n1== 0){
        System.out.println("Finalizando programa");
        }else if(n1!=0){
            System.out.println("Introduzca el segundo numero: ");
            n=Leer.datoInt();
            n1=n1+n;
            System.out.println("Introduzca el tercer numero: ");
            n=Leer.datoInt();
            n1=n1+n;
            System.out.println("Introduzca el cuarto numero: ");
            n=Leer.datoInt();
            n1=n1+n;
            System.out.println("Introduzca el quinto numero: ");
            n=Leer.datoInt();
            n1=n1+n;
            n1=n1/5;
            System.out.println("El resultado de la media aritmetica de los 5 numeros es: "+n1);
        }

    }
}