package Lektion16.Cyborg;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CyborgTest {

    @Test
    public void testRobotDecision(){
        RoboterImpl robot = new RoboterImpl();
        assertEquals(robot.entscheide(Gefahrensituation.GEFAHR_LINKS),Entscheidung.RECHTS);
        assertEquals(robot.entscheide(Gefahrensituation.GEFAHR_RECHTS),Entscheidung.LINKS);
        assertEquals(robot.entscheide(Gefahrensituation.GEFAHR_VORNE),Entscheidung.BREMSEN);
    }
    @Test
    public void testHumanDecision(){
        MenschImpl human = new MenschImpl();
        Entscheidung humanDecision = human.entscheide(Gefahrensituation.GEFAHR_LINKS);
        if (humanDecision.equals(Entscheidung.UNENTSCHIEDEN));
        else assertEquals(humanDecision,Entscheidung.RECHTS);
    }
    @Test
    public void testCyborgDecision(){
        RoboterImpl robot = new RoboterImpl();
        MenschImpl human = new MenschImpl();
        Cyborg cyborg = new Cyborg();
        if (robot.entscheide(Gefahrensituation.GEFAHR_LINKS).equals(human.entscheide(Gefahrensituation.GEFAHR_LINKS))){
            assertEquals(cyborg.entscheide(Gefahrensituation.GEFAHR_LINKS),robot.entscheide(Gefahrensituation.GEFAHR_LINKS));
        }
    }

}
