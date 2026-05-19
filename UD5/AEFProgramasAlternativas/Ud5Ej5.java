public class Ud5Ej5 {
    public static void main(String[] args) throws Exception {
        //Entorno:
        float imp;
        final int DESC = 25;
        final int IVA = 21;
        //Algoritmo
        System.out.println("Introduzca el importe de la venta: ");
        imp=Leer.datoFloat();
        if (imp>1500){
            imp= (float) (imp-(imp*DESC/100));
            imp= (float) (imp+(imp*IVA/100));
            System.out.println("El precio a pagar es: "+imp);
        }else{
            imp= (float) (imp+(imp*IVA/100));
            System.out.println("El precio a pagar es: "+imp);
        }
    }
}