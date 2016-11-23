package innerclasses;

/**
 * Created by Anonymous11100001 on 6/11/2016.
 */
public class Company {
    public Equipments getItems(){
        class Phong_Vat_Tu implements Equipments{
            public void buy(String items){
                System.out.println("Company have to buy " + items);
            }
            public void loan(int num){
                System.out.println("we have to loan " + num + " items");
            }
        }
        return new Phong_Vat_Tu();
    }
    private void method(int check){
        if(check >= 10){
            class Phong_Tai_Chinh implements Equipments{
                public void buy(String items){

                }
                public void loan(int num){

                }
            }
            Phong_Tai_Chinh ptc = new Phong_Tai_Chinh();
            ptc.buy("computer");
        }
    }
    public void impleMethod(){
        method(12);
    }
    public static void main(String[] args){
        Company company = new Company();
        company.impleMethod();
    }
}
