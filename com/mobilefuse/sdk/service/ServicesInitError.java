package com.mobilefuse.sdk.service;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MobileFuseServices.kt */
@Metadata
/* loaded from: classes7.dex */
public final class ServicesInitError {
    @NotNull
    private final String reason;

    public ServicesInitError(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.reason = reason;
    }

    public static /* synthetic */ ServicesInitError copy$default(ServicesInitError servicesInitError, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = servicesInitError.reason;
        }
        return servicesInitError.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.reason;
    }

    @NotNull
    public final ServicesInitError copy(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new ServicesInitError(reason);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (!(obj instanceof ServicesInitError) || !Intrinsics.m17075f(this.reason, ((ServicesInitError) obj).reason)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        String str = this.reason;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "ServicesInitError(reason=" + this.reason + ")";
    }
}
