public class Ud4Ej5 {
    public static void main(String[] args){
        //Entorno
        int millas, yardas;
        float km, m;
        //Algoritmo
        millas=26;
        yardas=385;
        km=(float) (millas*1.60);
        m=(float) (yardas*0.91);
        km=km+(m/1000);
        System.out.println("La maraton en km son: "+km+"kilometros");
    }
}
