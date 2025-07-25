package com.appsflyer.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AFh1dSDK {
    public final float AFInAppEventParameterName;
    @NotNull
    public final String AFInAppEventType;
    public long AFKeystoreWrapper;
    @NotNull
    public final String unregisterClient;
    public final int valueOf;
    @NotNull
    public List<String> values;

    public AFh1dSDK(long j, float f, @NotNull List<String> list, int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AFKeystoreWrapper = j;
        this.AFInAppEventParameterName = f;
        this.values = list;
        this.valueOf = i;
        this.AFInAppEventType = str;
        this.unregisterClient = str2;
    }

    public final boolean AFInAppEventType() {
        if (TimeUnit.SECONDS.toMillis(this.AFKeystoreWrapper) > AFb1rSDK.AFInAppEventParameterName().AFInAppEventType().AFLogger().AFInAppEventType()) {
            return true;
        }
        return false;
    }

    public final boolean equals(@Nullable Object obj) {
        Class<?> cls;
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.m17075f(AFh1dSDK.class, cls)) {
            return false;
        }
        if (obj != null) {
            AFh1dSDK aFh1dSDK = (AFh1dSDK) obj;
            if (this.AFKeystoreWrapper != aFh1dSDK.AFKeystoreWrapper) {
                return false;
            }
            if (this.AFInAppEventParameterName == aFh1dSDK.AFInAppEventParameterName) {
                z = true;
            } else {
                z = false;
            }
            if (z && Intrinsics.m17075f(this.values, aFh1dSDK.values) && this.valueOf == aFh1dSDK.valueOf && Intrinsics.m17075f(this.AFInAppEventType, aFh1dSDK.AFInAppEventType) && Intrinsics.m17075f(this.unregisterClient, aFh1dSDK.unregisterClient)) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.appsflyer.internal.model.rc.RDConfiguration");
    }

    public final int hashCode() {
        return (((((((((Long.hashCode(this.AFKeystoreWrapper) * 31) + Float.hashCode(this.AFInAppEventParameterName)) * 31) + this.values.hashCode()) * 31) + this.valueOf) * 31) + this.AFInAppEventType.hashCode()) * 31) + this.unregisterClient.hashCode();
    }
}
