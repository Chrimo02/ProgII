package Lektion14.Newsticker;

public class Ticker {

    private int groesse;
    private char[] nachricht;

    public Ticker(int groesse){
        if (groesse <= 0){
            this.groesse = 200;
        }
        else {
            this.groesse = groesse;
        }
        this.nachricht = new char[groesse];
        for (int i=0;i<this.nachricht.length;i++){
            this.nachricht[i] = ' ';
        }
    }

    public int getGroesse(){
        return this.groesse;
    }

    public void setNachricht(String nachricht){
        if (this.nachricht.length <= nachricht.length()) {
            for (int i = 0; i < this.nachricht.length; i++) {
                this.nachricht[i] = nachricht.charAt(i);
            }
        } else {
            int uebrigerPlatz = this.nachricht.length - nachricht.length();
            for (int j = this.nachricht.length-1;j>this.nachricht.length-uebrigerPlatz-1;j--){
                this.nachricht[j] = '+';
            }
            for (int i = 0; i < this.nachricht.length-uebrigerPlatz; i++) {
                this.nachricht[i] = nachricht.charAt(i);
            }
        }
    }

    public String getNachricht(){
        return new String(this.nachricht);
    }

    public void resetNachricht(char zeichen){
        for (int i=0;i<this.nachricht.length;i++){
            this.nachricht[i] = zeichen;
        }
    }

    public void resetNachricht(){
        resetNachricht('+');
    }

    public void rotateNachricht(int distance){
        if (distance <= 0 || distance >= this.nachricht.length){
            return;
        }
        char[] puffer =  new char[this.nachricht.length];
        for (int i=0;i<this.nachricht.length;i++){
            if (i-distance < 0){
                int einschub = this.nachricht.length - (distance-i);
                puffer[i] = this.nachricht[einschub];
            }
            else {
                puffer[i] = this.nachricht[i-distance];
            }
        }
        for (int k =0;k<puffer.length;k++){
            this.nachricht[k] = puffer[k];
        }
    }


/*
    public void rotateNachricht(int distance){
        if (distance <= 0 || distance >= this.nachricht.length){
            return;
        }
        char[] puffer =  new char[this.nachricht.length];
        for (int i=this.nachricht.length-1;i>-1;i--){
            if (i-distance < 0){
                int einschubVonRechts = this.nachricht.length - (distance-i);
                puffer[i] = this.nachricht[einschubVonRechts];
            }
            else {
                puffer[i] = this.nachricht[i-distance];
            }
        }
        for (int k =0;k<puffer.length;k++){
            this.nachricht[k] = puffer[k];
        }
    }

 */

    public void printNachricht(){
        System.out.println(new String(this.nachricht));
    }


}
