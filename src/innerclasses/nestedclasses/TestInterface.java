package innerclasses.nestedclasses;

/**
 * Created by Anonymous11100001 on 6/16/2016.
 */
public class TestInterface implements InterfaceOuter {
    public void f(){
        System.out.println("f()");
    }
    public void g(){
        System.out.println("g()");
    }
    public static void main(String[] args){
        TestInterface test = new TestInterface();
        InterfaceOuter.NestedClass.callmethodInterface(test);
    }
}
