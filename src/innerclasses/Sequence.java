/**
 * Created by Anonymous11100001 on 6/8/2016.
 */
//Hold a sequence onjects
package innerclasses;
import java.util.*;

interface Selector{
    boolean end();
    Object current();
    void next();
}
public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size){
        items = new Object[size];
    }
    /*public void add(Object x){
        if(this.next < items.length){
            items[next++] = x;
        }
    }*/
    public void add(Object x) throws ArrayIndexOutOfBoundsException{
        if(this.next == items.length){
            throw new ArrayIndexOutOfBoundsException();
        }else{
            items[next++] = x;
        }
    }
    class SequenceSelector implements Selector{
        private int i = 0;
        public boolean end(){
            return (i == items.length);
        }
        public Object current(){
            return items[i];
        }
        public void next(){
            if(i < items.length){
                i++;
            }
        }
        public Sequence makeSequence(){
            return Sequence.this;
        }
    }
    public Selector selector(){
        return new SequenceSelector();
    }
    public static void main(String[] args){
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < sequence.items.length; i++){
            sequence.add(i);
        }
        sequence.add(50);
        Selector selector = sequence.selector();
        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
