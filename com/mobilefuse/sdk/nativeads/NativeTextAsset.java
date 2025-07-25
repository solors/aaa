package com.mobilefuse.sdk.nativeads;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NativeAdMarkup.kt */
@Metadata
/* loaded from: classes7.dex */
public final class NativeTextAsset implements NativeAsset {

    /* renamed from: id */
    private final int f61696id;
    @NotNull
    private final String text;

    public NativeTextAsset(int i, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f61696id = i;
        this.text = text;
    }

    public static /* synthetic */ NativeTextAsset copy$default(NativeTextAsset nativeTextAsset, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = nativeTextAsset.getId();
        }
        if ((i2 & 2) != 0) {
            str = nativeTextAsset.text;
        }
        return nativeTextAsset.copy(i, str);
    }

    public final int component1() {
        return getId();
    }

    @NotNull
    public final String component2() {
        return this.text;
    }

    @NotNull
    public final NativeTextAsset copy(int i, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new NativeTextAsset(i, text);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof NativeTextAsset) {
                NativeTextAsset nativeTextAsset = (NativeTextAsset) obj;
                if (getId() != nativeTextAsset.getId() || !Intrinsics.m17075f(this.text, nativeTextAsset.text)) {
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
        return this.f61696id;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int i;
        int hashCode = Integer.hashCode(getId()) * 31;
        String str = this.text;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        return "NativeTextAsset(id=" + getId() + ", text=" + this.text + ")";
    }
}
