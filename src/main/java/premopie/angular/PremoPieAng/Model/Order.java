package premopie.angular.PremoPieAng.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name = "order")
	public class Order {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long orderid;

		@Column(name = "employeeid")
		private String employeeid;

		@Column(name = "customerid")
		private String customerid;

		@Column(name = "productid")
		private String productid;
		
		@Column(name = "totalprice")
		private double totalprice;
		
		@Column(name = "zip")
		private int zip;
		
	}