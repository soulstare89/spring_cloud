package com.finchley.consumerribbon.consumerribbon.service.impl;

import com.finchley.consumerribbon.consumerribbon.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImpl implements IHelloService {

    @Autowired
    private RestTemplate  restTemplate;

    @Override
    public String hiService(String name) {
        System.out.print("api-a");
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
}
