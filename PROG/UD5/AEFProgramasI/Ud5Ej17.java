import java.text.DecimalFormat;

public class Ud5Ej17 {
    public static void main(String[] args){
        //Entorno
        float a;
        DecimalFormat df= new DecimalFormat("0.00");
        //Algoritmo
        for(int i=0;i<10;++i){
            a=(float)(i+1)/(i+2);
            System.out.println(df.format(a));
        }
    }
}