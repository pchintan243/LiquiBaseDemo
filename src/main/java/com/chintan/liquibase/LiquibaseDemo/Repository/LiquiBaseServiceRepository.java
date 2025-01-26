package com.chintan.liquibase.LiquibaseDemo.Repository;

import com.chintan.liquibase.LiquibaseDemo.Model.LiquiBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiquiBaseServiceRepository extends JpaRepository<LiquiBase, Long> {
}
