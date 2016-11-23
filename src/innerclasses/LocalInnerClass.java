package innerclasses;
import static tk.anonymous11100001.util.Print.*;
/**
 * Created by Anonymous11100001 on 6/20/2016.
 */
interface Counter{
    int next();
}
public class LocalInnerClass {
    private int count = 0;
    Counter getCounter(final String name){
        class LocalCounter implements Counter{
            public LocalCounter(){
                print("LocalCounter()");
            }
            public int next(){
                print(name);
                return count++;
            }
        }
        return new LocalCounter();
    }
    Counter getCounter2(final String name){
        return new Counter(){
            {
                print("Counter()");
            }
            public int next(){
                print(name);
                return count++;
            }
        };
    }
    public static void main(String[] args){
        LocalInnerClass localInnerClass = new LocalInnerClass();
        Counter
                counter1 = localInnerClass.getCounter("Local Inner Class"),
                counter2 = localInnerClass.getCounter2("anonymous Inner Class");
        for(int i = 0; i < 5; i++){
             counter1.next();
        }
        for(int i = 0; i < 5; i++){
            counter2.next();
        }
    }
}
