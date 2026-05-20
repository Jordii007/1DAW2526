public class Ud5Ej13 {
        public static void main(String[] args){
            //Entorno
            int par, impar, sumpar;
            long prodimp;
            //Algoritmo
            sumpar=0;
            prodimp=1;
            for(int i=1;i<=10;i++){
                par = i*2;
                impar=par-1;
                sumpar += par;
                prodimp *= impar;
            }

            System.out.println("La suma de los 10 primeros pares es: "+sumpar);
            System.out.println("El producto de os 10 primeros impares es: "+prodimp);
        }
}
