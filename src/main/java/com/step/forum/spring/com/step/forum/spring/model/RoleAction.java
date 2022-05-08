package com.step.forum.spring.com.step.forum.spring.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "role_action_dbt")
public class RoleAction {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
    @ManyToOne
    @JoinColumn(name = "action_id")
    private Action action;
}
