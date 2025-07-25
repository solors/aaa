package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class AFd1oSDK {
    @Nullable
    public AFd1vSDK AFInAppEventParameterName;
    @Nullable
    public String AFInAppEventType;
    @Nullable
    public AFc1cSDK AFKeystoreWrapper;
    @Nullable
    public AFh1tSDK AFLogger;

    /* renamed from: d */
    public boolean f12985d;
    @Nullable

    /* renamed from: e */
    public AppsFlyerConsent f12986e;
    @Nullable
    public AFe1mSDK unregisterClient;
    @Nullable
    public String valueOf;
    @Nullable
    public String values;

    public final boolean AFKeystoreWrapper() {
        return this.f12985d;
    }

    public final synchronized void values(@Nullable AFe1mSDK aFe1mSDK) {
        this.unregisterClient = aFe1mSDK;
    }
}
