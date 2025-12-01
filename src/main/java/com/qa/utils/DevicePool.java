package com.qa.utils;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

public class DevicePool {

    private static final ConcurrentLinkedQueue<Map<String, Object>> POOL = new ConcurrentLinkedQueue<>();

    private static boolean initialized = false;

    public static synchronized void initDevicePool() {
        // Chỉ init 1 lần
        if (initialized) return;

        Map<String, Object> device_01 = new HashMap<>();
        device_01.put("udid", "Canh01");
        device_01.put("appiumPort", "CanhPort01");

        Map<String, Object> device_02 = new HashMap<>();
        device_02.put("udid", "Ciel02");
        device_02.put("appiumPort", "CielPort02");

        POOL.add(device_01);
        POOL.add(device_02);

        initialized = true;

    }

    /**
     * Lấy 1 device (thread-safe)
     */
    public static Map<String, Object> holdDevice() {
        Map<String, Object> device = POOL.poll();
        if (device == null) {
            throw new RuntimeException("No available devices in pool!");
        }
        return device;
    }

    /**
     * Trả lại device (optional)
     */
    public static void releaseDevice(Map<String, Object> device) {
        if (device != null) {
            POOL.add(device);
        }
    }
}