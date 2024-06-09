package Lerntheke.Gruen;

public class Station3 {
    public static void main(String[] args) {
        System.out.println(summiere(1,2,3,4,5));
        System.out.println(replaceCharacter("Buchstabieren",'e','3'));
    }
    //a)
    public static int summiere(int... ints){
        int summe = 0;
        for (int i : ints) summe += i;
        return summe;
    }
    //b)
    public static String replaceCharacter(String string, char orig, char replacement){
        StringBuilder result = new StringBuilder();
        for (char c : string.toCharArray()){
            if (c == orig) result.append(replacement);
            else result.append(c);
        }
        return result.toString();
    }
}
