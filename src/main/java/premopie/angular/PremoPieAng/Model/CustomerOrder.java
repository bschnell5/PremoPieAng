package premopie.angular.PremoPieAng.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customerorder")
public class CustomerOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long customerOrderid;
	

	@Column(name="orders_orderid")
	private long orders_orderid;
	
	@Column(name="product_productid")
	private long product_productid;
	
	public CustomerOrder() {}
	
	public CustomerOrder(long orders_orderid, long product_productid) {
		this.orders_orderid = orders_orderid;
		this.product_productid = product_productid;
	}

	public long getCustomerOrderid() {
		return customerOrderid;
	}

	public void setCustomerOrderid(long customerOrderid) {
		this.customerOrderid = customerOrderid;
	}

	public long getOrders_orderid() {
		return orders_orderid;
	}

	public void setOrders_orderid(long orders_orderid) {
		this.orders_orderid = orders_orderid;
	}

	public long getProduct_productid() {
		return product_productid;
	}

	public void setProduct_productid(long product_productid) {
		this.product_productid = product_productid;
	}

	@Override
	public String toString() {
		return "CustomerOrder [customerOrderid=" + customerOrderid + ", orders_orderid=" + orders_orderid
				+ ", product_productid=" + product_productid + "]";
	}

}
