package innerclasses;
import static tk.anonymous11100001.util.Print.*;
import java.util.*;
/**
 * Created by Anonymous11100001 on 6/14/2016.
 */
interface CoinAndDice{
    void play();
}
interface CoinAndDiceFactory{
    CoinAndDice getGame();
}
class Coin implements CoinAndDice{
    private Random random = new Random(10);
    private Coin(){}
    public static CoinAndDiceFactory factory = new CoinAndDiceFactory() {
        public CoinAndDice getGame(){
            return new Coin();
        }
    };
    public void play(){
        int choosen = random.nextInt(4);
        switch(choosen){
            case 0:
                print("head");
                break;
            case 1:
                print("tail");
                break;
            default:
                print("edge");
                break;
        }
    }
}
class Dice implements CoinAndDice{
    private Random random = new Random(10);
    private Dice(){}
    public static CoinAndDiceFactory factory = new CoinAndDiceFactory() {
        public CoinAndDice getGame(){
            return new Dice();
        }
    };
    public void play(){
        print("Throwing the Dice ..." + random.nextInt(6) + 1);
    }
}
public class CoinAndDiceGame {
    public static void playGame(CoinAndDiceFactory fact){
        CoinAndDice game = fact.getGame();
        game.play();
    }
    public static void main(String[] args){
        playGame(Dice.factory);
        playGame(Coin.factory);
    }
}
