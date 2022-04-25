package ru.job4j.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartUI {

    @Autowired
    private Store store;
    @Autowired
    private ConsoleInput consoleInput;

    public void add(String value) {
        store.add(value);
    }
    public void addConsoleInput(String value) {
        store.add(consoleInput.askStr(value));
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}