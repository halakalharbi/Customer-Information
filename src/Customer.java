public class Customer extends Person {

	private String number;   // The Customers Number
	private boolean onMailingList;         // The Customers E-Maill
	
	
	public Customer (String name, String address, String phoneNumber, String number , boolean onMailingList) 
	   {
               super(name, address, phoneNumber);
	      this.number = number;
	      this.onMailingList = onMailingList;
	   }
	
	public String getCustomerNumber() {
		return number;
	}
	
	public boolean geteMail() {
		return onMailingList;
	}
	
	public void setCustomerNumber(String number) {
		this.number = number;
	}

	public void seteMail(boolean onMailingList) {
		this.onMailingList = onMailingList;
	}
        
        @Override
        public String toString()
        {
           return super.toString()+"\n"+"Number:  " + number +"\n"+ "onMailingList:  "+ onMailingList;
        }

}