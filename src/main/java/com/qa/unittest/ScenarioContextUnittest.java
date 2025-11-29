package com.qa.unittest;

import com.qa.utils.ScenarioContext;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScenarioContextUnittest {

    private ScenarioContext ctx = ScenarioContext.getInstance();;


    @Test
    public void testSetAndGetContext() {
        String key = "testKey";
        String value = "testValue";

        ctx.setContext(key, value);

        System.out.println(ctx.contains(key));   // true
        System.out.println(ctx.getContext(key)); // "testValue"

        ScenarioContext.clear();
    }
}
