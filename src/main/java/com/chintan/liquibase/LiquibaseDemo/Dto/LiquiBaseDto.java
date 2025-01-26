package com.chintan.liquibase.LiquibaseDemo.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class LiquiBaseDto {

    private Long id;
    private String desc;

}
