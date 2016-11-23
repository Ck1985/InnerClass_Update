package innerclasses;

/**
 * Created by Anonymous11100001 on 6/16/2016.
 */
class D{}
abstract class E{}
class Z extends D{
    E makeE(){
        return new E(){

        };
    }
}
public class MultEmplementation {
    public static void takeD(D d){}
    public static void takeE(E e){}
    public static void main(String[] args){
        Z z = new Z();
        takeD(z);
        takeE(z.makeE());
    }
}
