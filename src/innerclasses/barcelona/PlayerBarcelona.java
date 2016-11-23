package innerclasses.barcelona;
import innerclasses.action.ActionPlayer;
import innerclasses.player.*;

/**
 * Created by Anonymous11100001 on 6/10/2016.
 */
public class PlayerBarcelona extends Player {
    public ActionPlayer transferPlayer(){
        return buyPlayer();
    }
}
