package com.appsflyer.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public enum AFg1bSDK {
    PRIVACY_SANDBOX("Privacy Sandbox"),
    OTHER("Other"),
    HTTP_CLIENT("HTTP Client"),
    QUEUE("Queue"),
    CACHE("Cache"),
    REMOTE_CONTROL("CFG"),
    DDL("DDL"),
    REFERRER("Referrer"),
    CROSS_PROMOTION("Cross Promotion"),
    EXCEPTION_MANAGER("Exception Manager"),
    ATTRIBUTION("Attribution"),
    RD("RD"),
    ENGAGEMENT("Engagement"),
    ANTI_FRAUD("Anti Fraud"),
    PUBLIC_API("Public API"),
    AD_REVENUE("Ad Revenue"),
    SDK_SETTERS("Setter"),
    PREDICT("Predict"),
    DEVICE_DATA("Device Data"),
    SECURITY("Security"),
    GENERAL("General"),
    PREINSTALL("Preinstall"),
    UNINSTALL("Uninstall"),
    PURCHASE_VALIDATION("Purchase Validation"),
    DMA("DMA"),
    PROXY("PROXY"),
    AFEXECUTOR("AFEXECUTOR");
    
    @NotNull
    final String AFInAppEventType;

    AFg1bSDK(String str) {
        this.AFInAppEventType = str;
    }
}
