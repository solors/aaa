package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AFe1dSDK {
    @NotNull
    public final AFe1cSDK AFInAppEventParameterName;
    @NotNull
    public final String AFKeystoreWrapper;
    @Nullable
    public final String values;

    public AFe1dSDK(@NotNull String str, @Nullable String str2, @NotNull AFe1cSDK aFe1cSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFe1cSDK, "");
        this.AFKeystoreWrapper = str;
        this.values = str2;
        this.AFInAppEventParameterName = aFe1cSDK;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1dSDK)) {
            return false;
        }
        AFe1dSDK aFe1dSDK = (AFe1dSDK) obj;
        if (Intrinsics.m17075f(this.AFKeystoreWrapper, aFe1dSDK.AFKeystoreWrapper) && Intrinsics.m17075f(this.values, aFe1dSDK.values) && this.AFInAppEventParameterName == aFe1dSDK.AFInAppEventParameterName) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.AFKeystoreWrapper.hashCode() * 31;
        String str = this.values;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.AFInAppEventParameterName.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AFe1dSDK(AFKeystoreWrapper=");
        sb2.append(this.AFKeystoreWrapper);
        sb2.append(", valueOf=");
        sb2.append(this.values);
        sb2.append(", AFInAppEventType=");
        sb2.append(this.AFInAppEventParameterName);
        sb2.append(')');
        return sb2.toString();
    }
}
