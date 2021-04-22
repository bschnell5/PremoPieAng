package premopie.angular.PremoPieAng.Model;


import java.sql.Date;

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

		@Column(name="timeordercreated")
		private Date timeordercreated;
		
		public Orders() {

		}

		public Orders(long employeeid, long customerid, Date timeordercreated) {
			this.employeeid = employeeid;
			this.customerid = customerid;
			this.timeordercreated = timeordercreated;
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

		public Date getTimeordercreated() {
			return timeordercreated;
		}

		public void setTimeordercreated(Date timeordercreated) {
			this.timeordercreated = timeordercreated;
		}

		@Override
		public String toString() {
			return "Orders [orderid=" + orderid + ", employeeid=" + employeeid + ", customerid=" + customerid
					+ ", timeordercreated=" + timeordercreated + "]";
		}

		
	}