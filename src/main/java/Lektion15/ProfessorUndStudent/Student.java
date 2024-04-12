package Lektion15.ProfessorUndStudent;

public class Student extends Person{
    public Student(String fach){
        this.taetigkeit = "Student";
        this.fach = fach;
    }
    @Override
    public void gibTaetigkeitAus(){
        System.out.println("Der " + this.taetigkeit + " besucht das Fach " + this.fach + ".");
    }
}
