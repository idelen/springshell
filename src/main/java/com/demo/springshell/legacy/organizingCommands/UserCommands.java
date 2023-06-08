package com.demo.springshell.legacy.organizingCommands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class UserCommands {
    @ShellMethod(value = "This command ends up in the 'User Commands' group")
    public void foo() {}

    @ShellMethod(value = "This command ends up in the 'Other Commands' group",
            group = "Other Commands")
    public void bar() {}

}
