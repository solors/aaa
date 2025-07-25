package com.amazon.device.ads;

/* loaded from: classes2.dex */
public interface DtbLogListener {
    String getTag();

    void postMessage(DTBLogLevel dTBLogLevel, String str);
}
