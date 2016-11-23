package innerclasses;

/**
 * Created by Anonymous11100001 on 6/9/2016.
 */
public class Parcel3 {
    class Contents{
        private int i = 10;
        public int valur(){
            return i;
        }
    }
    class Destination{
        private String label;
        public Destination(String label){
            this.label = label;
        }
        public String readLabel(){
            return this.label;
        }
    }
    public static void main(String[] args){
        Parcel3 parcel3 = new Parcel3();
        Parcel3.Contents c = parcel3.new Contents();
        Parcel3.Destination d = parcel3.new Destination("anonymous");
    }
}
