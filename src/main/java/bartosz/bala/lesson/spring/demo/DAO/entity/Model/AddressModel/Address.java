package bartosz.bala.lesson.spring.demo.DAO.entity.Model.AddressModel;


import lombok.*;

import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class Address {


    @Column(name="country")
    private String country;
    @Column(name="city")
    private String city;
    @Column(name="post_code")
    private String postCode;
    @Column(name="street")
    private String street;
    @Column(name="house_number")
    private String numberOfResidence;



    public Address(String country, String city, String postCode, String street, String numberOfResidence) {
        this.country = country;
        this.city = city;
        this.postCode = postCode;
        this.street = street;
        this.numberOfResidence = numberOfResidence;

    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", postCode='" + postCode + '\'' +
                ", street='" + street + '\'' +
                ", numberOfResidence='" + numberOfResidence + '\'' +
                '}';
    }
}
