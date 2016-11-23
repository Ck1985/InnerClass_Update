package innerclasses;

/**
 * Created by Anonymous11100001 on 6/10/2016.
 */
class Sport {
    private String name;
    private void playSport(){
        System.out.println("Outer method");
    }
    public Sport(String name){
        this.name = name;
    }
    class Football {
        private String club = "Barcelona";
        private double valueMoney = 123.7;
        public void changeFieldOuter(String changeValue){
            System.out.println("Now we call the outer method: ");
            Sport.this.playSport();
            name = changeValue;
            System.out.println("name = " + name);
        }
        private void transfer(){
            System.out.println("Transfering.....");
        }
    }
    double vm = new Football().valueMoney;
    public void showTransfer(){
        new Football().transfer();
    }
    public static void main(String[] args){
        Sport sport = new Sport("Sport()");
        Sport.Football football = sport.new Football();
        football.changeFieldOuter("anonymoys");
        sport.showTransfer();
        System.out.println(sport.vm);
    }
}
