package innerclasses;

import javax.sound.midi.Track;

/**
 * Created by Anonymous11100001 on 6/11/2016.
 */
public class Parcel6 {
    private void internalTracking(boolean b){
        if(b){
            class TrackingSlip {
                private String id;

                private TrackingSlip(String s) {
                    this.id = s;
                }

                public String getSlip() {
                    return this.id;
                }
            }
            TrackingSlip trackingSlip = new TrackingSlip("anonymous");
            trackingSlip.getSlip();
        }
        // Can not use Tracking claas beacause out of scope
        // !TrackingSlip .......
    }
    public void track(){
        internalTracking(true);
    }
    public static void main(String[] args){
        Parcel6 parcel6 = new Parcel6();
        parcel6.track();
    }
}
