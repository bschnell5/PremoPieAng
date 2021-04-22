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

		@Column(name = "name")
		private String name;

		@Column(name = "description")
		private String description;

		@Column(name = "price")
		private double price;

		public Product() {

		}
		

		public Product( String name, String description, double price) {
			this.name = name;
			this.description = description;
			this.price = price;
		}




		public long getProductid() {
			return productid;
		}

		public void setProductid(long productid) {
			this.productid = productid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Product [productid=" + productid + ", name=" + name + ", description=" + description + ", price="
					+ price + "]";
		}

		
		
		
		
		
	}
		