package com.chintan.liquibase.LiquibaseDemo.Model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "tbliquibase")
public class LiquiBase implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "liquibaseidp")
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "demo2")
    private String demo2;
}
