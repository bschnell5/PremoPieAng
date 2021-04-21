package premopie.angular.PremoPieAng.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import premopie.angular.PremoPieAng.Model.Employee;

public interface OrdersRepository extends JpaRepository<Employee, Long>  {

}
