package com.bc.promote;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.bc.promote.dao")
@SpringBootApplication
public class BcPromoteApplication {
    public static void main(String[] args) {
        SpringApplication.run(BcPromoteApplication.class, args);
    }
}
