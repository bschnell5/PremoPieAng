package premopie.angular.PremoPieAng.Repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import premopie.angular.PremoPieAng.Model.Order;



public interface OrderRepository extends JpaRepository<Order, Long> {
 // List<Order> findByTotalprice(double totalprice);
  //List<Employee> findByTitleContaining(String title);


}
