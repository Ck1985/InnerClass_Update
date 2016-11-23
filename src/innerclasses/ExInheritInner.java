package innerclasses;

/**
 * Created by Anonymous11100001 on 6/20/2016.
 */
class OuterClass{
    class InnerClass{
        public InnerClass(int x){
            System.out.println("Value of x Inner class = " + x);
        }
    }
}
class M{
    public M(int x){

    }
}
class N extends M{
    public N(int x){
        super(x);
    }
}
public class ExInheritInner {
    class TestInheritClass extends OuterClass.InnerClass{
        public TestInheritClass(OuterClass outerClass, int x){
            outerClass.super(x);
            System.out.println("Value of x Inherit Class = " + x);
        }
    }
    public static void main(String[] args){
        OuterClass outerClass = new OuterClass();
        //OuterClass.InnerClass innerClass = outerClass.new InnerClass(8);
        ExInheritInner exInheritInner = new ExInheritInner();
        ExInheritInner.TestInheritClass testInheritClass = exInheritInner.new TestInheritClass(outerClass, 10);
    }
}
