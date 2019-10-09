package com.example.springconcepts.service.impl;

import com.example.springconcepts.Application;
import com.example.springconcepts.service.EncryptionAlorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Primary
@Component
@Qualifier("rsaEncryption")
@PropertySource({"application.properties"})

public class RSAEncryption implements EncryptionAlorithm {

    private static Logger LOGGER = LoggerFactory.getLogger(Application.class);

    @Value("${application.url}")
    private String url;


    @Value("${application.port}")
    private String port;


    @Override
    public String encrypt(String input) {
        return "Encrypted with RSA : " + input;
    }

    @PostConstruct
    public void afterConstruct() {
        LOGGER.debug("After construction");
    }

    @PreDestroy
    public void preDestroy() {
        LOGGER.debug("Pre Destroy");
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
