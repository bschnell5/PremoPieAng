package premopie.angular.PremoPieAng.Model;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long employeeid;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "address")
	private String address;
	
	@Column(name = "tin")
	private int tin;
	
	@Column(name = "active")
	private boolean active;
	
	
	public Employee() {

	}

	public Employee(String firstname, String lastname, String address, int tin, boolean active) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.tin = tin;
		this.active = active;
	}


	public long getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(long employeeid) {
		this.employeeid = employeeid;
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

	public int getTin() {
		return tin;
	}

	public void setTin(int tin) {
		this.tin = tin;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", address=" + address + ", tin=" + tin + ", active=" + active + "]";
	}

	
}