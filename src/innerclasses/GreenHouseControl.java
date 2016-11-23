package innerclasses;
import innerclasses.controller.*;
/**
 * Created by Anonymous11100001 on 6/19/2016.
 */
public class GreenHouseControl extends Controller{
    private boolean light = false;
    public class LightOn extends Event{
        public LightOn(long delayTime){
            super(delayTime);
        }
        public void action(){
            light = true;
        }
        public String toString(){
            return "The Light is on";
        }
    }
    public class LightOff extends Event{
        public LightOff(long delayTime){
            super(delayTime);
        }
        public void action(){
            light = false;
        }
        public String toString(){
            return "The light is off";
        }
    }
    private boolean water = false;
    public class WaterOn extends Event{
        public WaterOn(long delayTime){
            super(delayTime);
        }
        public void action(){
            water = true;
        }
        public String toString(){
            return "GreenHouse water is on";
        }
    }
    public class WaterOff extends Event{
        public WaterOff(long delayTime){
            super(delayTime);
        }
        public void action(){
            water = false;
        }
        public String toString(){
            return "WaterHouse is off";
        }
    }
    private String thermostat = "Day";
    public class ThermoStatNight extends Event{
        public ThermoStatNight(long delayTime){
            super(delayTime);
        }
        public void action(){
            thermostat = "Night";
        }
        public String toString(){
            return "ThermoStat is Night setting";
        }
    }
    public class ThermoStatDay extends Event{
        public ThermoStatDay(long delayTime){
            super(delayTime);
        }
        public void action(){
            thermostat = "Day";
        }
        public String toString(){
            return "ThermoStat is Day setting";
        }
    }
    private boolean fan = false;
    public class FanOn extends Event{
        public FanOn(long delayTime){
            super(delayTime);
        }
        public void action(){
            fan = true;
        }
        public String toString(){
            return "Fan is on";
        }
    }
    public class FanOff extends Event{
        public FanOff(long delayTime){
            super(delayTime);
        }
        public void action(){
            fan = false;
        }
        public String toString(){
            return "Fan is Off";
        }
    }
    public class Bell extends Event{
        public Bell(long delayTime){
            super(delayTime);
        }
        public void action(){
            addEvent(new Bell(delayTime));
        }
        public String toString(){
            return "Bing Bing";
        }
    }
    public class Restart extends Event{
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList){
            super(delayTime);
            this.eventList = eventList;
            for(Event e : this.eventList){
                addEvent(e);
            }
        }
        public void action(){
            for(Event e : eventList){
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }
        public String toString(){
            return "Restart System";
        }
    }
    public static class Terminate extends Event{
        public Terminate(long delayTime){
            super(delayTime);
        }
        public void action(){
            System.exit(0);
        }
        public String toString(){
            return "System is terminating .....";
        }
    }
}
