package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class BorrowerDetails {
    @Id
    @GeneratedValue
    private int borrowerDetailsId;
    private String addess;
    private String email;
    private String phone;
}
