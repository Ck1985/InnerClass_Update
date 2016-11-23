/**
 * Created by Anonymous11100001 on 6/12/2016.
 */
package innerclasses.anonymousclasses;
import static tk.anonymous11100001.util.Print.*;
import innerclasses.*;

public class Parcel10 {
    public Destination getDestination(final String dest, final float price){
        return new Destination(){
            private float cost;
            {
                cost = Math.round(price);
                if(cost > 100){
                    print("Over budge");
                }
            }
            private String label = dest;
            public String readLabel(){
                return this.label;
            }
        };
    }
    public static void main(String[] args){
        Parcel10 parcel10 = new Parcel10();
        parcel10.getDestination("anonymous", 125.87f);
    }
}
