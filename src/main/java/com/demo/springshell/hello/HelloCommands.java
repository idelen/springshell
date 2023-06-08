package com.demo.springshell.hello;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class HelloCommands {

    @ShellMethod(key = "hello")
    public String helloWorld (@ShellOption(defaultValue = "spring") String arg) {
        return "hello " + arg;
    }
}
