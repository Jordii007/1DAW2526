public class Ud5Ej6 {
    public static void main(String[] args) throws Exception {
        //Entorno:
        int dia;
        //Algoritmo
        System.out.println("Introduzca un día de la semana (1-7): ");
        dia=Leer.datoInt();
        if(dia>7){
            System.out.println("ERROR: el día de la semana no existe.");
        } else if (dia==1) {
            System.out.println("El día de la semana es LUNES");
        } else if (dia==2) {
            System.out.println("El día de la semana es MARTES");
        } else if (dia==3) {
            System.out.println("El día de la semana es MIERCOLES");
        } else if (dia==4) {
            System.out.println("El día de la semana es JUEVES");
        } else if (dia==5) {
            System.out.println("El día de la semana es VIERNES");
        } else if (dia==6) {
            System.out.println("El día de la semana es SABADO");
        } else if (dia==7) {
            System.out.println("El día de la semana es DOMINGO");
        }
    }
}