package com.mobilefuse.videoplayer.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class VastUniversalAdId {
    @Nullable
    private final String idRegistry;
    @Nullable
    private final String identifier;

    public VastUniversalAdId(@Nullable String str, @Nullable String str2) {
        this.identifier = str;
        this.idRegistry = str2;
    }

    public static /* synthetic */ VastUniversalAdId copy$default(VastUniversalAdId vastUniversalAdId, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vastUniversalAdId.identifier;
        }
        if ((i & 2) != 0) {
            str2 = vastUniversalAdId.idRegistry;
        }
        return vastUniversalAdId.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.identifier;
    }

    @Nullable
    public final String component2() {
        return this.idRegistry;
    }

    @NotNull
    public final VastUniversalAdId copy(@Nullable String str, @Nullable String str2) {
        return new VastUniversalAdId(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof VastUniversalAdId) {
                VastUniversalAdId vastUniversalAdId = (VastUniversalAdId) obj;
                if (!Intrinsics.m17075f(this.identifier, vastUniversalAdId.identifier) || !Intrinsics.m17075f(this.idRegistry, vastUniversalAdId.idRegistry)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Nullable
    public final String getIdRegistry() {
        return this.idRegistry;
    }

    @Nullable
    public final String getIdentifier() {
        return this.identifier;
    }

    public int hashCode() {
        int i;
        String str = this.identifier;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.idRegistry;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    @NotNull
    public String toString() {
        return "VastUniversalAdId(identifier=" + this.identifier + ", idRegistry=" + this.idRegistry + ")";
    }
}
