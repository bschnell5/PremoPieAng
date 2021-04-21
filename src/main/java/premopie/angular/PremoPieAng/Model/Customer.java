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
		
		@Column(name = "employeeid")
		private long employeeid;

		@Column(name = "orderid")
		private long orderid;
		
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

		public Customer(String firstname, String lastname, String address, int zip) {
			this.firstname = firstname;
			this.lastname = lastname;
			this.address = address;
			this.zip = zip;
		}

		public long getCustomerid() {
			return customerid;
		}

		public void setCustomerid(long customerid) {
			this.customerid = customerid;
		}

		public long getEmployeeid() {
			return employeeid;
		}

		public void setEmployeeid(long employeeid) {
			this.employeeid = employeeid;
		}

		public long getOrderid() {
			return orderid;
		}

		public void setOrderid(long orderid) {
			this.orderid = orderid;
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
			return "Customer [customerid=" + customerid + ", employeeid=" + employeeid + ", orderid=" + orderid
					+ ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", zip=" + zip
					+ "]";
		}
		

}
