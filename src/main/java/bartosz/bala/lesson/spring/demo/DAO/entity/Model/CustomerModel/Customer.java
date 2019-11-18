package bartosz.bala.lesson.spring.demo.DAO.entity.Model.CustomerModel;

import bartosz.bala.lesson.spring.demo.DAO.entity.Model.AddressModel.Address;
import bartosz.bala.lesson.spring.demo.DAO.entity.Model.EmployeeModel.Employee;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="client_id")
    private long id;
    @Column(name="first_name")
    private String firstname;
    @Column(name="last_name")
    private String lastName;
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="employee_id",nullable=false)
    private Employee employee;
    @Embedded
    Address address;



    public Customer(String firstname, String lastName, Employee employee, Address address) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.employee = employee;
        this.address = address;

    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employee=" + employee +
                ", address=" + address +
                '}';
    }
}