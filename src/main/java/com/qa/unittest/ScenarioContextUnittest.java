package com.qa.unittest;

import com.qa.utils.ScenarioContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ScenarioContextUnittest {

    private final ScenarioContext ctx = ScenarioContext.getInstance();

    @Test
    public void testSetAndGetContext() {
        String key = "testKey";
        String value = "testValue";

        ctx.setContext(key, value);

        System.out.println(ctx.contains(key));
        System.out.println(ctx.getContext(key));
    }
}
