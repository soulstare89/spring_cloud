package com.finchley.consumerfeign.consumerfeign.rpcInterface.impl;

import com.finchley.consumerfeign.consumerfeign.rpcInterface.SchedualServiceHi;
import org.springframework.stereotype.Service;

@Service
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
