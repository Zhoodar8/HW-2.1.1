public class Main {

    public static void main(String[] args) {




        Ninja n = new Ninja("Hashirama", 1000, 100, "Konoha", "Mokuton", "Hokage", Jutsu.NINJUTSU  );
        n.usePower("Wood Goblin", 10);

        System.out.println(n.getInfo());

        Naruto n2 = new Naruto("Naruto", 500, 100,
                "Konoha", "Fuuton", "Chunin", Jutsu.GENJUTSU, 33, "Uzumaki");
        n2.usePower();

        System.out.println(n2.getInfo());



        Naruto n3 = new Naruto("Lee", 300, 50,
                "Konoha", "Yoton", "Genin", Jutsu.TAIJUTSU, 33, "Rock");

        n3.usePower2();
        System.out.println(n3.getInfo());











    }
}
