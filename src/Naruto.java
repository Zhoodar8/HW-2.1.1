final public class Naruto extends Ninja  {
  private   int level;
 private    String clan;


    public Naruto(String name, int health, int hit, String village, String power, String rank, Jutsu jutsu, int level, String clan) {
        super(name, health, hit, village, power, rank, jutsu);
        this.level = level;
        this.clan = clan;
    }

    public int getLevel() {
        return level;
    }

    public String getClan() {
        return clan;
    }


    public void usePower(){
        System.out.println("Rasengan");

    }

   protected void usePower2(){
        System.out.println("Konoha's Huracan");

    }



    public String getInfo(){
        return super.getInfo() + " " +getVillage() + " "+ getPower() + " " + getRank() + " " +
                getJutsu() + " " + getLevel() + " " + getClan();
    }







}
