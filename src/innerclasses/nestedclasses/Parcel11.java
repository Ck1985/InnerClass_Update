/**
 * Created by Anonymous11100001 on 6/16/2016.
 */
package innerclasses.nestedclasses;
import innerclasses.*;

public class Parcel11 {
    private static class ParcelContent implements Contents{
        private int i = 11;
        public int value(){
            return i;
        }
    }
    protected static class ParcelDestination implements Destination{
        private String label;
        private ParcelDestination(String whereTo){
            this.label = whereTo;
        }
        public String readLabel(){
            return this.label;
        }
        public static void f(){}
        private static int i = 10;
        public static class AnotherLevel{
            public static int j;
            public void foo(){

            }
        }
    }
    public static Destination destination(String s){
        return new ParcelDestination(s);
    }
    public static Contents contents(){
        return new ParcelContent();
    }
    public static void main(String[] args){
        Contents c = contents();
        Destination d = destination("anonymous");
    }
}
