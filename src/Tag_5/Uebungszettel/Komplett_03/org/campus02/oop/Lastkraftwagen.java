package Tag_5.Uebungszettel.Komplett_03.org.campus02.oop;

public class Lastkraftwagen extends Fahrzeug{

    int maxTonnage;

    public Lastkraftwagen(int anzahlAchsen, int ps, String name, int maxTonnage) {
        super(anzahlAchsen, ps, name);
        if (maxTonnage < 1 || maxTonnage > 40){

        }
        this.maxTonnage = maxTonnage;
    }

    public Lastkraftwagen(int anzahlAchsen, int ps, String name) {
        super(anzahlAchsen, ps, name);

    }

    @Override
    public double steuer() {
        return 0;
    }
}
