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

		@Column(name = "address")
		private String address;
		
		@Column(name = "zip")
		private int zip;
		

}
