package Lektion14.Strecke;

public class Strecke {
    int A;
    int B;

    public Strecke(int a, int b){
        if (a <= b){
            this.A = a;
            this.B = b;
        }
        else {
            this.A = b;
            this.B = a;
        }
    }

    public static boolean checkOverlap(Strecke x, Strecke y){
        if ((y.A > x.A && y.A < x.B) || (x.A> y.A && x.A < y.B)){ // es reicht die if-Bedingung mit return davor, dann spart man sich extra Zeilen
            return true;
        }
        else return false;
    }
    @Override
    public String toString(){
        if (this.A == this.B){
            return String.valueOf(this.A);
        }
        else {
            String s = "" + this.A;
            for (int i = 0; i < (this.B - this.A); i++) {
                s = s + "-";
            }
            s = s + this.B;
            return s;
        }
    }

}
