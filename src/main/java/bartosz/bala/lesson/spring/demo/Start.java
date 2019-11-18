package bartosz.bala.lesson.spring.demo;

import bartosz.bala.lesson.spring.demo.Model.CustomerModel.Customer;
import bartosz.bala.lesson.spring.demo.Model.EmployeeModel.DepartmentType;
import bartosz.bala.lesson.spring.demo.Model.EmployeeModel.Employee;
import bartosz.bala.lesson.spring.demo.Repo.CustomerRepo;
import bartosz.bala.lesson.spring.demo.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("api/employee/")
public class Start {


    private CustomerRepo customerRepo;
    private EmployeeRepo employeeRepo;

    @Autowired
    public Start(CustomerRepo customerRepo, EmployeeRepo employeeRepo) {
        this.customerRepo = customerRepo;
        this.employeeRepo = employeeRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runExample() {

      List<Customer> listOfCustomer = (List<Customer>) customerRepo.findAll();
       List<Employee> listOfEmployee = (List<Employee>) employeeRepo.findAll();


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
    }
}
