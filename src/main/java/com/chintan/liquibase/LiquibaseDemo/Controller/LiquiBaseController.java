package com.chintan.liquibase.LiquibaseDemo.Controller;

import com.chintan.liquibase.LiquibaseDemo.Model.LiquiBase;
import com.chintan.liquibase.LiquibaseDemo.Service.LiquiBaseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/liqui-base")
public class LiquiBaseController {

    private final LiquiBaseService liquiBaseService;

    public LiquiBaseController(LiquiBaseService l) {
        this.liquiBaseService = l;
    }

    @GetMapping("/get")
    public String getAll() {
        liquiBaseService.getAll();
        return "hello";
    }
}
