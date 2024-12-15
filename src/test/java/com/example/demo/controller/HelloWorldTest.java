package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class HelloWorldTest {

    @InjectMocks
    HelloWorld helloWorld;
    @Test
    void sayHelloWorld() {
        assertEquals("hello !", helloWorld.sayHelloWorld());
    }
}