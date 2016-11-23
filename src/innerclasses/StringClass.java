/**
 * Created by Anonymous11100001 on 6/8/2016.
 */
package innerclasses;

class Sequence2{
    private Object[] items;
    private int size;
    private int next = 0;
    public Sequence2(int size){
        this.size = size;
        items = new Object[this.size];
    }
    public void add(Object object){
        if(this.next < items.length){
            items[next++] = object;
        }
    }
    class Sequence2Selector implements Selector{
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
    }
    public Selector selector(){
        return new Sequence2Selector();
    }
}
public class StringClass {
    private String string;
    public StringClass(String string){
        this.string = string;
    }
    public String toString(){
        return this.string;
    }
    public static void main(String[] args){
        Sequence2 sequence2 = new Sequence2(5);
        StringClass stringClass1 = new StringClass("aaa");
        StringClass stringClass2 = new StringClass("bbb");
        StringClass stringClass3 = new StringClass("ccc");
        StringClass stringClass4 = new StringClass("ddd");
        StringClass stringClass5 = new StringClass("eee");

        sequence2.add(stringClass1);
        sequence2.add(stringClass2);
        sequence2.add(stringClass3);
        sequence2.add(stringClass4);
        sequence2.add(stringClass5);

        Selector selector = sequence2.selector();
        while(!selector.end()){
            System.out.print(selector.current() + "");
            selector.next();
        }
    }
}
