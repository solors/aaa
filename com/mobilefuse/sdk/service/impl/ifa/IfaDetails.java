package com.mobilefuse.sdk.service.impl.ifa;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: IfaDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class IfaDetails {
    @Nullable
    private final String advertisingId;
    @Nullable
    private final IfaSource ifaSource;
    private final boolean isLimitTrackingEnabled;

    public IfaDetails(@Nullable String str, boolean z, @Nullable IfaSource ifaSource) {
        this.advertisingId = str;
        this.isLimitTrackingEnabled = z;
        this.ifaSource = ifaSource;
    }

    public static /* synthetic */ IfaDetails copy$default(IfaDetails ifaDetails, String str, boolean z, IfaSource ifaSource, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ifaDetails.advertisingId;
        }
        if ((i & 2) != 0) {
            z = ifaDetails.isLimitTrackingEnabled;
        }
        if ((i & 4) != 0) {
            ifaSource = ifaDetails.ifaSource;
        }
        return ifaDetails.copy(str, z, ifaSource);
    }

    @Nullable
    public final String component1() {
        return this.advertisingId;
    }

    public final boolean component2() {
        return this.isLimitTrackingEnabled;
    }

    @Nullable
    public final IfaSource component3() {
        return this.ifaSource;
    }

    @NotNull
    public final IfaDetails copy(@Nullable String str, boolean z, @Nullable IfaSource ifaSource) {
        return new IfaDetails(str, z, ifaSource);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof IfaDetails) {
                IfaDetails ifaDetails = (IfaDetails) obj;
                if (!Intrinsics.m17075f(this.advertisingId, ifaDetails.advertisingId) || this.isLimitTrackingEnabled != ifaDetails.isLimitTrackingEnabled || !Intrinsics.m17075f(this.ifaSource, ifaDetails.ifaSource)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Nullable
    public final String getAdvertisingId() {
        return this.advertisingId;
    }

    @Nullable
    public final IfaSource getIfaSource() {
        return this.ifaSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i;
        String str = this.advertisingId;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        boolean z = this.isLimitTrackingEnabled;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        IfaSource ifaSource = this.ifaSource;
        if (ifaSource != null) {
            i2 = ifaSource.hashCode();
        }
        return i5 + i2;
    }

    public final boolean isLimitTrackingEnabled() {
        return this.isLimitTrackingEnabled;
    }

    @NotNull
    public String toString() {
        return "IfaDetails(advertisingId=" + this.advertisingId + ", isLimitTrackingEnabled=" + this.isLimitTrackingEnabled + ", ifaSource=" + this.ifaSource + ")";
    }
}
