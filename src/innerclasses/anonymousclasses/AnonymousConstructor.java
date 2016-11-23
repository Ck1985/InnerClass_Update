package innerclasses.anonymousclasses;
import static tk.anonymous11100001.util.Print.*;
/**
 * Created by Anonymous11100001 on 6/12/2016.
 */
abstract class Base{
    public Base(int i){
        print("Base Construoctor, i = " + i);
    }
     abstract void f();
}
public class AnonymousConstructor {
    public static Base getBase(int i){
        return new Base(i){
            {
                print("Inside the instance initialize");
            }
            public void f(){
                print("Inside anonymous method f()");
            }
        };
    }
    public static void main(String[] args){
        //AnonymousConstructor anonymousConstructor = new AnonymousConstructor();
        //anonymousConstructor.getBase(47);
        Base base = getBase(47);
        base.f();
    }
}
