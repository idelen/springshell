package com.demo.springshell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.command.annotation.CommandScan;

@CommandScan
@SpringBootApplication
public class SpringshellApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringshellApplication.class, args);
	}

}
