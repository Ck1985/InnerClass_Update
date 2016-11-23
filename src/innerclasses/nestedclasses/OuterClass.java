package innerclasses.nestedclasses;

/**
 * Created by Anonymous11100001 on 6/16/2016.
 */
public class OuterClass {
    private static int i = 2;
    private static class NestedClass{
        private NestedClass(){}
        private static int j = 3;
        public static void foo(){}
    }
    public static void main(String[] args){
        NestedClass nestedClass = new NestedClass();
        NestedClass.foo();
    }
}
