package Lektion18.Studiengangssplitter;

import java.io.*;

public class Main {

    // Um Zeilenweise Text zu Lesen eignet sich besonders ein FileReader
    public static void main(String[] args) {
        try {
            splitStudiengaenge("/Users/christian/IdeaProjects/ProgII/src/main/resources/MatrNr.txt");
            System.out.println("Dateien erfolgreich erstellt.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void splitStudiengaenge(String dateiname) throws IOException, MatrikelNummerException {

        try(
            BufferedReader reader = new BufferedReader( new FileReader(dateiname));
            BufferedWriter winfWriter = new BufferedWriter((new FileWriter("Winf-nummern.txt")));
            BufferedWriter infWriter = new BufferedWriter((new FileWriter("inf-nummern.txt")));
            BufferedWriter ecWriter = new BufferedWriter((new FileWriter("ecf-nummern.txt")))) {
            String matrikelnummer;
            while ((matrikelnummer = reader.readLine()) != null){
                if (validMatNr( matrikelnummer)){
                    if (isWinf(matrikelnummer)){
                        winfWriter.write(matrikelnummer);
                        winfWriter.newLine();
                    }
                    else if (isInf(matrikelnummer)){
                        infWriter.write(matrikelnummer);
                        infWriter.newLine();
                    }
                    else if (isEC(matrikelnummer)){
                        ecWriter.write(matrikelnummer);
                        ecWriter.newLine();
                    }
                }
                else throw new MatrikelNummerException("Ungültige Matrikelnummer: " + matrikelnummer);
            }
        }
    }

    private static boolean validMatNr(String matrikelnummer){
        int ziffern = matrikelnummer.length();
        int mNr = Integer.parseInt(matrikelnummer);
        return ziffern == 7 && mNr >999999 && mNr < 99999999;
    }

    private static boolean isInf(String matrikelnummer){
        int matNr = Integer.parseInt(matrikelnummer);
        return matNr >= 5000000 && matNr <= 5099999;
    }
    private static boolean isWinf(String matrikelnummer){
        int matNr = Integer.parseInt(matrikelnummer);
        return matNr >= 5100000 && matNr <= 5199999;
    }
    private static boolean isEC(String matrikelnummer){
        int matNr = Integer.parseInt(matrikelnummer);
        return matNr >= 6100000 && matNr <= 6199999;
    }


}
