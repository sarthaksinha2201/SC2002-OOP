package Lab3;

public class Plane {
    private PlaneSeat[] seat;
    private int numEmptySeat;

    public Plane() {
        seat = new PlaneSeat[12];
        for (int i = 0; i < 12; i++) {
            seat[i] = new PlaneSeat(i + 1);
        }
        numEmptySeat = 12;
    }

    // Returns a copy of seat array sorted by ascending customerID (only assigned seats)
    private PlaneSeat[] sortSeats() {
        int count = 0;
        for (int i = 0; i < 12; i++) {
            if (seat[i].isOccupied()) count++;
        }


        PlaneSeat[] sorted = new PlaneSeat[count];
        int idx = 0;
        for (int i = 0; i < 12; i++) {
            if (seat[i].isOccupied()) {
                sorted[idx++] = seat[i];
            }
        }

        // Bubble sort by customerID ascending
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - 1 - i; j++) {
                if (sorted[j].getCustomerID() > sorted[j + 1].getCustomerID()) {
                    PlaneSeat temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }
        return sorted;
    }

    public void showNumEmptySeats() {
        System.out.println("There are " + numEmptySeat + " empty seats");
    }

    public void showEmptySeats() {
        System.out.println("The following seats are empty:");
        for (int i = 0; i < 12; i++) {
            if (!seat[i].isOccupied()) {
                System.out.println("SeatID " + seat[i].getSeatID());
            }
        }
    }

    public void showAssignedSeats(boolean bySeatId) {
        System.out.println("The seat assignments are as follow:");
        if (bySeatId) {

            for (int i = 0; i < 12; i++) {
                if (seat[i].isOccupied()) {
                    System.out.println("SeatID " + seat[i].getSeatID() +
                            " assigned to CustomerID " + seat[i].getCustomerID() + ".");
                }
            }
        } else {
            // Sort by customerID
            PlaneSeat[] sorted = sortSeats();
            for (int i = 0; i < sorted.length; i++) {
                System.out.println("SeatID " + sorted[i].getSeatID() +
                        " assigned to CustomerID " + sorted[i].getCustomerID() + ".");
            }
        }
    }

    public void assignSeat(int seatId, int cust_id) {
        for (int i = 0; i < 12; i++) {
            if (seat[i].getSeatID() == seatId) {
                if (seat[i].isOccupied()) {
                    System.out.println("Seat already assigned to a customer.");
                } else {
                    seat[i].assign(cust_id);
                    numEmptySeat--;
                    System.out.println("Seat Assigned!");
                }
                return;
            }
        }
        System.out.println("Invalid SeatID.");
    }

    public void unAssignSeat(int seatId) {
        for (int i = 0; i < 12; i++) {
            if (seat[i].getSeatID() == seatId) {
                if (!seat[i].isOccupied()) {
                    System.out.println("Seat is already empty.");
                } else {
                    seat[i].unAssign();
                    numEmptySeat++;
                    System.out.println("Seat Unassigned!");
                }
                return;
            }
        }
        System.out.println("Invalid SeatID.");
    }
}
