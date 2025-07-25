package com.mobilefuse.sdk.controllers;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.mobilefuse.sdk.controllers.ParsedPlacementId */
/* loaded from: classes7.dex */
public final class Placement {
    private final boolean isTestMode;
    @NotNull
    private final String placemenId;

    public Placement(@NotNull String placemenId, boolean z) {
        Intrinsics.checkNotNullParameter(placemenId, "placemenId");
        this.placemenId = placemenId;
        this.isTestMode = z;
    }

    public static /* synthetic */ Placement copy$default(Placement placement, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = placement.placemenId;
        }
        if ((i & 2) != 0) {
            z = placement.isTestMode;
        }
        return placement.copy(str, z);
    }

    @NotNull
    public final String component1() {
        return this.placemenId;
    }

    public final boolean component2() {
        return this.isTestMode;
    }

    @NotNull
    public final Placement copy(@NotNull String placemenId, boolean z) {
        Intrinsics.checkNotNullParameter(placemenId, "placemenId");
        return new Placement(placemenId, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof Placement) {
                Placement placement = (Placement) obj;
                if (!Intrinsics.m17075f(this.placemenId, placement.placemenId) || this.isTestMode != placement.isTestMode) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @NotNull
    public final String getPlacemenId() {
        return this.placemenId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i;
        String str = this.placemenId;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i2 = i * 31;
        boolean z = this.isTestMode;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        return i2 + i3;
    }

    public final boolean isTestMode() {
        return this.isTestMode;
    }

    @NotNull
    public String toString() {
        return "ParsedPlacementId(placemenId=" + this.placemenId + ", isTestMode=" + this.isTestMode + ")";
    }
}
