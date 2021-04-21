package premopie.angular.PremoPieAng.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name = "orders")
	public class Orders {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long orderid;

		@Column(name = "employeeid")
		private long employeeid;

		@Column(name = "customerid")
		private long customerid;

		@Column(name = "productid")
		private long productid;
		
		@Column(name = "totalprice")
		private double totalprice;
		
		@Column(name = "zip")
		private int zip;

		public long getOrderid() {
			return orderid;
		}

		public void setOrderid(long orderid) {
			this.orderid = orderid;
		}

		public long getEmployeeid() {
			return employeeid;
		}

		public void setEmployeeid(long employeeid) {
			this.employeeid = employeeid;
		}

		public long getCustomerid() {
			return customerid;
		}

		public void setCustomerid(long customerid) {
			this.customerid = customerid;
		}

		public long getProductid() {
			return productid;
		}

		public void setProductid(long productid) {
			this.productid = productid;
		}

		public double getTotalprice() {
			return totalprice;
		}

		public void setTotalprice(double totalprice) {
			this.totalprice = totalprice;
		}

		public int getZip() {
			return zip;
		}

		public void setZip(int zip) {
			this.zip = zip;
		}

		@Override
		public String toString() {
			return "Orders [orderid=" + orderid + ", employeeid=" + employeeid + ", customerid=" + customerid
					+ ", productid=" + productid + ", totalprice=" + totalprice + ", zip=" + zip + "]";
		}
		
		
		
		
	}