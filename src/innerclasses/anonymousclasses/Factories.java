/**
 * Created by Anonymous11100001 on 6/14/2016.
 */
package innerclasses.anonymousclasses;
import static tk.anonymous11100001.util.Print.*;

interface Service{
    void method1();
    void method2();
}
interface ServiceFactory{
    Service getService();
}
class Implementation1 implements Service{
    private Implementation1(){}
    public void method1(){
        print("Implementation1 method1()");
    }
    public void method2(){
        print("Implementation1 method2()");
    }
    public static ServiceFactory factory = new ServiceFactory() {
        public Service getService(){
            return new Implementation1();
        }
    };
}
class Implementation2 implements Service{
    private Implementation2(){}
    public void method1(){
        print("Implementation2 method1()");
    }
    public void method2(){
        print("Implementation2 method2()");
    }
    public static ServiceFactory factory = new ServiceFactory(){
        public Service getService(){
            return new Implementation2();
        }
    };
}
public class Factories {
    public static void ServiceConsumer(ServiceFactory fact){
        Service s = fact.getService();
        s.method1();
        s.method2();
    }
    public static void main(String[] args){
        ServiceConsumer(Implementation1.factory);
        ServiceConsumer(Implementation2.factory);
    }
}
