package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class AFi1zSDK {
    @Nullable
    public final String AFInAppEventParameterName;
    public final long AFInAppEventType;
    @NonNull
    public final String AFKeystoreWrapper;
    @Nullable

    /* renamed from: e */
    public final Throwable f13073e;
    @Nullable
    public final AFh1cSDK registerClient;
    @Nullable
    public final String unregisterClient;
    public final int valueOf;
    public final long values;

    public AFi1zSDK(@Nullable String str, @NonNull String str2, long j, long j2, int i, @Nullable AFh1cSDK aFh1cSDK, @Nullable String str3, Throwable th) {
        this.AFInAppEventParameterName = str;
        this.AFKeystoreWrapper = str2;
        this.values = j;
        this.AFInAppEventType = j2;
        this.valueOf = i;
        this.registerClient = aFh1cSDK;
        this.unregisterClient = str3;
        this.f13073e = th;
    }
}
