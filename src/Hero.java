public class Hero {

   private   String name;
   private   int health;
  private    int hit;

    public Hero (String name, int health, int hit){
        this.name = name;
        this.health = health;
        this.hit = hit;
    }


    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getHit() {
        return hit;
    }

    public String getInfo(){
        return getName() + " " + getHealth() + " " + getHealth();

    }
}
