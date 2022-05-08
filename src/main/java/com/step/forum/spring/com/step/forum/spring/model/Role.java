package com.step.forum.spring.com.step.forum.spring.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "role_dbt")
public class Role {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String roleType;
    @OneToMany(mappedBy = "role")
    private List<RoleAction> actionList;

    public Role(int id) {
        this.id = id;
    }
}
