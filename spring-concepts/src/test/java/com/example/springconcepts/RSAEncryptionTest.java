package com.example.springconcepts;

import com.example.springconcepts.service.impl.RSAEncryption;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RSAEncryptionTest {

    private static Logger LOGGER = LoggerFactory.getLogger(Application.class);

    @Test
    void testEncrypt() {
        RSAEncryption rsa = new RSAEncryption();
        String actual = rsa.encrypt("Hello");
        String expected = "Encrypted with RSA : " + "Hello";

        assertEquals(actual, expected);
    }

    @Test
    void testEncrypt2() {
        RSAEncryption rsa = new RSAEncryption();
        String actual = rsa.encrypt("Hello");
        String expected = "Encrypted with RSA : " + "Hello1";

        assertNotEquals(actual, expected);
    }

    @BeforeAll
    static void exeuteBeforeAll() {
        LOGGER.debug("Executing before all tests");
    }

    @BeforeEach
    void exeuteBeforeEach() {
        LOGGER.debug("Executing before each Test");
    }

    @AfterAll
    static void executeAfterAll() {
        LOGGER.debug("Executing after all tests");
    }

    @AfterEach
    void exeuteAfterEach() {
        LOGGER.debug("Executing after each Test");
    }
}
