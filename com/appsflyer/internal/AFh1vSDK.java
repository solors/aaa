package com.appsflyer.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class AFh1vSDK extends AFg1cSDK {
    private final boolean AFInAppEventParameterName;
    @NotNull
    private final AFd1fSDK AFInAppEventType;

    public AFh1vSDK(@NotNull AFd1fSDK aFd1fSDK) {
        Intrinsics.checkNotNullParameter(aFd1fSDK, "");
        this.AFInAppEventType = aFd1fSDK;
        this.AFInAppEventParameterName = true;
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    /* renamed from: d */
    public final void mo92131d(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.AFInAppEventType.mo92174i().AFInAppEventParameterName("D", AFInAppEventParameterName(str, aFg1bSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    /* renamed from: e */
    public final void mo92130e(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, @NotNull Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z4) {
            this.AFInAppEventType.mo92174i().AFInAppEventParameterName(ExifInterface.LONGITUDE_EAST, AFInAppEventParameterName(str, aFg1bSDK));
        }
        if (z4) {
            this.AFInAppEventType.mo92174i().AFKeystoreWrapper(th);
        }
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final void force(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AFInAppEventType.mo92174i().AFInAppEventParameterName("F", AFInAppEventParameterName(str, aFg1bSDK));
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final boolean getShouldExtendMsg() {
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    /* renamed from: i */
    public final void mo92129i(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.AFInAppEventType.mo92174i().AFInAppEventParameterName("I", AFInAppEventParameterName(str, aFg1bSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    /* renamed from: v */
    public final void mo92128v(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.AFInAppEventType.mo92174i().AFInAppEventParameterName(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, AFInAppEventParameterName(str, aFg1bSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    /* renamed from: w */
    public final void mo92127w(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.AFInAppEventType.mo92174i().AFInAppEventParameterName(ExifInterface.LONGITUDE_WEST, AFInAppEventParameterName(str, aFg1bSDK));
        }
    }
}
