package innerclasses.nestedclasses;

/**
 * Created by Anonymous11100001 on 6/16/2016.
 */
public class MultinestingAccess {
    private void f(){}
    class A{
        private void g(){}
        class B{
            private void h(){
                f();
                g();
            }
        }
    }
    public static void main(String[] args){
        MultinestingAccess MNA = new MultinestingAccess();
        MultinestingAccess.A mnaa = MNA.new A();
        MultinestingAccess.A.B mnaab = mnaa.new B();
        mnaab.h();
    }
}
