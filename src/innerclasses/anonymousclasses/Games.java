package innerclasses.anonymousclasses;
import static tk.anonymous11100001.util.Print.*;
/**
 * Created by Anonymous11100001 on 6/14/2016.
 */
interface Game{
    boolean move();
}
interface GameFactory{
    Game getGame();
}
class Checker implements Game{
    private Checker(){}
    private int move = 0;
    private static final int MOVE = 3;
    public boolean move(){
        print("Checker move: " + move);
        return ++move != MOVE;
    }
    public static GameFactory factory = new GameFactory(){
        public Game getGame(){
            return new Checker();
        }
    };
}
class Chess implements Game{
    private Chess(){}
    private int move = 0;
    private static int MOVE = 4;
    public boolean move(){
        print("Chess move: " + move);
        return ++move!= MOVE;
    }
    public static GameFactory factory = new GameFactory() {
        public Game getGame(){
            return new Chess();
        }
    };
}
public class Games {
    public static void playGame(GameFactory fact){
        Game g = fact.getGame();
        while(g.move()){
            ;
        }
    }
    public static void main(String[] args){
        playGame(Checker.factory);
        playGame(Chess.factory);
    }
}
