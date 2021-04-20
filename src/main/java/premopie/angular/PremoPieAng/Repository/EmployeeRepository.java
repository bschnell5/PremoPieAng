package premopie.angular.PremoPieAng.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import premopie.angular.PremoPieAng.Model.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Long> {
  List<Employee> findByActive(boolean active);
  //List<Employee> findByTitleContaining(String title);
}
