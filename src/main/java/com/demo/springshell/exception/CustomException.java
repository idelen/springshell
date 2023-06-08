package com.demo.springshell.exception;

import org.springframework.boot.ExitCodeGenerator;

public class CustomException extends RuntimeException implements ExitCodeGenerator {

    @Override
    public int getExitCode() {
        return 0;
    }
}
