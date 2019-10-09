package com.example.springconcepts;


import com.example.springconcepts.api.EncryptionHandler;
import com.example.springconcepts.api.PersonHandler;
import com.example.springconcepts.dto.PersonVO;
import com.example.springconcepts.service.impl.RSAEncryption;
import com.example.springconcepts.service.impl.SHAEncryption;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class Application {


	private static Logger LOGGER = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

		EncryptionHandler handler = context.getBean(EncryptionHandler.class);
		RSAEncryption rsaBean = context.getBean(RSAEncryption.class);
		SHAEncryption shaBean = context.getBean(SHAEncryption.class);
		PersonHandler personHandler = context.getBean(PersonHandler.class);
		PersonVO person = new PersonVO(200L, "Ram1");


		LOGGER.debug("Handler : {}", handler);
		LOGGER.debug("Encryption Alogithm : {}", handler.getEncryptionAlorithm());


		handler = context.getBean(EncryptionHandler.class);
		LOGGER.debug("Handler : {}", handler);
		LOGGER.debug("Encryption Alogithm : {}", handler.getEncryptionAlorithm());

		LOGGER.debug("Encrypt : {}", handler.encrypt("Hello"));
		LOGGER.debug("Property Value from RSA: {}", rsaBean.getUrl());
		LOGGER.debug("Property Value from RSA: {}", rsaBean.getPort());

		LOGGER.debug("Property Value from SHA: {}", shaBean.getUrl());
		LOGGER.debug("Property Value from SHA: {}", shaBean.getPort());

		personHandler.save(person);


		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				context.close();
			}});




	}
}
