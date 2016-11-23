package innerclasses;

/**
 * Created by Anonymous11100001 on 6/9/2016.
 */
class Outer2 {
    private String name;
    public Outer2(String name){
        this.name = name;
    }
    class Inner2{
        public String toString(){
            return name + " ";
        }
    }
    public Inner2 getInner(){
        return new Inner2();
    }
    public static void main(String[] args){
        Outer2 outer2 = new Outer2("anonymous11100001");
        Inner2 inner2 = outer2.getInner();
        System.out.print(inner2);
    }
}
