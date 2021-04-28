package premopie.angular.PremoPieAng.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import premopie.angular.PremoPieAng.Model.CustomerOrder;

public interface CustomerOrderRespository  extends JpaRepository<CustomerOrder, Long> {

//	List<CustomerOrder> findCustomerOrderById(long customerOrderid);
	
	
//	@Query("\r\n"
//			+ "select * from public.\"orderdetails\" AS OD \r\n"
//			+ "INNER JOIN public.\"order\" AS O ON OD.orderid = O.orderid\r\n"
//			+ "INNER JOIN public.\"product\" AS Prod ON OD.productid = Prod.productid\r\n"
//			+ "INNER JOIN public.\"customer\" AS Cust ON O.customerid = Cust.customerid\r\n"
//			+ ";")
	
	
	
	
//	List<Orders> findOrderById(long orderid);
//	List<Product> findProductByID(long productid);
//	s
//	List<Product> findProductByOrderId(long orderid);
	
	
	// SELECT * FROM orders INNER JOIN orders.id = customerorders.orderid
		
		//product ids
	
	
	
	
	
	
	
	
	
	
	
//	Working for JPA Repository
	
	@Query(value="SELECT * from customerorder", nativeQuery = true)
	List<CustomerOrder> getCustomerOrders(long customerOrderid);
	
	
	
	
	//INNER JOIN public.\\\"orders\\\" AS O ON 
	//customerorder.orderid = O.orderid INNER JOIN public.\\\"product\\\" AS Prod ON 
	//customerorder.productid = Prod.productid INNER JOIN 
		//public.\\\\\\\"customer\\\\\\\" AS Cust ON O.customerid = Cust.customerid
	
	
	@Query(value="select * from customerorder CO "
			+ "INNER JOIN public.\"orders\" O ON O.orderid = CO.orders_orderid "
			+ "INNER JOIN public.\"product\" Prod ON Prod.productid = CO.product_productid "
			+ "INNER JOIN public.\"customer\" Cust ON Cust.customerid = O.customerid "
			+ "INNER JOIN public.\"employee\" E ON E.employeeid = O.employeeid", nativeQuery = true)
	List<CustomerOrder> getAllCustomerOrders();
	
}
