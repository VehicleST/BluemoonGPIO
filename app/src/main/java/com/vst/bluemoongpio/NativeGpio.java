package com.vst.bluemoongpio;



public class NativeGpio {
    public static interface GpioInterruptCallback{
        void onNewValue(int value);
    }
    public static interface GpioInterruptCallback8{
        void onNewValue(int value);
    }
    public static native void readGpio(String path, GpioInterruptCallback callback);
    public static native void readGpio(String path, GpioInterruptCallback8 callback);
    static{
        System.loadLibrary("gpio");
    }
}
