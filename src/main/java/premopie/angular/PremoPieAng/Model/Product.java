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
		private double price;

		public Product() {

		}

		public Product(String description, String size, double price) {
			this.description = description;
			this.size = size;
			this.price = price;

		}
		
		
		public long getProductid() {
			return productid;
		}

		public void setProductid(long productid) {
			this.productid = productid;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSize() {
			return size;
		}

		public void setSize(String size) {
			this.size = size;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Product [productid=" + productid + ", description=" + description + ", size=" + size + ", price="
					+ price + "]";
		}
		
	}
		