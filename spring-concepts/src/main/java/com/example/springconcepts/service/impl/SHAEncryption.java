package com.example.springconcepts.service.impl;

import com.example.springconcepts.service.EncryptionAlorithm;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component
@Qualifier("shaEncryption")
@PropertySource(name = "myprops", value = {"application.properties", "MyApp.properties"})
public class SHAEncryption implements EncryptionAlorithm {

    public String getUrl() {
        return url;
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

    @Value("${application.url}")
    private String url;


    @Value("${application.port}")
    private String port;

    @Override
    public String encrypt(String input) {
        return "Encrypted with SHA : " + input;
    }


}


