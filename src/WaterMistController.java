/**
 * Created by Anonymous11100001 on 6/19/2016.
 */
import innerclasses.*;
import innerclasses.controller.*;
public class WaterMistController {
    public static void main(String[] args){
        WaterMistControls wc = new WaterMistControls();
        Event[] eventList = new Event[]{
                wc.new WaterMistOn(400),
                wc.new WaterMistOff(500)
        };
        wc.addEvent(wc.new Restart(3000, eventList));
        wc.run();
    }
}
