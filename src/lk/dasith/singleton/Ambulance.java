package lk.dasith.singleton;

// lets asume only one 1990 is in one police area.
public class Ambulance {
    private static Ambulance ambulance = new Ambulance();

    private Ambulance(){
        if (ambulance != null){
            throw new RuntimeException("please use getAmbulance method");
        }
    }


    public static Ambulance getAmbulance(){

        if (ambulance == null){
            synchronized (Ambulance.class){
                if (ambulance ==null){
                    ambulance = new Ambulance();
                }
            }
        }

        return ambulance;
    }



}
