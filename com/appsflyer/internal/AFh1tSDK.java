package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AFh1tSDK {
    @Nullable
    public Boolean AFInAppEventParameterName;
    @Nullable
    public Boolean AFInAppEventType;
    @Nullable
    public Boolean AFKeystoreWrapper;
    @Nullable
    public String AFLogger;
    @NotNull

    /* renamed from: d */
    public Map<String, Object> f13066d;
    @Nullable
    public Boolean registerClient;
    @Nullable
    public String valueOf;
    @Nullable
    public Boolean values;

    public AFh1tSDK() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFh1tSDK)) {
            return false;
        }
        AFh1tSDK aFh1tSDK = (AFh1tSDK) obj;
        if (Intrinsics.m17075f(this.valueOf, aFh1tSDK.valueOf) && Intrinsics.m17075f(this.values, aFh1tSDK.values) && Intrinsics.m17075f(this.AFKeystoreWrapper, aFh1tSDK.AFKeystoreWrapper) && Intrinsics.m17075f(this.AFInAppEventParameterName, aFh1tSDK.AFInAppEventParameterName) && Intrinsics.m17075f(this.AFInAppEventType, aFh1tSDK.AFInAppEventType) && Intrinsics.m17075f(this.AFLogger, aFh1tSDK.AFLogger) && Intrinsics.m17075f(this.registerClient, aFh1tSDK.registerClient) && Intrinsics.m17075f(this.f13066d, aFh1tSDK.f13066d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        String str = this.valueOf;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Boolean bool = this.values;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Boolean bool2 = this.AFKeystoreWrapper;
        if (bool2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Boolean bool3 = this.AFInAppEventParameterName;
        if (bool3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Boolean bool4 = this.AFInAppEventType;
        if (bool4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool4.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str2 = this.AFLogger;
        if (str2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str2.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Boolean bool5 = this.registerClient;
        if (bool5 != null) {
            i = bool5.hashCode();
        }
        return ((i7 + i) * 31) + this.f13066d.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AFh1tSDK(AFInAppEventType=");
        sb2.append(this.valueOf);
        sb2.append(", unregisterClient=");
        sb2.append(this.values);
        sb2.append(", AFInAppEventParameterName=");
        sb2.append(this.AFKeystoreWrapper);
        sb2.append(", valueOf=");
        sb2.append(this.AFInAppEventParameterName);
        sb2.append(", AFKeystoreWrapper=");
        sb2.append(this.AFInAppEventType);
        sb2.append(", values=");
        sb2.append(this.AFLogger);
        sb2.append(", AFLogger=");
        sb2.append(this.registerClient);
        sb2.append(", e=");
        sb2.append(this.f13066d);
        sb2.append(')');
        return sb2.toString();
    }

    private AFh1tSDK(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable String str2, @Nullable Boolean bool5, @NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.valueOf = str;
        this.values = bool;
        this.AFKeystoreWrapper = bool2;
        this.AFInAppEventParameterName = bool3;
        this.AFInAppEventType = bool4;
        this.AFLogger = str2;
        this.registerClient = bool5;
        this.f13066d = map;
    }

    public /* synthetic */ AFh1tSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : str2, (i & 64) == 0 ? bool5 : null, (i & 128) != 0 ? new HashMap() : map);
    }
}
