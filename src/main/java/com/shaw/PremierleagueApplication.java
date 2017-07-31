package com.shaw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shaw.schedule.mapper")
public class PremierleagueApplication {
	public static void main(String[] args) {
		SpringApplication.run(PremierleagueApplication.class, args);
	}
}
