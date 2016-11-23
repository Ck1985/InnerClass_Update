package innerclasses;

/**
 * Created by Anonymous11100001 on 6/20/2016.
 */
class WithInner{
    class Inner{

    }
}

public class InheritInner extends WithInner.Inner{
    public InheritInner(WithInner withInner){
        withInner.super();
    }
    public static void main(String[] args){
        WithInner withInner = new WithInner();
        InheritInner inheritInner = new InheritInner(withInner);
    }
}
