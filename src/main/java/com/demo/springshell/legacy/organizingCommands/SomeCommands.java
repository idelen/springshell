package com.demo.springshell.legacy.organizingCommands;

import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellCommandGroup("Other Commands")
@ShellComponent
public class SomeCommands {
    @ShellMethod(value = "This one is in 'Other Commands'")
    public void wizz() {}

    @ShellMethod(value = "And this one is 'Yet Another Group'",
            group = "Yet Another Group")
    public void last() {}
}
