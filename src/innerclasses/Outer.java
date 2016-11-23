package innerclasses;

/**
 * Created by Anonymous11100001 on 6/8/2016.
 */
public class Outer {
    class Inner{
        Inner(){
            System.out.println("Inner()");
        }
    }
    public Outer(){
        System.out.println("Outer()");
    }
    public Inner method(){
        return new Inner();
    }
    public static void main(String[] args){
        Outer outer = new Outer();
        Outer.Inner i = outer.method();
    }
}
