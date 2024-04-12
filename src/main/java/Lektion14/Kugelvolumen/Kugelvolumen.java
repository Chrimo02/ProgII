package Lektion14.Kugelvolumen;

public class Kugelvolumen {
    public static double berechneKugelvolumen(double radius){
        if (radius<0){
            return -1.000;
        }
        else{
            return Math.round((4.0/3*Math.PI*radius*radius*radius)*1000)/1000.0;
        }
    }


}
