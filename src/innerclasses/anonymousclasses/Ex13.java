package innerclasses.anonymousclasses;

/**
 * Created by Anonymous11100001 on 6/12/2016.
 */
interface Move{
    void turnleft();
    void turnright();
}
public class Ex13 {
    public Move getMove(){
        return new Move(){
            public void turnleft(){
                System.out.println("Turn Left");
            }
            public void turnright(){
                System.out.println("Turn Right");
            }
        };
    }
}
