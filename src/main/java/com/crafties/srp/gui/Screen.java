package com.crafties.srp.gui;

public interface Screen {
    void print(String content);

    static Screen console() {
        return System.out::println;
    }
}
