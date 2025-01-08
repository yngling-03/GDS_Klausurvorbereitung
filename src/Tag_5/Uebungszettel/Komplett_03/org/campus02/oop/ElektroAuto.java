package Tag_5.Uebungszettel.Komplett_03.org.campus02.oop;

public class ElektroAuto extends Fahrzeug{

    int kapazität;

    public ElektroAuto(int anzahlAchsen, int ps, String name, int kapazität) {
        super(anzahlAchsen, ps, name);
        this.kapazität = kapazität;
    }

    public ElektroAuto(int anzahlAchsen, int ps, String name) {
        super(anzahlAchsen, ps, name);
    }

    @Override
    public double steuer() {
        if (kapazität < 50){
            return 100;
        }
        else if (kapazität < 100) {
            if (ps * 10 < 1000){
                return ps * 10;
            } else {
                return 1000;
            }
        }
        else {
            if (ps * 8.5 > 1000) {
                return ps * 8.5;
            }
            else {
                return 1000;
            }
        }
    }
}
