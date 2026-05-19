public class Ud4Ej4 {
    public static void main(String[] args) throws Exception {
        //Entorno:
        float eur, pts, kwd;
        //Algoritmo:
        System.out.print("Introduzca una cantidad de euros: ");
        eur=Leer.datoFloat();
        // Casteo para convertir un double en un float
        pts= (float) (eur*166.86);
        kwd=(float) (eur*0.35);
        System.out.print(eur+" euros son "+pts+"ptas y "+kwd+"kwds");
    }
}
