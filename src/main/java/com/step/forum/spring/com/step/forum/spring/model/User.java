package com.step.forum.spring.com.step.forum.spring.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name = "user_dbt")
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String email;

    private String password;

    private String lastName;

    private String firstName;
    private String token;

    private Integer status;
    private String imagePath;
    @OneToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private Role role;
}
