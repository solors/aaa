package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.z9 */
/* loaded from: classes6.dex */
public final class C19554z9 {

    /* renamed from: a */
    public final byte f48965a;

    /* renamed from: b */
    public final String f48966b;

    public C19554z9(byte b, String assetUrl) {
        Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
        this.f48965a = b;
        this.f48966b = assetUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19554z9)) {
            return false;
        }
        C19554z9 c19554z9 = (C19554z9) obj;
        if (this.f48965a == c19554z9.f48965a && Intrinsics.m17075f(this.f48966b, c19554z9.f48966b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f48966b.hashCode() + (Byte.hashCode(this.f48965a) * 31);
    }

    public final String toString() {
        return "RawAsset(mRawAssetType=" + ((int) this.f48965a) + ", assetUrl=" + this.f48966b + ')';
    }
}
