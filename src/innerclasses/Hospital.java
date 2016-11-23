package innerclasses;

/**
 * Created by Anonymous11100001 on 6/11/2016.
 */
public class Hospital {
        private class Doctor implements TakeCareHealth{
            private String name;
            private int id;
            public Doctor(String name, int id) {
                this.name = name;
                this.id = id;
            }
            public void massage(){
                System.out.println("message()");
            }
            public void swimHotWater(){
                System.out.println("SwimHotWater()");
            }
            public void playGym(){
                System.out.println("PlayGym()");
            }
        }
    public class Patient {

    }
    public TakeCareHealth getDoctor(){
        return new Doctor("anonymous",123);
    }
    public static void main(String[] args){
        Hospital hospital = new Hospital();
        hospital.getDoctor();
        Hospital.Doctor d = hospital.new Doctor("abc", 123);
    }
}
