package innerclasses.anonymousclasses;

import innerclasses.Contents;

/**
 * Created by Anonymous11100001 on 6/11/2016.
 */
public class Parcel7b {
    class MyContents implements Contents{
        private int i = 11;
        public int value(){
            return i;
        }
    }
    public Contents contents(){
        return new MyContents();
    }
    public static void main(String[] args){
        Parcel7b parcel7b = new Parcel7b();
        Contents c = parcel7b.contents();
    }
}
