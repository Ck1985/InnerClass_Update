package innerclasses.anonymousclasses;

/**
 * Created by Anonymous11100001 on 6/11/2016.
 */
public class Parcel8 {
    public Wrapping wrapping(int x){
        return new Wrapping(x) {
            public int value(){
                return super.value()*47;
            }
        };
    }
    public static void main(String[] args){
        Parcel8 parcel8 = new Parcel8();
        parcel8.wrapping(10);
    }
}
