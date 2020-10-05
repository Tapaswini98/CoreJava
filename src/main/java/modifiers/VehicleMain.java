package modifiers;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v  = new Vehicle();
        v.registrationState = "DELHI";
        // DELHI (DL), ODISHA (OD)
        v.setRegistrationState(null);
        v.color = "black";

        System.out.println(v.getRegistrationState());
    }
}
