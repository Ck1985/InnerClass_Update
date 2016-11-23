package innerclasses;

/**
 * Created by Anonymous11100001 on 6/11/2016.
 */
public class TestHospital {
    public static void main(String[] args){
        Hospital hospital = new Hospital();
        hospital.getDoctor().massage();
        //((Doctor)hospital).getDoctor().massage();
        // So Doctor is peivate, we can not downcast to Doctorr......
        //!((Hospital.Patient)hospital)
    }
}
