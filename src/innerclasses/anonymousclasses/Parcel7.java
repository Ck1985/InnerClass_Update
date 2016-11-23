/**
 * Created by Anonymous11100001 on 6/11/2016.
 */
package innerclasses.anonymousclasses;
import innerclasses.Contents;
import innerclasses.Parcel3;

public class Parcel7 {
    public Contents contents(){
        return new Contents() {
            private int i = 11;
            public int value(){
                return i;
            }
        };
    }
    public static void main(String[] args){
        Parcel7 parcel7 = new Parcel7();
        Contents c = parcel7.contents();
    }
}
