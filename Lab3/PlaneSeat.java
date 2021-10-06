package Lab3;

public class PlaneSeat{
    private int seatId;
    private boolean assigned = false;
    private int customerId;
    
    public PlaneSeat(int seat_id){
        this.seatId = seat_id;
        this.customerId = -1;
    }
    public int getSeatID(){
        return seatId;
    }
    public int getCustomerID(){
        return customerId;
    }
    public boolean isOccupied(){
        return assigned;
    }
    void assign(int cust_id){
        this.customerId = cust_id;
        this.assigned = true;

    }
    void unAssign(){
        this.assigned = false;
        this.customerId = -1;

    }
}