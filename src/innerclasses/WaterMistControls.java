package innerclasses;
import innerclasses.controller.*;
/**
 * Created by Anonymous11100001 on 6/19/2016.
 */
public class WaterMistControls extends GreenHouseControl {
    private boolean waterMist = false;
    public class WaterMistOn extends Event{
        public WaterMistOn(long delayTime){
            super(delayTime);
        }
        public void action(){
            waterMist = true;
        }
        public String toString(){
            return "Water mist is on";
        }
    }
    public class WaterMistOff extends Event{
        public WaterMistOff(long delayTime){
            super(delayTime);
        }
        public void action(){
            waterMist = false;
        }
        public String toString(){
            return "Water mist is off";
        }
    }
}
