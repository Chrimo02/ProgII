package Lektion15.ProfessorUndStudent;

public class Professor extends Person{
    public Professor(String fach){
        this.taetigkeit = "Professor";
        this.fach = fach;
    }
    @Override
    public void gibTaetigkeitAus(){
        System.out.println("Der " + this.taetigkeit + " unterrichtet " + this.fach + ".");
    }

}
