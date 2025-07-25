package com.mobilefuse.sdk.nativeads;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NativeAdMarkup.kt */
@Metadata
/* loaded from: classes7.dex */
public final class NativeVideoAsset implements NativeAsset {

    /* renamed from: id */
    private final int f61697id;
    @NotNull
    private final String vastTag;

    public NativeVideoAsset(int i, @NotNull String vastTag) {
        Intrinsics.checkNotNullParameter(vastTag, "vastTag");
        this.f61697id = i;
        this.vastTag = vastTag;
    }

    public static /* synthetic */ NativeVideoAsset copy$default(NativeVideoAsset nativeVideoAsset, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = nativeVideoAsset.getId();
        }
        if ((i2 & 2) != 0) {
            str = nativeVideoAsset.vastTag;
        }
        return nativeVideoAsset.copy(i, str);
    }

    public final int component1() {
        return getId();
    }

    @NotNull
    public final String component2() {
        return this.vastTag;
    }

    @NotNull
    public final NativeVideoAsset copy(int i, @NotNull String vastTag) {
        Intrinsics.checkNotNullParameter(vastTag, "vastTag");
        return new NativeVideoAsset(i, vastTag);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof NativeVideoAsset) {
                NativeVideoAsset nativeVideoAsset = (NativeVideoAsset) obj;
                if (getId() != nativeVideoAsset.getId() || !Intrinsics.m17075f(this.vastTag, nativeVideoAsset.vastTag)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.mobilefuse.sdk.nativeads.NativeAsset
    public int getId() {
        return this.f61697id;
    }

    @NotNull
    public final String getVastTag() {
        return this.vastTag;
    }

    public int hashCode() {
        int i;
        int hashCode = Integer.hashCode(getId()) * 31;
        String str = this.vastTag;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        return "NativeVideoAsset(id=" + getId() + ", vastTag=" + this.vastTag + ")";
    }
}
