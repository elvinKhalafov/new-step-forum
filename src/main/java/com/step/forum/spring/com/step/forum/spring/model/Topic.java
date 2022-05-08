package com.step.forum.spring.com.step.forum.spring.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.step.forum.spring.com.step.forum.spring.util.TopicUtil;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "topic_dbt")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Topic {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String descipt;

    private LocalDateTime shareDate;

    private int viewCount;

    private String name;

    private int commentCount;


    private int status;

    public String topicAge(){
        return TopicUtil.ageOf(shareDate);
    }
}
