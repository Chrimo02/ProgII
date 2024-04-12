package Lektion14.Punkt;

public class Punkt {
    int x;
    int y;

    public Punkt(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void verschiebePunkt(int zielX, int zielY){
        if (zielX < 0 || zielY < 0 || zielX > 1920 || zielY > 1080){
            throw new RuntimeException("Ungültiges Argument");
        }
        else {
            x = zielX;
            y = zielY;
        }
    }


}
