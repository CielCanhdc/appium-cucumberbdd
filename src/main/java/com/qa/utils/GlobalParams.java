package com.qa.utils;

public class GlobalParams {
    // --- Singleton Pattern ---
    private static final GlobalParams instance = new GlobalParams();
    private GlobalParams() {}   // tránh new từ bên ngoài
    public static GlobalParams getInstance() {
        return instance;
    }


    private final ThreadLocal<String> env = new ThreadLocal<String>();
    private final ThreadLocal<String> platformName = new ThreadLocal<String>();
    private final ThreadLocal<String> platformVersion = new ThreadLocal<String>();
    private final ThreadLocal<String> udid = new ThreadLocal<String>();
    private final ThreadLocal<String> deviceName = new ThreadLocal<String>();
    private final ThreadLocal<String> appiumPort = new ThreadLocal<String>();
    private final ThreadLocal<String> systemPort = new ThreadLocal<String>();
    private final ThreadLocal<String> chromeDriverPort = new ThreadLocal<String>();
    private final ThreadLocal<String> wdaLocalPort = new ThreadLocal<String>();
    private final ThreadLocal<String> webkitDebugProxyPort = new ThreadLocal<String>();

    public void setPlatformName(String platformName1){
        platformName.set(platformName1);
    }

    public String getPlatformName(){ return platformName.get();}

    public void setPlatformVersion(String platformVersion1){
        platformVersion.set(platformVersion1);
    }

    public String getPlatformVersion(){ return platformVersion.get();}

    public void setEnv(String env1){
        env.set(env1);
    }
    public String getEnv() { return env.get(); }

    public String getUDID() { return udid.get(); }

    public void setUDID(String udid2) {
        udid.set(udid2);
    }

    public String getDeviceName() {
        return deviceName.get();
    }

    public void setDeviceName(String deviceName2) {
        deviceName.set(deviceName2);
    }

    public String getAppiumPort() {
        return appiumPort.get();
    }

    public void setAppiumPort(String appiumPort2) {
        appiumPort.set(appiumPort2);
    }

    public String getSystemPort() {
        return systemPort.get();
    }

    public void setSystemPort(String systemPort2) {
        systemPort.set(systemPort2);
    }

    public String getChromeDriverPort() {
        return chromeDriverPort.get();
    }

    public void setChromeDriverPort(String chromeDriverPort2) {
        chromeDriverPort.set(chromeDriverPort2);
    }

    public String getWdaLocalPort() {
        return wdaLocalPort.get();
    }

    public void setWdaLocalPort(String wdaLocalPort2) {
        wdaLocalPort.set(wdaLocalPort2);
    }

    public String getWebkitDebugProxyPort() {
        return webkitDebugProxyPort.get();
    }

    public void setWebkitDebugProxyPort(String webkitDebugProxyPort2) {
        webkitDebugProxyPort.set(webkitDebugProxyPort2);
    }

    public void initializeGlobalParams(){

        this.setEnv(System.getProperty("env", "dev"));
//        this.setPlatformName(System.getProperty("platformName", "Android"));
//        this.setUDID(System.getProperty("udid", "not found"));
//        this.setAppiumPort(System.getProperty("appiumPort", "4723"));
//        this.setSystemPort(System.getProperty("systemPort", "8200"));
//        params.setDeviceName(System.getProperty("deviceName", "Pixel_5"));

//        switch(this.getPlatformName()){
//            case "android":
////                params.setSystemPort(System.getProperty("systemPort", "10000"));
////                params.setChromeDriverPort(System.getProperty("chromeDriverPort", "11000"));
//                break;
//            case "ios":
////                params.setWdaLocalPort(System.getProperty("wdaLocalPort", "10001"));
////                params.setWebkitDebugProxyPort(System.getProperty("webkitDebugProxyPort", "11001"));
//                break;
//            default:
//                throw new IllegalStateException("Invalid Platform Name!");
//        }
    }
}
