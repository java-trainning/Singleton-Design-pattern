package lk.dasith.singleton;

public class Application {

    public static void main(String[] args) {

        Ambulance ambulance = Ambulance.getAmbulance();
        System.out.println(ambulance);

        Ambulance ambulance1 = Ambulance.getAmbulance();
        System.out.println(ambulance1);
    }
}
