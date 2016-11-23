package innerclasses.nestedclasses;

/**
 * Created by Anonymous11100001 on 6/16/2016.
 */
interface InterfaceOuter {
    void f();
    void g();
    class NestedClass{
        public static void callmethodInterface(InterfaceOuter interfaceOuter){
            interfaceOuter.f();
            interfaceOuter.g();
        }
    }
}
