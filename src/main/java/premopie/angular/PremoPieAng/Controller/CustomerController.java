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

import premopie.angular.PremoPieAng.Model.Customer;
import premopie.angular.PremoPieAng.Repository.CustomerRepository;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CustomerController {

  @Autowired
  CustomerRepository customerRepository;

  @GetMapping("/customers")
  public ResponseEntity<List<Customer>> getAllCustomers() {
    try {
    	List<Customer> customers = new ArrayList<Customer>();
	      customerRepository.findAll().forEach(customers::add);
	      if (customers.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      return new ResponseEntity<>(customers, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
  }

  @GetMapping("/customers/{id}")
  public ResponseEntity<Customer> getCustomerById(@PathVariable("id") long customerid) {
    Optional<Customer> customerData = customerRepository.findById(customerid);

    if (customerData.isPresent()) {
      return new ResponseEntity<>(customerData.get(), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping("/customers")
  public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
    try {
      Customer _customer = customerRepository
          .save(new Customer(customer.getFirstname(), customer.getLastname(),customer.getPhonenumber(), customer.getAddress(), customer.getZip()));
      return new ResponseEntity<>(_customer, HttpStatus.CREATED);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @PutMapping("/customers/{id}")
  public ResponseEntity<Customer> updateCustomer(@PathVariable("id") long customerid, @RequestBody Customer customer) {
    Optional<Customer> customerData = customerRepository.findById(customerid);

    if (customerData.isPresent()) {
      Customer _customer = customerData.get();
      _customer.setFirstname(customer.getFirstname());
      _customer.setLastname(customer.getLastname());
      _customer.setPhonenumber(customer.getPhonenumber());
      _customer.setAddress(customer.getAddress());
      _customer.setZip(customer.getZip());
      return new ResponseEntity<>(customerRepository.save(_customer), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @DeleteMapping("/customers/{id}")
  public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable("id") long customerid) {
    try {
      customerRepository.deleteById(customerid);
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @DeleteMapping("/customers")
  public ResponseEntity<HttpStatus> deleteAllCustomers() {
    try {
      customerRepository.deleteAll();
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

  }

//  @GetMapping("/customers/")
//  public ResponseEntity<List<Customer>> findByActive() {
//    try {
//      List<Customer> customers = customerRepository.findByActive(true);
//
//      if (customers.isEmpty()) {
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//      }
//      return new ResponseEntity<>(customers, HttpStatus.OK);
//    } catch (Exception e) {
//      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//  }

}
