package premopie.angular.PremoPieAng.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name = "product")
	public class Product {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long productid;

		@Column(name = "description")
		private String description;

		@Column(name = "size")
		private String size;

		@Column(name = "price")
		private String price;
		
	}
		