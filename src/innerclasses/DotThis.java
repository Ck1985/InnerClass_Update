/**
 * Created by Anonymous11100001 on 6/9/2016.
 */
package innerclasses;

public class DotThis {
    public void foo(){
        System.out.println("DotThis.foo()");
    }
    class Inner{
        public DotThis makeOuter(){
            return DotThis.this;
        }
    }
    public Inner makeInner(){
        return new Inner();
    }
    public static void main(String[] args){
        DotThis dotThis = new DotThis();
        DotThis.Inner inner = dotThis.makeInner();
        inner.makeOuter().foo();
    }
}
