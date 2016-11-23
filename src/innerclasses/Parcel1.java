/**
 * Created by Anonymous11100001 on 6/8/2016.
 */
package innerclasses;

public class Parcel1 {
    class Contents{
        private int i = 11;
        public int value(){
            return i;
        }
    }
    class Destination{
        private String label;
        Destination(String whereTo){
            this.label = whereTo;
        }
        String readLabel(){
            return this.label;
        }
    }
    public void ship(String des){
        Contents c = new Contents();
        Destination d = new Destination(des);
        System.out.println(d.readLabel());
    }
    public static void main(String[] args){
        Parcel1 p = new Parcel1();
        p.ship("anonymous");
    }
}
