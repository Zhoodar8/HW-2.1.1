 public class Ninja extends Hero {
   private String village;
   private String power;
  private   String rank;
  private  Jutsu jutsu;


     public Ninja(String name, int health, int hit , String village, String power, String rank, Jutsu jutsu) {
         super(name, health, hit);
         this.village = village;
         this.power = power;
         this.rank = rank;
         this.jutsu = jutsu;
     }


     public String getVillage() {
         return village;
     }

     public String getPower() {
         return power;
     }

     public String getRank() {
         return rank;
     }

     public Jutsu getJutsu() {
         return jutsu;
     }

         public void usePower(){
             System.out.println("Suriken");

         }


        public  void usePower(String attack){
         System.out.println(attack);

     }

     public final void usePower(String attack, int count){
         for (int i = 0; i < count; i++ ){
             System.out.println(attack);
         }

     }

     public String getInfo(){
         return super.getInfo() + " " + getVillage() + " " + getPower() + " " + getRank() + " " + getJutsu();

     }


 }
