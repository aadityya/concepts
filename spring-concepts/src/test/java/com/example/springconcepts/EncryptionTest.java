package com.example.springconcepts;

import com.example.springconcepts.api.EncryptionHandler;
import com.example.springconcepts.service.impl.RSAEncryption;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class EncryptionTest {

    private static Logger LOGGER = LoggerFactory.getLogger(Application.class);

    @InjectMocks
    EncryptionHandler encryptionHandler;

    @Mock
    RSAEncryption rsaEncryption;

    @Test
    public void testEncrypt() {
        when(encryptionHandler.encrypt("hello")).thenReturn("Encrypted with RSA : hello");
        assertEquals(encryptionHandler.encrypt("hello"), "Encrypted with RSA : hello");
    }
}
