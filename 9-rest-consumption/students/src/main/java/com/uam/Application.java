package com.uam;

import java.awt.print.Book;
import java.util.Collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.xml.Jaxb2CollectionHttpMessageConverter;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@ComponentScan
public class Application {

	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new Jaxb2CollectionHttpMessageConverter<Collection>());
		return restTemplate;
	}

    public <T> T getForObject(String url, Class<T> responseType, Object... urlVariables) throws RestClientException
    {

    }



}
