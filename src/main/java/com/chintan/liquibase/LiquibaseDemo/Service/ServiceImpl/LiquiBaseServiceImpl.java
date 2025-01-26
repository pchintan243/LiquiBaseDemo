package com.chintan.liquibase.LiquibaseDemo.Service.ServiceImpl;

import com.chintan.liquibase.LiquibaseDemo.Model.LiquiBase;
import com.chintan.liquibase.LiquibaseDemo.Service.LiquiBaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LiquiBaseServiceImpl implements LiquiBaseService {
    @Override
    public LiquiBase getAll() {
        return null;
    }
}
