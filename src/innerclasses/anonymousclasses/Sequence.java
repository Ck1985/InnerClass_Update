package innerclasses.anonymousclasses;
import static tk.anonymous11100001.util.Print.*;

/**
 * Created by Anonymous11100001 on 6/16/2016.
 */
interface Selector{
    boolean end();
    Object current();
    void next();
}
interface ReverseSelector{
    boolean start();
    Object current();
    void previous();
}
public class Sequence {
    private Object[] objects;
    private int i = 0;
    private int length;
    public Sequence(int size){
        this.length = size;
        objects = new Object[this.length];
    }
    public void add(Object object){
        if(i < this.length){
            objects[i++] = object;
        }
    }
    class SequenceSelector implements Selector{
        private int j = 0;
        public boolean end(){
            return (j == length);
        }
        public Object current(){
            return objects[j];
        }
        public void next(){
            if(!end()){
                j++;
            }
        }
    }
    public Selector selector(){
        return new SequenceSelector();
    }
    public ReverseSelector reverseSelector(){
        return new ReverseSelector() {
            private int k = length;
            @Override
            public boolean start() {
                return (k == 0);
            }

            @Override
            public Object current() {
                return objects[k - 1];
            }

            @Override
            public void previous() {
                if(!start()){
                    k--;
                }
            }
        };
    }
    public static void main(String[] args){
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < sequence.objects.length; i++){
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
        System.out.println();
        ReverseSelector reverseSelector = sequence.reverseSelector();
        while(!reverseSelector.start()){
            System.out.print(reverseSelector.current() + " ");
            reverseSelector.previous();
        }
    }
}
