package com.br.vetorium;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

import vetorium.backend.App;

public class AppTest {

    @Test
    public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
