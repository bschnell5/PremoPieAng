package premopie.angular.PremoPieAng.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import premopie.angular.PremoPieAng.Model.Orders;
import premopie.angular.PremoPieAng.Repository.OrdersRepository;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class OrdersController {

  @Autowired
  OrdersRepository orderRepository;

  @GetMapping("/orders")
  public ResponseEntity<List<Orders>> getAllOrders() {
	    try {
	      List<Orders> orders = new ArrayList<Orders>();
	      orderRepository.findAll().forEach(orders::add);
	      if (orders.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      return new ResponseEntity<>(orders, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }

  @GetMapping("/orders/{id}")
  public ResponseEntity<Orders> getOrderById(@PathVariable("id") long orderid) {
    Optional<Orders> orderData = orderRepository.findById(orderid);

    if (orderData.isPresent()) {
      return new ResponseEntity<>(orderData.get(), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
  
  
//  @GetMapping("/orders/{id}")
//  public ResponseEntity<Product> getProductsByOrderId(@PathVariable("id") long orderid) {
//    Optional<Product> orderData = orderRepository.findById(orderid);
//
//    if (orderData.isPresent()) {
//      return new ResponseEntity<>(orderData.get(), HttpStatus.OK);
//    } else {
//      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//  }

  @PostMapping("/orders")
  public ResponseEntity<Orders> createOrder(@RequestBody Orders order) {
    try {
      Orders _order = orderRepository
          .save(new Orders(order.getEmployeeid(), order.getCustomerid(), order.getTimeordercreated(), order.getTotal()));
      return new ResponseEntity<>(_order, HttpStatus.CREATED);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @PutMapping("/orders/{id}")
  public ResponseEntity<Orders> updateOrder(@PathVariable("id") long orderid, @RequestBody Orders order) {
    Optional<Orders> orderData = orderRepository.findById(orderid);

    if (orderData.isPresent()) {
      Orders _order = orderData.get();
      _order.setEmployeeid(order.getEmployeeid());
      _order.setCustomerid(order.getCustomerid());
      _order.setTimeordercreated(order.getTimeordercreated());
      _order.setTotal(order.getTotal());
      return new ResponseEntity<>(orderRepository.save(_order), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @DeleteMapping("/orders/{id}")
  public ResponseEntity<HttpStatus> deleteOrder(@PathVariable("id") long orderid) {
    try {
      orderRepository.deleteById(orderid);
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @DeleteMapping("/orders")
  public ResponseEntity<HttpStatus> deleteAllOrders() {
    try {
      orderRepository.deleteAll();
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

  }

//  @GetMapping("/orders/")
//  public ResponseEntity<List<Order>> findByTotalprice() {
//    try {
//      List<Order> orders = orderRepository.findByTotalprice(0);
//
//      if (orders.isEmpty()) {
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//      }
//      return new ResponseEntity<>(orders, HttpStatus.OK);
//    } catch (Exception e) {
//      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//  }

}

