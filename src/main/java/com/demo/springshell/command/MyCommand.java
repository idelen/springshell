package com.demo.springshell.command;

import org.springframework.shell.command.annotation.Command;

@Command(command = "command")
public class MyCommand {
    @Command(command = "exam")
    public String example() {
        return "command example";
    }
}
