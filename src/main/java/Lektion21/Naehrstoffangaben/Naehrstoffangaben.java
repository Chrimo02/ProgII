package Lektion21.Naehrstoffangaben;

public class Naehrstoffangaben {
    int portionsgroesse;
    int anzahlPortionen;
    int eiweiss;
    int fett;
    int kohlenhydrate;
    int natrium;

    private Naehrstoffangaben(int portionsgroesse,int anzahlPortionen, int eiweiss, int fett, int kohlenhydrate, int natrium){
        this.portionsgroesse = portionsgroesse;
        this.anzahlPortionen = anzahlPortionen;
        this.eiweiss = eiweiss;
        this.fett = fett;
        this.kohlenhydrate = kohlenhydrate;
        this.natrium = natrium;
    }

    public int getPortionsgroesse() {
        return portionsgroesse;
    }

    public int getAnzahlPortionen() {
        return anzahlPortionen;
    }

    public int getEiweiss() {
        return eiweiss;
    }

    public int getFett() {
        return fett;
    }

    public int getKohlenhydrate() {
        return kohlenhydrate;
    }

    public int getNatrium() {
        return natrium;
    }

    public static class NaehrstoffangabenBuilder{
        int portionsgroesse;
        int anzahlPortionen;
        int eiweiss;
        int fett;
        int kohlenhydrate;
        int natrium;
        public NaehrstoffangabenBuilder(int anzahlPortionen, int portionsgroesse){
            this.anzahlPortionen = anzahlPortionen;
            this.portionsgroesse = portionsgroesse;
        }
        public NaehrstoffangabenBuilder withEiweiss(int eiweiss){
            this.eiweiss = eiweiss;
            return this;
        }
        public NaehrstoffangabenBuilder withFett(int fett){
            this.fett = fett;
            return this;
        }
        public NaehrstoffangabenBuilder withKohlenhydrate(int kohlenhydrate){
            this.kohlenhydrate = kohlenhydrate;
            return this;
        }
        public NaehrstoffangabenBuilder withNatrium(int natrium){
            this.natrium = natrium;
            return this;
        }
        public Naehrstoffangaben build(){
            return new Naehrstoffangaben(portionsgroesse, anzahlPortionen, eiweiss, fett, kohlenhydrate, natrium);
        }
    }
}
