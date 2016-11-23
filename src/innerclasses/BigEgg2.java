package innerclasses;
import static tk.anonymous11100001.util.Print.*;
/**
 * Created by Anonymous11100001 on 6/20/2016.
 */
class Egg2{
    public class Yolk{
        public Yolk(){
            print("Egg2.Yolk()");
        }
        public void f(){
            print("Egg2.Yolk.f()");
        }
    }
    protected Yolk y = new Yolk();
    public Egg2(){
        print("new Egg2()");
    }
    public void insertYolk(Yolk yy){
        this.y = yy;
    }
    public void g(){
        y.f();
    }
}
public class BigEgg2 extends Egg2{
    public class Yolk extends Egg2.Yolk{
        public Yolk(){
            print("BigEgg2.Yolk()");
        }
        public void f(){
            print("BigEgg2.Yolk.f()");
        }
    }
    public BigEgg2(){
        insertYolk(new Yolk());
    }
    public static void main(String[] args){
        Egg2 e = new BigEgg2();
        e.g();
    }
}
