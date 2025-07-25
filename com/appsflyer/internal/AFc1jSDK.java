package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AFc1jSDK {
    @Nullable
    public final DeepLink AFKeystoreWrapper;
    private final boolean valueOf;

    public AFc1jSDK() {
        this(false, null, 3, null);
    }

    public final boolean AFInAppEventType() {
        return this.valueOf;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1jSDK)) {
            return false;
        }
        AFc1jSDK aFc1jSDK = (AFc1jSDK) obj;
        if (this.valueOf == aFc1jSDK.valueOf && Intrinsics.m17075f(this.AFKeystoreWrapper, aFc1jSDK.AFKeystoreWrapper)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        int hashCode;
        boolean z = this.valueOf;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        DeepLink deepLink = this.AFKeystoreWrapper;
        if (deepLink == null) {
            hashCode = 0;
        } else {
            hashCode = deepLink.hashCode();
        }
        return i + hashCode;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AFc1jSDK(values=");
        sb2.append(this.valueOf);
        sb2.append(", AFInAppEventType=");
        sb2.append(this.AFKeystoreWrapper);
        sb2.append(')');
        return sb2.toString();
    }

    public AFc1jSDK(boolean z, @Nullable DeepLink deepLink) {
        this.valueOf = z;
        this.AFKeystoreWrapper = deepLink;
    }

    public /* synthetic */ AFc1jSDK(boolean z, DeepLink deepLink, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : deepLink);
    }
}
