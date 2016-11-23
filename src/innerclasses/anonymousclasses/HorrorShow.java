package innerclasses.anonymousclasses;
import static tk.anonymous11100001.util.Print.*;
/**
 * Created by Anonymous11100001 on 6/12/2016.
 */
interface Monster{
    void menace();
}
interface DangerousMonster extends Monster{
    void destroy();
}
class DragonZilla implements DangerousMonster{
    public void menace(){

    }
    public void destroy(){

    }
}
interface Lithall{
    void kill();
}
interface Vampire extends DangerousMonster, Lithall{
    void drinkBlood();
}
class VeryBadVampire implements Vampire{
    public void menace(){}
    public void destroy(){}
    public void kill(){}
    public void drinkBlood(){}
}

public class HorrorShow {
    public DangerousMonster getDangerousMonster(){
        return new DangerousMonster() {
            public void menace(){
                print("Monster menace ");
            }
            public void destroy(){
                print("Monster destroy");
            }
        };
    }
    public Vampire getVampire(){
        return new Vampire(){
            public void menace(){
                print("Vampire menace");
            }
            public void destroy(){
                print("Vampire destroy");
            }
            public void kill(){
                print("Vampire kill");
            }
            public void drinkBlood(){
                print("Vampire drink blood");
            }
        };
    }
    public void showMonster(DangerousMonster monster){
        monster.menace();
        monster.destroy();
    }
    public void showVampire(Vampire vampire){
        vampire.destroy();
        vampire.menace();
        vampire.kill();
        vampire.drinkBlood();
    }
    public static void main(String[] args){
        HorrorShow show = new HorrorShow();
        DangerousMonster monster = show.getDangerousMonster();
        Vampire vampire = show.getVampire();
        show.showMonster(monster);
        show.showVampire(vampire);
    }
}
