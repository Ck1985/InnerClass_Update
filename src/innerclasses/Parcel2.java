/**
 * Created by Anonymous11100001 on 6/8/2016.
 */
package innerclasses;

public class Parcel2 {
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
        public String readLabel(){
            return this.label;
        }
    }
    public Destination to(String s){
        return new Destination(s);
    }
    public Contents contents(){
        return new Contents();
    }
    public void ship(String des){
        Contents c = this.contents();
        Destination d = this.to(des);
        System.out.println(d.readLabel());
    }
    public static void main(String[] args){
        Parcel2 p = new Parcel2();
        p.ship("anonymous");
        Parcel2 q = new Parcel2();
        Parcel2.Contents c = q.contents();
        Parcel2.Destination d = q.to("Cao Xuan Quy");
    }
}
