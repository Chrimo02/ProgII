package Lektion16.Cyborg;

public class Main {
    public static void main(String[] args) {
        //verschiedene Reaktionen Testen

        MenschImpl human = new MenschImpl();
        RoboterImpl robot = new RoboterImpl();
        Cyborg cyborg = new Cyborg();

        Autofahrer[] autofahrer = new Autofahrer[]{human,robot,cyborg};
        Gefahrensituation[] gefahren = new Gefahrensituation[]{Gefahrensituation.GEFAHR_LINKS,Gefahrensituation.GEFAHR_RECHTS,Gefahrensituation.GEFAHR_VORNE};

        for (int i = 0; i<autofahrer.length;i++){
            System.out.println(autofahrer[i].typ() + ": ");
            for (int j = 0; j<gefahren.length;j++){
                System.out.println("Gefahr " + gefahren[j].gefahr + ": " + autofahrer[i].entscheide(gefahren[j]));
            }
            System.out.println();
        }
    }
}
