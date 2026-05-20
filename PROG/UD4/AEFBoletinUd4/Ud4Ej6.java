public class Ud4Ej6 {
    public static void main(String[] args){
        //Entorno:
        int temp;
        float cel;
        //Algoritmo:
        System.out.println("Introduzca una temperatura (grados fahrenheit): ");
        temp=Leer.datoInt();
        cel=(float)(5.0/9.0)*(temp-32);
        System.out.println(temp+" Grados fahrenheit son "+cel+" grados celsius");
    }
}
