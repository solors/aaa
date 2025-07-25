package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public interface AFd1fSDK {
    @NonNull
    ScheduledExecutorService AFInAppEventParameterName();

    @NonNull
    AFd1pSDK AFInAppEventType();

    @NonNull
    ExecutorService AFKeystoreWrapper();

    @NonNull
    AFg1mSDK AFLogger();

    @NonNull
    AFh1ySDK AFLogger$LogLevel();

    @NonNull
    AFi1vSDK AFPurchaseDetails();

    @NonNull
    AFc1tSDK afDebugLog();

    @NonNull
    AFc1fSDK afErrorLog();

    @NonNull
    AFd1uSDK afErrorLogForExcManagerOnly();

    @NonNull
    AFd1nSDK afInfoLog();

    @NonNull
    AFi1rSDK afLogForce();

    @NonNull
    AFe1bSDK afRDLog();

    @NonNull
    AFi1pSDK afVerboseLog();

    @NonNull
    AFb1tSDK afWarnLog();

    @NonNull
    /* renamed from: d */
    PurchaseHandler mo92176d();

    @NonNull
    /* renamed from: e */
    AFg1ySDK mo92175e();

    @NonNull
    AFi1cSDK force();

    @NonNull
    AFg1uSDK getCurrency();

    @NonNull
    AFd1oSDK getLevel();

    @NonNull
    AFd1aSDK getPrice();

    @NonNull
    AFc1pSDK getPurchaseToken();

    @NonNull
    /* renamed from: i */
    AFb1aSDK mo92174i();

    @NonNull
    AFh1wSDK registerClient();

    @NonNull
    AFj1zSDK unregisterClient();

    @NonNull
    /* renamed from: v */
    AFg1wSDK mo92173v();

    @NonNull
    AFd1sSDK valueOf();

    @NonNull
    AFe1rSDK values();

    @NonNull
    /* renamed from: w */
    AFe1aSDK mo92172w();
}
