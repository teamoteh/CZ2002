package Lab4.Qn1;

public class SalePerson implements Comparable {
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson (String firstName, String lastName, int totalSales) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalSales = totalSales;
	}

    public String toString(){
        return this.lastName + ", " + this.firstName + " : " + this.totalSales;
    }

    public boolean equal(Object o){
        if(this.getClass() == o.getClass()){
            SalePerson s = (SalePerson) o;
            if((s.getFirstName() == this.firstName) && (s.getLastName() == this.lastName)){
                return true;
            }
        }
        return false;
    }

    public int compareTo(Object o){
        if (this.getClass() == o.getClass()) {
			SalePerson s = (SalePerson) o;
			if (this.totalSales == s.getTotalSales()) {
				return this.lastName.compareTo(s.getLastName());
			} 
            if (this.totalSales < s.getTotalSales()) {
				return this.totalSales - s.getTotalSales();
			}
		}
		return 2;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getTotalSales(){
        return this.totalSales;
    }
}
