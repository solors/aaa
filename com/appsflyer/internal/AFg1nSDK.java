package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class AFg1nSDK {
    @NotNull
    final String AFInAppEventParameterName;
    final int AFInAppEventType;
    final int AFKeystoreWrapper;
    final int valueOf;
    final int values;

    public AFg1nSDK(int i, int i2, int i3, int i4, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = i;
        this.values = i2;
        this.AFKeystoreWrapper = i3;
        this.AFInAppEventType = i4;
        this.AFInAppEventParameterName = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1nSDK)) {
            return false;
        }
        AFg1nSDK aFg1nSDK = (AFg1nSDK) obj;
        if (this.valueOf == aFg1nSDK.valueOf && this.values == aFg1nSDK.values && this.AFKeystoreWrapper == aFg1nSDK.AFKeystoreWrapper && this.AFInAppEventType == aFg1nSDK.AFInAppEventType && Intrinsics.m17075f(this.AFInAppEventParameterName, aFg1nSDK.AFInAppEventParameterName)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((Integer.hashCode(this.valueOf) * 31) + Integer.hashCode(this.values)) * 31) + Integer.hashCode(this.AFKeystoreWrapper)) * 31) + Integer.hashCode(this.AFInAppEventType)) * 31) + this.AFInAppEventParameterName.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CmpTcfData(policyVersion=");
        sb2.append(this.valueOf);
        sb2.append(", gdprApplies=");
        sb2.append(this.values);
        sb2.append(", cmpSdkId=");
        sb2.append(this.AFKeystoreWrapper);
        sb2.append(", cmpSdkVersion=");
        sb2.append(this.AFInAppEventType);
        sb2.append(", tcString=");
        sb2.append(this.AFInAppEventParameterName);
        sb2.append(')');
        return sb2.toString();
    }
}
