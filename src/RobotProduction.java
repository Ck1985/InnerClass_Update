/**
 * Created by Anonymous11100001 on 6/9/2016.
 */
class Robot{
    private String codeNumber;
    class Engine{
        private String nameEngine;
        public Engine(String nameEngine){
            this.nameEngine = nameEngine;
            System.out.println("Engine Fire");
        }
    }
    class Material{
        private int serial;
        public Material(int serial){
            this.serial = serial;
            System.out.println("The serial = " + this.serial);
        }
    }
}
public class RobotProduction {
    public static void main(String[] args){
        Robot robot = new Robot();
        Robot.Engine engine= robot.new Engine("Super Robot");
        Robot.Material material = robot.new Material(2016);
    }
}
