package premopie.angular.PremoPieAng.Model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name = "orders")
	public class Order {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long orderid;
		
		@Column(name = "employeeid")
		private long employeeid;

		@Column(name = "customerid")
		private long customerid;

		@Column(name = "productid")
		private String productid;
		
		@Column(name = "itemsorder")
		private String itemsorder;
		
		@Column(name = "totalprice")
		private double totalprice;
		
		
		public Order() {

		}

		public Order(long employeeid, long customerid, String productid, String itemsorder, double totalprice) {
			this.employeeid = employeeid;
			this.customerid = customerid;
			this.productid = productid;
			this.itemsorder = itemsorder;
			this.totalprice = totalprice;
		}


		
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

		public String getProductid() {
			return productid;
		}

		public void setProductid(String productid) {
			this.productid = productid;
		}

		public String getItemsorder() {
			return itemsorder;
		}

		public void setItemsorder(String itemsorder) {
			this.itemsorder = itemsorder;
		}

		public double getTotalprice() {
			return totalprice;
		}

		public void setTotalprice(double totalprice) {
			this.totalprice = totalprice;
		}

		@Override
		public String toString() {
			return "Order [orderid=" + orderid + ", employeeid=" + employeeid + ", customerid=" + customerid
					+ ", productid=" + productid + ", itemsorder=" + itemsorder + ", totalprice=" + totalprice + "]";
		}

	

		
	}