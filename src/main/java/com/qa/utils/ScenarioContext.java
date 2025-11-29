package com.qa.utils;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {
    private Map<String, Object> ctx = new HashMap<>();;
    private static ScenarioContext instance;

    private ScenarioContext() {
        ctx = new HashMap<>();
    }

    public static synchronized ScenarioContext getInstance() {
        if (instance == null) {
            instance = new ScenarioContext();
        }
        return instance;
    }

    public void setContext(String key, Object value) {
        ctx.put(key, value);
    }

    public Object getContext(String key){
        return ctx.get(key);
    }

    public Boolean contains(String key){
        return ctx.containsKey(key);
    }
}
