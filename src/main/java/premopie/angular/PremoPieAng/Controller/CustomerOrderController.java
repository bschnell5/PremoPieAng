package premopie.angular.PremoPieAng.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import premopie.angular.PremoPieAng.Model.CustomerOrder;
import premopie.angular.PremoPieAng.Repository.CustomerOrderRespository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CustomerOrderController {
	
	 @Autowired
	  CustomerOrderRespository customerOrderRepository;
	 
	 

	 // 
	 
	 
//	  @GetMapping("/customerorder")
//	  public ResponseEntity<List<CustomerOrder>> getAllCustomerOrders() {
//	    try {
//	    	List<CustomerOrder> customerOrders = new ArrayList<CustomerOrder>();
//	    	customerOrderRepository.findAll().forEach(customerOrders::add);
//	        if (customerOrders.isEmpty()) {
//	          return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//	        }
//	        return new ResponseEntity<>(customerOrders, HttpStatus.OK);
//	      } catch (Exception e) {
//	        return new ResponseEntity<>(null, HttpStatus.OK);
//	      }
//	  }
	  
//	  // Customer :: customerid <- order, employeeinfo <- 
//	  	//Gets all the information
//
//	  @GetMapping("/customerOrders/{id}")
//	  public ResponseEntity<CustomerOrder> getCustomerOrderByOrderid(@PathVariable("id") long customerOrderid) {
//	    Optional<CustomerOrder> customerOrderData = customerOrderRepository.findById(customerOrderid);
//
//	    if (customerOrderData.isPresent()) {
//	      return new ResponseEntity<>(customerOrderData.get(), HttpStatus.OK);
//	    } else {
//	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	    }
//	  }
//
//	  @PostMapping("/customerOrders")
//	  public ResponseEntity<CustomerOrder> createCustomerOrder(@RequestBody CustomerOrder customerOrder) {
//	    try {
//	      CustomerOrder _customerOrder = customerOrderRepository
//	          .save(new CustomerOrder(customerOrder.getOrders_orderid(),customerOrder.getProduct_productid()));
//	      return new ResponseEntity<>(_customerOrder, HttpStatus.CREATED);
//	    } catch (Exception e) {
//	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
//	  }
//
//	  @PutMapping("/customerOrders/{id}")
//	  public ResponseEntity<CustomerOrder> updateCustomerOrder(@PathVariable("id") long customerOrderid, @RequestBody CustomerOrder customerOrder) {
//	    Optional<CustomerOrder> customerOrderData = customerOrderRepository.findById(customerOrderid);
//
//	    if (customerOrderData.isPresent()) {
//	      CustomerOrder _customerOrder = customerOrderData.get();
//	      _customerOrder.setOrders_orderid(customerOrder.getOrders_orderid());
//	      _customerOrder.setProduct_productid(customerOrder.getProduct_productid());
//	  
//	      return new ResponseEntity<>(customerOrderRepository.save(_customerOrder), HttpStatus.OK);
//	    } else {
//	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	    }
//	  }
//
//	  @DeleteMapping("/customerOrders/{id}")
//	  public ResponseEntity<HttpStatus> deletecustomerOrder(@PathVariable("id") long customerOrderid) {
//	    try {
//	    	customerOrderRepository.deleteById(customerOrderid);
//	      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//	    } catch (Exception e) {
//	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
//	  }
//
//	  @DeleteMapping("/customerOrders")
//	  public ResponseEntity<HttpStatus> deleteAllcustomerOrders() {
//	    try {
//	    	customerOrderRepository.deleteAll();
//	      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//	    } catch (Exception e) {
//	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
//
//	  }
//	
////	  @GetMapping("/customerOrders/active")
////	  public ResponseEntity<List<CustomerOrder>> findByActive() {
////	    try {
////	      List<CustomerOrder> customerOrders = customerOrderRepository.findByActive(true);
////	
////	      if (customerOrders.isEmpty()) {
////	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
////	      }
////	      return new ResponseEntity<>(customerOrders, HttpStatus.OK);
////	    } catch (Exception e) {
////	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
////	    }
////	  }
//	  
//	  @GetMapping("/customerorder/{orders_orderid}")
//	  public  ResponseEntity<List<CustomerOrder>> findByOrderid(@PathVariable("id") long orders_orderid) {
//		  try {
//		      List<CustomerOrder> customerOrder = customerOrderRepository.findByOrderid(orders_orderid);
//
//		      if (customerOrder.isEmpty()) {
//		        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		      }
//		      return new ResponseEntity<>(customerOrder, HttpStatus.OK);
//		    } catch (Exception e) {
//		      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//		    }
//	  }
//
	 @GetMapping("/customerorder/{id}")
	 public  ResponseEntity<List<CustomerOrder>> getCustomerOrders(@PathVariable("id") long customerOrderid) {
		 List<CustomerOrder> customerOrder = customerOrderRepository.getCustomerOrders(customerOrderid);
		 return new ResponseEntity<>(customerOrder, HttpStatus.OK);
	 }
	 
	 @GetMapping("/customerorder")
	 public  ResponseEntity<List<CustomerOrder>> getAllCustomerOrders() {
		 List<CustomerOrder> customerOrder = customerOrderRepository.getAllCustomerOrders();
		 return new ResponseEntity<>(customerOrder, HttpStatus.OK);
	 }
	 
	 

	 

}

