package Lektion16.Cyborg;

public class RoboterImpl extends Autofahrer implements Roboter{

    @Override
    public String typ(){
        return "Roboter";
    }
    @Override
    public Entscheidung entscheide(Gefahrensituation g) {
        Entscheidung decision = Entscheidung.UNENTSCHIEDEN;
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

        return decision;
    }
}
