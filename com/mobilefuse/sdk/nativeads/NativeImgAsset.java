package com.mobilefuse.sdk.nativeads;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NativeAdMarkup.kt */
@Metadata
/* loaded from: classes7.dex */
public final class NativeImgAsset implements NativeAsset {
    @Nullable
    private final Integer height;

    /* renamed from: id */
    private final int f61695id;
    @NotNull
    private final String url;
    @Nullable
    private final Integer width;

    public NativeImgAsset(int i, @Nullable Integer num, @Nullable Integer num2, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f61695id = i;
        this.width = num;
        this.height = num2;
        this.url = url;
    }

    public static /* synthetic */ NativeImgAsset copy$default(NativeImgAsset nativeImgAsset, int i, Integer num, Integer num2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = nativeImgAsset.getId();
        }
        if ((i2 & 2) != 0) {
            num = nativeImgAsset.width;
        }
        if ((i2 & 4) != 0) {
            num2 = nativeImgAsset.height;
        }
        if ((i2 & 8) != 0) {
            str = nativeImgAsset.url;
        }
        return nativeImgAsset.copy(i, num, num2, str);
    }

    public final int component1() {
        return getId();
    }

    @Nullable
    public final Integer component2() {
        return this.width;
    }

    @Nullable
    public final Integer component3() {
        return this.height;
    }

    @NotNull
    public final String component4() {
        return this.url;
    }

    @NotNull
    public final NativeImgAsset copy(int i, @Nullable Integer num, @Nullable Integer num2, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new NativeImgAsset(i, num, num2, url);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof NativeImgAsset) {
                NativeImgAsset nativeImgAsset = (NativeImgAsset) obj;
                if (getId() != nativeImgAsset.getId() || !Intrinsics.m17075f(this.width, nativeImgAsset.width) || !Intrinsics.m17075f(this.height, nativeImgAsset.height) || !Intrinsics.m17075f(this.url, nativeImgAsset.url)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Override // com.mobilefuse.sdk.nativeads.NativeAsset
    public int getId() {
        return this.f61695id;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = Integer.hashCode(getId()) * 31;
        Integer num = this.width;
        int i3 = 0;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        Integer num2 = this.height;
        if (num2 != null) {
            i2 = num2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str = this.url;
        if (str != null) {
            i3 = str.hashCode();
        }
        return i5 + i3;
    }

    @NotNull
    public String toString() {
        return "NativeImgAsset(id=" + getId() + ", width=" + this.width + ", height=" + this.height + ", url=" + this.url + ")";
    }
}
