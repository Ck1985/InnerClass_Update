package innerclasses.anonymousclasses;

/**
 * Created by Anonymous11100001 on 6/12/2016.
 */
class One{
    private String s;
    One(String s){
        this.s = s;
    }
    public String showS(){
        return this.s;
    }
}
public class Example15 {
    public One makeOne(String s){
        return new One(s){

        };
    }
    public static void main(String[] args){
        Example15 example15 = new Example15();
        One one = example15.makeOne("anonymous");
        one.showS();
    }
}
