package com.example.copilotdemo;

import java.util.Base64;

public class AsciiUtil {

    public String encodeWithBase64(String input) {
        return Base64.getEncoder().encodeToString(input.getBytes());
    }
}
