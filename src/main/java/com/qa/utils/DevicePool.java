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
        device_01.put("udid", "emulator-5554");
        device_01.put("appiumPort", "4723");
        device_01.put("platformName", "android");

        Map<String, Object> device_02 = new HashMap<>();
        device_02.put("udid", "emulator-5554");
        device_02.put("appiumPort", "4725");
        device_02.put("platformName", "android");

        Map<String, Object> device_03 = new HashMap<>();
        device_03.put("udid", "Xiaomi 17Pro");
        device_03.put("appiumPort", "4724");
        device_03.put("platformName", "android");

        POOL.add(device_01);
        POOL.add(device_02);
//        POOL.add(device_03);

        initialized = true;

    }

    /**
     * Lấy 1 device (thread-safe)
     */
    public static Map<String, Object> takeDevice() {
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