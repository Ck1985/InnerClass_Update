package innerclasses.controller;
import java.util.*;
/**
 * Created by Anonymous11100001 on 6/18/2016.
 */
public class Controller {
    private LinkedList<Event> eventList = new LinkedList<>();
    public void addEvent(Event c){
        eventList.add(c);
    }
    public void run(){
        while(eventList.size() > 0){
            for(Event e : new LinkedList<>(eventList)){
                if(e.ready()){
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
    public void iteratorLinkedList(){
        Iterator<Event> eventIterator = eventList.iterator();
        while(eventIterator.hasNext()){
            Event event = eventIterator.next();
            System.out.print(event + " ");
        }
    }
}
