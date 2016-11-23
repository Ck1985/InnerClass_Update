/**
 * Created by Anonymous11100001 on 6/19/2016.
 */
import innerclasses.GreenHouseControl;
import innerclasses.controller.*;

public class GreenHouseController {
    public static void main(String[] args){
        GreenHouseControl gc = new GreenHouseControl();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = new Event[]{
                gc.new ThermoStatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new FanOn(300),
                gc.new FanOff(200),
                gc.new ThermoStatDay(1400)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if(args.length == 1){
            gc.addEvent(new GreenHouseControl.Terminate(new Integer(0)));
        }
        System.out.println("All Events in LinkedList are: ");
        gc.iteratorLinkedList();
        //gc.run();
    }
}
