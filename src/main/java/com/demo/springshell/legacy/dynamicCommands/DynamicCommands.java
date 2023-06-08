package com.demo.springshell.legacy.dynamicCommands;

import org.springframework.shell.Availability;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellMethodAvailability;

@ShellComponent
public class DynamicCommands {
    private boolean connected;

    @ShellMethod("Connect to the server.")
    public void connect(String user, String password) {
        connected = true;
    }
    @ShellMethod("Disconnect from the server.")
    public void disconnect() {
        connected = false;
    }

    @ShellMethod("Download the nuclear codes.")
    @ShellMethodAvailability("downloadAvailability")
    public void download() {
    }

    public Availability downloadAvailability() {
        return connected
                ? Availability.available()
                : Availability.unavailable("you are not connected");
    }

}
