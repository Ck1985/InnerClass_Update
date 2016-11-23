/**
 * Created by Anonymous11100001 on 6/14/2016.
 */
package innerclasses.anonymousclasses;
import static tk.anonymous11100001.util.Print.*;

interface Cycle{
    void ride();
}
interface CycleFactory{
    Cycle getCycle();
}
class UniCycle implements Cycle{
    private UniCycle(){}
    public void ride(){
        print("Riding UniCycle .....");
    }
    public static CycleFactory factory = new CycleFactory(){
        public Cycle getCycle(){
            return new UniCycle();
        }
    };
}
class BiCycle implements Cycle{
    private BiCycle(){}
    public void ride(){
        print("Riding BiCycle ...");
    }
    public static CycleFactory factory = new CycleFactory(){
        public Cycle getCycle(){
            return new BiCycle();
        }
    };
}
class TriCycle implements Cycle{
    private TriCycle(){}
    public void ride(){
        print("Riding TriCycle ....");
    }
    public static CycleFactory factory = new CycleFactory(){
        public Cycle getCycle(){
            return new TriCycle();
        }
    };
}
public class Cycles {
    public static void chooseCycle(CycleFactory fact){
        Cycle cycle = fact.getCycle();
        cycle.ride();
    }
    public static void main(String[] args){
        chooseCycle(BiCycle.factory);
        chooseCycle(UniCycle.factory);
        chooseCycle(TriCycle.factory);
    }
}
