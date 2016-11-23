package innerclasses.anonymousclasses;
import innerclasses.*;
/**
 * Created by Anonymous11100001 on 6/12/2016.
 */
public class Parcel9 {
    public Destination destination(String dest){
        return new Destination(){
            private String label = dest;
            public String readLabel(){
                return this.label;
            }
        };
    }
    public static void main(String[] args){
        Parcel9 parcel9 = new Parcel9();
        Destination d = parcel9.destination("anonymous");
    }
}
