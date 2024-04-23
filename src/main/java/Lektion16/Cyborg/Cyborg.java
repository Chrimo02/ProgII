package Lektion16.Cyborg;

public class Cyborg extends Autofahrer implements Mensch,Roboter{

    @Override
    public String typ(){
        return "Cyborg";
    }
    @Override
    public Entscheidung entscheide(Gefahrensituation g) {
        Mensch human = new MenschImpl();
        Roboter robot = new RoboterImpl();
        Entscheidung humanDecision = human.entscheide(g);
        Entscheidung robotDecision = robot.entscheide(g);
        if (humanDecision.equals(robotDecision)) return robotDecision;
        else {
            int random = (int) (Math.random()*2);
            if (random == 0) return humanDecision;
            else return robotDecision;
        }
    }

}
