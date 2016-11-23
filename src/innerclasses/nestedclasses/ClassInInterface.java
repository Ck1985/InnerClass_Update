package innerclasses.nestedclasses;

/**
 * Created by Anonymous11100001 on 6/16/2016.
 */
interface ClassInInterface {
    void foo();
    class Test implements ClassInInterface{
        public void foo(){
            System.out.println("Anonymous");
        }
        public static void main(String[] args){
            ClassInInterface c = new Test();
            c.foo();
        }
    }
}
