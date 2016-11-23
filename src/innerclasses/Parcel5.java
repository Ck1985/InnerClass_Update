package innerclasses;

/**
 * Created by Anonymous11100001 on 6/11/2016.
 */
public class Parcel5 {
    public Destination destination(String s){
        class PDestination implements Destination{
            private String label;
            private PDestination(String whereTo){
                this.label = whereTo;
            }
            public String readLabel(){
                return this.label;
            }
        }
        return new PDestination(s);
    }
    public static void main(String[] args){
        Parcel5 parcel5 = new Parcel5();
        System.out.println(parcel5.destination("anonymoud"));
    }
}
