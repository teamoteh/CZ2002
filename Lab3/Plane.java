package CZ2002.Lab3;

import java.util.Arrays;

public class Plane {
	
	private int numEmptySeat;
	private PlaneSeat[] seat = new PlaneSeat[12];
	private PlaneSeat[] seatDummy = new PlaneSeat[12];
	
	public Plane() {
		this.numEmptySeat = 12;
		for (int i=0; i<12; i++) {
			this.seat[i] = new PlaneSeat(i);
		}
		for (int i=0; i<12; i++) {
			this.seatDummy[i] = new PlaneSeat(i);
		}
	}
	
	public void showNumEmptySeats() {
		System.out.println("There are " + this.numEmptySeat + " empty seats");
	}
	
	public void showEmptySeats() {
		System.out.println("The following seats are empty:");
		for (int i=0; i<this.seat.length; i++) {
			if (this.seat[i].isOccupied() == false) {
				System.out.println("SeatID " + (i+1));
			}
		}
	}
	
	public void showAssignedSeat(boolean truth) {
		System.out.println("The seat assignments are as follow:");
		if (truth) {
			for (int i=0; i<this.seat.length; i++) {
				if (this.seat[i].isOccupied()) {
					System.out.println("SeatID " + (i+1) + " assigned to CustomerID " + this.seat[i].getCustomerID() + ".");
				}
			}
		} else { 
			PlaneSeat[] seatDummy = sortSeats();
			for (int i=0; i<this.numEmptySeat; i++) { 
				for (int j=0; j<this.seat.length; j++) {
					if (seatDummy[j].getCustomerID() == i) {
						System.out.println("SeatID " + (j+1) + " assigned to CustomerID " + this.seat[j].getCustomerID() + ".");
						break;
					}
				}	
			}
		}
	}

	private PlaneSeat[] sortSeats() {

		int[] tempArr = new int[12-this.numEmptySeat];
		int count = 0;
		for (int i=0; i<12; i++) {
			if (this.seat[i].isOccupied()) {
				tempArr[count++] = this.seat[i].getCustomerID();
			}
		}

		Arrays.sort(tempArr);
		
		PlaneSeat[] planeseatDummy = new PlaneSeat[12];
		for (int i=0; i<12; i++) {
			planeseatDummy[i] = new PlaneSeat(i);
		}
		
		
		for (int i=0; i<tempArr.length; i++) {
			for (int j=0; j<12; j++) {
				if (tempArr[i] == this.seat[j].getCustomerID()) {
					planeseatDummy[j].assign(i);
					break;
				}
			}
		}
		
		return planeseatDummy;
	}

	public void unAssignSeat(int seatId) {
		this.seat[seatId-1].unAssign();
		this.numEmptySeat++;
		System.out.println("Seat Unassigned!");
	}
	
	public void assignSeat(int seatId, int custId) {
		if (this.seat[seatId-1].isOccupied()) {
			System.out.println("Seat already assigned to a customer.");
		} else {
			this.seat[seatId-1].assign(custId);
			this.numEmptySeat--;
			System.out.println("Seat Assigned!");
		}
	}
}