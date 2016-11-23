package innerclasses.anonymousclasses;

/**
 * Created by Anonymous11100001 on 6/12/2016.
 */
public class TestEx12 {
    public static void main(String[] args){
        Ex12 ex12 = new Ex12();
        ex12.showFieldName();
        BaseEx12 baseEx12 = ex12.changeField("anonymous2");
        baseEx12.methodBase();
        ex12.showFieldName();
    }
}
