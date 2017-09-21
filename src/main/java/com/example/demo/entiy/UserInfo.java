package com.example.demo.entiy;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class UserInfo {

    @Id
    @GeneratedValue
    private Integer id;
    private String userName;
    private Integer userAge;
}
