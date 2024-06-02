package Lektion21.Naehrstoffangaben;

public class Main {
    public static void main(String[] args) {
        Naehrstoffangaben n = new Naehrstoffangaben.NaehrstoffangabenBuilder(4,50).withEiweiss(10).withFett(15).withKohlenhydrate(20).withNatrium(5).build();
        Naehrstoffangaben n2 = new Naehrstoffangaben.NaehrstoffangabenBuilder(3,100).build();
    }
}
