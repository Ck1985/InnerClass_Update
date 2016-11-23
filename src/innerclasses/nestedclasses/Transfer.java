package innerclasses.nestedclasses;

/**
 * Created by Anonymous11100001 on 6/16/2016.
 */
interface Transfer {
    float buyPlayer(float amount);
    float sellPlayer(float amount);
    class InformationPlayer implements Transfer{
        private String name;
        private int age;
        private String position;
        private float valueMarket;

        public float buyPlayer(float amount){
            System.out.println("Club has to buy this player with amount = " + amount);
            return amount;
        }
        public float sellPlayer(float amount){
            System.out.println(" this player is sold with amount = " + amount);
            return amount;
        }
        public static void main(String[] args){
            InformationPlayer player = new InformationPlayer();
            player.buyPlayer(45.9f);
            player.sellPlayer(129f);
        }
    }
}
