package com.example.springconcepts.api;

import com.example.springconcepts.service.EncryptionAlorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Configuration
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

public class EncryptionHandler {

    @Autowired
    @Qualifier("rsaEncryption")
    EncryptionAlorithm encryptionAlorithm;



    public String encrypt(String input) {
        return encryptionAlorithm.encrypt(input);
    }

    public EncryptionAlorithm getEncryptionAlorithm() {
        return encryptionAlorithm;
    }

    public void setEncryptionAlorithm(EncryptionAlorithm encryptionAlorithm) {
        this.encryptionAlorithm = encryptionAlorithm;
    }

}
