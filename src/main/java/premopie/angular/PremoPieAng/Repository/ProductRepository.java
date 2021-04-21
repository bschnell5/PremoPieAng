package premopie.angular.PremoPieAng.Repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import premopie.angular.PremoPieAng.Model.Product;



public interface ProductRepository extends JpaRepository<Product, Long> {
//  List<Product> findByProductId(long productid);
  //List<Employee> findByTitleContaining(String title);
}
