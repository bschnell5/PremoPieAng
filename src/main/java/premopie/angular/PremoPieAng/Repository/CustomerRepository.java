package premopie.angular.PremoPieAng.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import premopie.angular.PremoPieAng.Model.Customer;



public interface CustomerRepository extends JpaRepository<Customer, Long> {
  //List<Employee> findByActive(boolean active);
  List<Customer> findByPhonenumber(String phonenumber);
}