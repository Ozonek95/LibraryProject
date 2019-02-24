package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class BorrowerDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int borrowerDetailsId;
    private String addess;
    private String email;
    private String phone;

    public BorrowerDetails(){}

    public BorrowerDetails(String addess, String email) {
        this.addess = addess;
        this.email = email;
    }
}
