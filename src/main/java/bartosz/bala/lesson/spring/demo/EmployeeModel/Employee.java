package bartosz.bala.lesson.spring.demo.EmployeeModel;

import bartosz.bala.lesson.spring.demo.AddressModel.Address;
import bartosz.bala.lesson.spring.demo.CustomerModel.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_id")
    private long id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="email")
    private String email;
    @Embedded
    Address address;
    @Column(name="date_start_work")
    LocalDate startWork;
    @Enumerated(EnumType.STRING)
   @Column(name="department")
    DepartmentType departmentType;
    @OneToMany
    @JoinColumn(name="client_id")
    private Set<Customer> customers;


    public Employee(String firstName, String lastName, String email, Address address, LocalDate startWork, DepartmentType departmentType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.startWork = startWork;
        this.departmentType = departmentType;

    }
}
