package com.step.forum.spring.com.step.forum.spring.model;




import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "action_dbt")
public class Action {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String actionType;

    @OneToMany(mappedBy = "action")
    private List<RoleAction> actionList;
}
