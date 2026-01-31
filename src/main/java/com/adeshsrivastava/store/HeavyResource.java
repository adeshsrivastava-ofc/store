package com.adeshsrivastava.store;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Scope("prototype")
public class HeavyResource {
    public HeavyResource() {
        System.out.println("HeavyResource created");
    }
}
