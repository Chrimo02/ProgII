package Lektion16.Cyborg;

public class MenschImpl extends Autofahrer implements Mensch{

    @Override
    public String typ(){
        return "Mensch";
    }
    @Override
    public Entscheidung entscheide(Gefahrensituation g) {
        Entscheidung decision = Entscheidung.UNENTSCHIEDEN;
        int random = (int) (Math.random()*4);
        if (random == 0) return decision;
        else {
            switch (g) {
                case GEFAHR_LINKS -> {
                    decision = Entscheidung.RECHTS;
                }
                case GEFAHR_RECHTS -> {
                    decision = Entscheidung.LINKS;
                }
                case GEFAHR_VORNE -> {
                    decision = Entscheidung.BREMSEN;
                }
            }
        }
        return decision;
    }
}

