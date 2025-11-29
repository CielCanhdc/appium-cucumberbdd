package com.qa.utils;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {

    // Mỗi thread (tức mỗi scenario khi chạy song song) có 1 instance riêng
    private static final ThreadLocal<ScenarioContext> threadLocalInstance =
            ThreadLocal.withInitial(ScenarioContext::new);

    private final Map<String, Object> ctx;

    private ScenarioContext() {
        ctx = new HashMap<>();
    }

    // Lấy instance theo từng thread
    public static ScenarioContext getInstance() {
        return threadLocalInstance.get();
    }

    public void setContext(String key, Object value) {
        ctx.put(key, value);
    }

    public Object getContext(String key) {
        return ctx.get(key);
    }

    public boolean contains(String key) {
        return ctx.containsKey(key);
    }

    // Khi scenario chạy xong → clear để tránh memory leak
    public static void clear() {
        threadLocalInstance.remove();
    }
}
