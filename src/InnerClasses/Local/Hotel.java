package InnerClasses.Local;

public class Hotel {

    private String name;

    private int totalRooms;

    private int reservedRooms;

    public Hotel(String name, int totalRooms, int reservedRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void reservedRoom(String guestName, int numOfRooms) {
        class ReservationValidator {
            boolean validated() {
                if (guestName == null || guestName.isBlank()) {
                    System.out.println("Guest Name can not be empty !");
                    return false;
                }
                if (numOfRooms < 0) {
                    System.out.println("Number of room should be positive ");
                    return false;
                }
                if (reservedRooms + numOfRooms > totalRooms) {
                    System.out.println(" Not enough room available . ");
                    return false;
                }
                return true;
            }
        }

        ReservationValidator validator = new ReservationValidator();
        if (validator.validated()){
            reservedRooms += numOfRooms;
            System.out.println("Reservation Conformed For " + guestName + " for "+ numOfRooms + "rooms.");
        }
    }


}
