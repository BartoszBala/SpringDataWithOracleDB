package bartosz.bala.lesson.spring.demo;

import bartosz.bala.lesson.spring.demo.DAO.entity.Model.CustomerModel.Customer;
import bartosz.bala.lesson.spring.demo.DAO.entity.Model.EmployeeModel.Employee;
import bartosz.bala.lesson.spring.demo.DAO.CustomerRepo;
import bartosz.bala.lesson.spring.demo.DAO.EmployeeRepo;
import bartosz.bala.lesson.spring.demo.manager.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("api/employee")
public class EmployeeApi {

    private EmployeeManager employeeManager;


    @Autowired
    public EmployeeApi(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    @GetMapping("/all")
    public List<Employee> getAll() {
        return employeeManager.findAllEmployee();
    }

    @GetMapping
    public Optional<Employee> getById(@RequestParam long id) {
        return employeeManager.findById(id);
    }
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){

        return employeeManager.addEmployee(employee);
    }

    @DeleteMapping
    public void deleteEmployee(@RequestParam long id){

        employeeManager.delateEmployee(id);
    }


//    @EventListener(ApplicationReadyEvent.class)
//    public void runExample() {
//
//      List<Customer> listOfCustomer = (List<Customer>) customerRepo.findAll();
//       List<Employee> listOfEmployee = (List<Employee>) employeeRepo.findAll();


//        listOfCustomer.stream().forEach(x -> System.out.println(x));
//        listOfEmployee.stream().forEach(x -> System.out.println(x));

//        Customer c1 = customerRepo.findById(24L).orElse(null);
//        System.out.println(customerRepo.existsById(24L));
//        customerRepo.delete(c1);
//        System.out.println(customerRepo.existsById(24L));

    //   System.out.println("Lista klientów Kowalskiego");
    //  customerRepo.findAllByEmployee_LastNameOrderByLastName("Kowalski").stream().forEach(x-> System.out.println(x));
    //    System.out.println("wszyscy klienci o imieniu agnieszka");
    //   customerRepo.findAllByFirstnameContainsOrderByFirstname("Agnieszka").stream().forEach(x-> System.out.println(x));

//        Address address1 = new Address("Polska","Skierniewice","60-200","Warszawska","21");
//        LocalDate dateStartWork = LocalDate.of(2016, Month.MAY,01);
//       Employee employee2 = new Employee("Antonina","Zych","zych@praca.pl",address1,dateStartWork, DepartmentType.BOARDS);
//
//        employeeRepo.save(employee2);
    //  System.out.println("Find client by Department: Boards");
    //  employeeRepo.findAllByDepartmentTypeOrderByFirstName(DepartmentType.BOARDS).stream().forEach(System.out::println);
//    }
}
