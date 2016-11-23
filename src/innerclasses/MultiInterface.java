package innerclasses;

/**
 * Created by Anonymous11100001 on 6/16/2016.
 */
interface A{}
interface B{}
class X implements A, B{}
class Y implements A{
    B makeB(){
        return new B(){

        };
    }
}
public class MultiInterface {
    public static void takeA(A a){}
    public static void takeB(B a){}
    public static void main(String[] args){
        X x = new X();
        Y y = new Y();
        takeA(x);
        takeA(y);
        takeB(x);
        takeB(y.makeB());
    }
}
