package innerclasses;
import static tk.anonymous11100001.util.Print.*;
/**
 * Created by Anonymous11100001 on 6/20/2016.
 */
class Egg{
    private Yolk y;
    protected class Yolk{
        public Yolk(){
            print("Egg.Yolk()");
        }
    }
    public Egg(){
        print("new Egg()");
        y = new Yolk();
    }
}
public class BigEgg extends Egg{
    public class Yolk{
        public Yolk(){
            print("BigEgg.Yolk()");
        }
    }
    public static void main(String[] args){
        new BigEgg();
    }
}
