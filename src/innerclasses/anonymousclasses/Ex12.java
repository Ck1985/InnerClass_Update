package innerclasses.anonymousclasses;
import innerclasses.*;
import static tk.anonymous11100001.util.Print.*;

/**
 * Created by Anonymous11100001 on 6/12/2016.
 */
interface BaseEx12{
     void methodBase();
}
public class Ex12 {
    private String name = "anonymous1";
    private void foo(){
        print("method foo()");
    }
    public BaseEx12 changeField(final String change){
        return new BaseEx12(){
            public void methodBase(){
                name = change;
                foo();
            }
        };
    }
    public void showFieldName(){
        print("Field name = " + name);
    }
}
