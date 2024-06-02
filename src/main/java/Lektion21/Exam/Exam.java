package Lektion21.Exam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Exam {
    List<Question> questions = new ArrayList<>();
    String readHeaderFromFile(String headerFilePath) throws IOException {
        StringBuilder header = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(headerFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                header.append(line).append("\n");
            }
        }
        return header.toString();
    }
    public void readQuestions(String dateiname) throws IOException{
        //dateiname zeilenweise auslesen
        //jede gelesene Zeile mit toQuestion zu Question-Objekt machen
        //dieses Question Objekt dann in der questions-Liste von Exam-Instanz adden
        //IOException propagieren ("throws IOException")

        try(BufferedReader br = new BufferedReader(new FileReader(dateiname))){
            String line;
            while ((line = br.readLine()) != null) {
                Question q = new Question(line);
                this.questions.add(q);
            }
        }
    }

    public void toTest(String headerPath, String outputPath) throws IOException{
        //Inhalt von readHeaderfromFile in die Datei "test.tex" schreiben
        //Question-Objekte aus questions-Liste ins Format \textbf{Fragentext}\\ umwandeln und zeilenweise hinter dem Header in die "text.tex" schreiben
        //"test.tex" mit dem String \end{document} abschließen
        //IOException propagieren
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))){
            String header = readHeaderFromFile(headerPath);
            bw.write(header);
            bw.newLine();
            bw.write("\\begin{document}");
            bw.newLine();
            //Question temp = this.questions.remove(0);
            for (Question question : this.questions){
                bw.write("\\textbf{" + question.text + "}\\\\");
                bw.newLine();
            }
            bw.write("\\end{document}");
        }
    }
}
