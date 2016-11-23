package innerclasses;
import static  tk.anonymous11100001.util.Print.*;
/**
 * Created by Anonymous11100001 on 6/17/2016.
 */
interface Incrementable{
    void increment();
}
class Callee1 implements Incrementable{
    private int i = 0;
    public void increment(){
        i++;
        print(i);
    }
}
class MyIncrement{
    public void increment(){
        print("another operator");
    }
    static void f(MyIncrement mi){
        mi.increment();
    }
}
class Callee2 extends MyIncrement{
    private int i = 0;
    public void increment(){
        super.increment();
        i++;
        print(i);
    }
    private class Closure implements Incrementable{
        public void increment(){
            Callee2.this.increment();
        }
    }
    Incrementable getCallBackReference(){
        return new Closure();
    }
}
class Caller{
    private Incrementable callBackReference;
    Caller(Incrementable cbh){
        this.callBackReference = cbh;
    }
    void go(){
        callBackReference.increment();
    }
}
public class CallBacks {
    public static void main(String[] args){
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallBackReference());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
     }
}
