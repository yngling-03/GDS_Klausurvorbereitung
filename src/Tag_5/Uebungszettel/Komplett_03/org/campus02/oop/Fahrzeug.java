package Tag_5.Uebungszettel.Komplett_03.org.campus02.oop;

public abstract class Fahrzeug {

    int anzahlAchsen;
    int ps;
    String Name;

    public Fahrzeug(int anzahlAchsen, int ps, String name) {
        this.anzahlAchsen = anzahlAchsen;
        this.ps = ps;
        Name = name;
    }

    public abstract double steuer();

    public int getAnzahlAchsen() {
        return anzahlAchsen;
    }

    public void setAnzahlAchsen(int anzahlAchsen) {
        this.anzahlAchsen = anzahlAchsen;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Fahrzeug{" +
                "anzahlAchsen=" + anzahlAchsen +
                ", ps=" + ps +
                ", Name='" + Name + '\'' +
                '}';
    }
}
