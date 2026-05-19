public class Ud5Ej1 {
    public static void main(String[] args) throws Exception {
        //Entorno:
        int n1,n2, res;
        float div;
        //Algoritmo
        System.out.println("Introduzca el primer numero: ");
        n1=Leer.datoInt();
        System.out.println("Introduzca el segundo numero: ");
        n2=Leer.datoInt();
        System.out.println("Introduzca el segundo numero: ");
        res=n1+n2;
        System.out.println(n1+"+"+n2+"="+res);
        res=n1-n2;
        System.out.println(n1+"-"+n2+"="+res);
        res=n1*n2;
        System.out.println(n1+"x"+n2+"="+res);
        div=(float)n1/n2;
        System.out.println(n1+"/"+n2+"="+div);
        res=n1/n2;
        System.out.println(n1+"/"+n2+"(entera)="+res);
        res=n1%n2;
        System.out.println("El resto de "+n1+"entre"+n2+"="+res);
    }
}