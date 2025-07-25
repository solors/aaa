package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class AFe1hSDK {
    public boolean AFInAppEventParameterName;
    @NonNull
    final String AFInAppEventType;
    @NonNull
    public final String AFKeystoreWrapper;
    @Nullable
    private final byte[] AFLogger;

    /* renamed from: d */
    private boolean f12991d;

    /* renamed from: e */
    private final boolean f12992e;
    public int registerClient;
    private final boolean unregisterClient;
    @NonNull
    final Map<String, String> valueOf;
    public boolean values;

    public AFe1hSDK(@NonNull String str, @Nullable byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z) {
        this(str, bArr, str2, map, z, (byte) 0);
    }

    public final boolean AFInAppEventParameterName() {
        return this.f12991d;
    }

    public final boolean AFInAppEventType() {
        return this.AFInAppEventParameterName;
    }

    public final boolean AFKeystoreWrapper() {
        return this.unregisterClient;
    }

    /* renamed from: e */
    public final boolean m92165e() {
        return this.values;
    }

    public final boolean valueOf() {
        return this.f12992e;
    }

    @Nullable
    public final byte[] values() {
        return this.AFLogger;
    }

    private AFe1hSDK(@NonNull String str, @Nullable byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z, byte b) {
        this.f12991d = true;
        this.AFInAppEventParameterName = false;
        this.values = true;
        this.registerClient = -1;
        this.AFKeystoreWrapper = str;
        this.AFLogger = bArr;
        this.AFInAppEventType = str2;
        this.valueOf = map;
        this.f12992e = z;
        this.unregisterClient = true;
    }

    public AFe1hSDK(@NonNull String str, @NonNull String str2) {
        this(str, null, str2, new HashMap(), false);
    }
}
