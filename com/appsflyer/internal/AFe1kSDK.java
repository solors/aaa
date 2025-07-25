package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class AFe1kSDK {
    @NotNull
    final String AFInAppEventType;
    @NotNull
    final String values;

    public AFe1kSDK(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AFInAppEventType = str;
        this.values = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1kSDK)) {
            return false;
        }
        AFe1kSDK aFe1kSDK = (AFe1kSDK) obj;
        if (Intrinsics.m17075f(this.AFInAppEventType, aFe1kSDK.AFInAppEventType) && Intrinsics.m17075f(this.values, aFe1kSDK.values)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.AFInAppEventType.hashCode() * 31) + this.values.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HostConfig(prefix=");
        sb2.append(this.AFInAppEventType);
        sb2.append(", host=");
        sb2.append(this.values);
        sb2.append(')');
        return sb2.toString();
    }
}
