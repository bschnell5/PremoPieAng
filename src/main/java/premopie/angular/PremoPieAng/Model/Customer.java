package premopie.angular.PremoPieAng.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name = "customer")
	public class Customer {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long customerid;
		
		@Column(name = "firstname")
		private String firstname;

		@Column(name = "lastname")
		private String lastname;
		
		@Column(name = "phonenumber")
		private String phonenumber;

		@Column(name = "address")
		private String address;
		
		@Column(name = "zip")
		private int zip;
		
		public Customer() {

		}

		public Customer(String firstname, String lastname, String phonenumber, String address, int zip) {
			this.firstname = firstname;
			this.lastname = lastname;
			this.phonenumber = phonenumber;
			this.address = address;
			this.zip = zip;
		}

		public long getCustomerid() {
			return customerid;
		}

		public void setCustomerid(long customerid) {
			this.customerid = customerid;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		
		
		public String getPhonenumber() {
			return phonenumber;
		}

		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}

		
		
		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public int getZip() {
			return zip;
		}

		public void setZip(int zip) {
			this.zip = zip;
		}

		@Override
		public String toString() {
			return "Customer [customerid=" + customerid + ", firstname=" + firstname + ", lastname=" + lastname
					+ ", phonenumber=" + phonenumber + ", address=" + address + ", zip=" + zip + "]";
		}

	
		

}
