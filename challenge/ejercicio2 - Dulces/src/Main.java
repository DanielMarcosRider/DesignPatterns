import java.util.ArrayList;

public class Main {
    static ArrayList<ArticuloDulce> arrayDulce = new ArrayList<>();
    public static void main(String[] args) {


        ArticuloDulce pastel = new Pastel();
        ArticuloDulce galleta = new Galleta();

        arrayDulce.add(pastel);
        arrayDulce.add(galleta);

        for (int i = 0; i < arrayDulce.size(); i++) {
            arrayDulce.get(i).empaquetar();
            arrayDulce.get(i).preparar();
        }
        /*pastel.empaquetar();
        pastel.preparar();
        galleta.preparar();
        galleta.empaquetar();*/
    }
}