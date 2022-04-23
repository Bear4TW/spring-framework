package com.example.spring13ormcinemalab.entity;

import com.example.spring13ormcinemalab.enums.Role;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class AccountDetails extends BaseEntity{

    private String name;
    private String address;
    private String country;
    private String city;
    private String state;
    private Integer age;
    private String postalCode;
    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToOne(mappedBy = "accountDetails")
    private UserAccount userAccount;



}
