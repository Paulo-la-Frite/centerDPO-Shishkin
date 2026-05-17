package org.example.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {



    @Test
    void isEmptyAccept() {

        Controller controller = new Controller();

        assertTrue(controller.isEmptyAccept("", ""));
        assertTrue(controller.isEmptyAccept(null, "123"));
        assertTrue(controller.isEmptyAccept("admin", null));

        assertFalse(controller.isEmptyAccept("admin", "12345"));

    }

    @Test
    void getAccept() {

        Controller controller = new Controller();

        assertEquals(0, controller.getAccept("", ""));
        assertEquals(0, controller.getAccept(null, "123"));
        assertEquals(0, controller.getAccept("admin", null));

    }
}