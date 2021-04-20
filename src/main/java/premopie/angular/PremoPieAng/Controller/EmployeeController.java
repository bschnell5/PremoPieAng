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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import premopie.angular.PremoPieAng.Repository.EmployeeRepository;
import premopie.angular.PremoPieAng.Model.Employee;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EmployeeController {

  @Autowired
  EmployeeRepository employeeRepository;

//  @GetMapping("/employees")
//  public ResponseEntity<List<Employee>> getAllEmployees(@RequestParam(required = false) long employeeid) {
//    try {
//      List<Employee> employees = new ArrayList<Employee>();
//
//      if (title == null)
//        employeeRepository.findAll().forEach(employees::add);
//      else
//        employeeRepository.findByTitleContaining(title).forEach(employees::add);
//
//      if (employees.isEmpty()) {
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//      }
//
//      return new ResponseEntity<>(employees, HttpStatus.OK);
//    } catch (Exception e) {
//      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//  }
//
  @GetMapping("/employees/{id}")
  public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeid) {
    Optional<Employee> employeeData = employeeRepository.findById(employeeid);

    if (employeeData.isPresent()) {
      return new ResponseEntity<>(employeeData.get(), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping("/employees")
  public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
    try {
      Employee _employee = employeeRepository
          .save(new Employee(employee.getFirstname(), employee.getLastname(), employee.getAddress(), employee.getTin(), employee.isActive() ));
      return new ResponseEntity<>(_employee, HttpStatus.CREATED);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @PutMapping("/employees/{id}")
  public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id, @RequestBody Employee employee) {
    Optional<Employee> employeeData = employeeRepository.findById(id);

    if (employeeData.isPresent()) {
      Employee _employee = employeeData.get();
      _employee.setFirstname(employee.getFirstname());
      _employee.setLastname(employee.getLastname());
      _employee.setAddress(employee.getAddress());
      _employee.setTin(employee.getTin());
      _employee.setActive(employee.isActive());
      return new ResponseEntity<>(employeeRepository.save(_employee), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @DeleteMapping("/employees/{id}")
  public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable("id") long employeeid) {
    try {
      employeeRepository.deleteById(employeeid);
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @DeleteMapping("/employees")
  public ResponseEntity<HttpStatus> deleteAllEmployees() {
    try {
      employeeRepository.deleteAll();
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

  }

  @GetMapping("/employees/active")
  public ResponseEntity<List<Employee>> findByActive() {
    try {
      List<Employee> employees = employeeRepository.findByActive(true);

      if (employees.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<>(employees, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

}
