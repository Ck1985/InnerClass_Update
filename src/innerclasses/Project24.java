package innerclasses;
import static tk.anonymous11100001.util.Print.*;
/**
 * Created by Anonymous11100001 on 6/17/2016.
 */
interface U{
    boolean end();
    Object current();
    void next();
}
class C{
    U makeU(){
        return new U(){
            public boolean end(){
                return true;
            }
            public Object current(){
                return 1;
            }
            public void next(){
                print("next()");
            }
        };
    }
}
class F{
    public U[] arrU;
    private int indexCurrent = 0;
    private int lengthArr;
    public F(int size){
        this.lengthArr = size;
        this.arrU = new U[this.lengthArr];
    }
    public void add(U u){
        if(indexCurrent < this.lengthArr){
            arrU[indexCurrent++] = u;
        }
    }
    public void setNull(int index){
        if(arrU[index] != null){
            arrU[index] = null;
        }
    }
    public U selector(){
        return new U(){
            private int indexSelector = 0;
            public boolean end(){
                return (indexSelector == lengthArr);
            }
            public Object current(){
                return arrU[indexSelector];
            }
            public void next(){
                if(!end()){
                    indexSelector++;
                }
            }
        };
    }
}
public class Project24 {
    public static void main(String[] args){
        C c = new C();
        F f = new F(5);
        for(int i = 0; i < 5; i++){
            f.add(c.makeU());
        }
        U u = f.selector();
        while(!u.end()){
            print(u.current() + " ");
            u.next();
        }
    }
}
