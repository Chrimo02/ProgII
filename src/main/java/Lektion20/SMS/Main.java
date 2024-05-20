package Lektion20.SMS;


import java.io.*;

public class Main {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader( new FileReader("/Users/christian/IdeaProjects/ProgII/src/main/resources/smsText.txt"));
            BufferedWriter bw = new BufferedWriter((new FileWriter("/Users/christian/IdeaProjects/ProgII/src/main/resources/telefonnummern.txt"))))
        {
            TastenMap nokia3310 = new TastenMap();
            String currentLine;
            while ((currentLine = br.readLine()) != null){
                try {
                    String inCaps = currentLine.toUpperCase();
                    char[] buchstaben = inCaps.toCharArray();
                    char[] telefonnummer = new char[buchstaben.length];
                    for(int i = 0; i<buchstaben.length;i++){
                        char ziffer = nokia3310.get(buchstaben[i]);
                        telefonnummer[i] = ziffer;
                    }
                    bw.write(String.valueOf(telefonnummer));
                    bw.newLine();
                    bw.flush();
                }
                catch (IllegalTelephoneNumberException e){
                    bw.write(e.getMessage());
                    bw.newLine();
                    bw.flush();
                }

            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
