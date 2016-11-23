/**
 * Created by Anonymous11100001 on 6/10/2016.
 */
package innerclasses.player;

import innerclasses.action.ActionPlayer;

public class Player {
    private String name;
    private int indexGeneral;
    public Player(){

    }
    public Player(String name, int indexGeneral){
        this.name = name;
        this.indexGeneral = indexGeneral;
    }
    public String communicateCoach(){
        return "I got it";
    }
    protected class ActionInMatch implements ActionPlayer{
        public float run() {
            return 115.8f;
        }
        public boolean kick(boolean goal){
            return goal;
        }
        public void pass(){
            System.out.println("Hey I will pass to you");
        }
    }
    protected ActionInMatch buyPlayer(){
        return new ActionInMatch();
    }
}
