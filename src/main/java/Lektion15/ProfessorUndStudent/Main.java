package Lektion15.ProfessorUndStudent;

public class Main {
    public static void main(String[] args) {
        Person[] universitaet = new Person[100];
        for (int i = 0; i<universitaet.length;i++){
            if (i%2 == 0){
                universitaet[i] = new Student("Programmieren");
            }
            else universitaet[i] = new Professor("Programmieren");
        }
        for (int i = 0; i<universitaet.length;i++){
            universitaet[i].gibTaetigkeitAus();
        }
    }
}
