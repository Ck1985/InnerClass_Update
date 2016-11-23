package innerclasses;

/**
 * Created by Anonymous11100001 on 6/9/2016.
 */
public class DotNew {
    public class Inner{}
    public static void main(String[] args){
        DotNew dotNew = new DotNew();
        DotNew.Inner inner = dotNew.new Inner();
    }
}
