package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.os */
/* loaded from: classes8.dex */
public final class C31062os {

    /* renamed from: a */
    private final float f83589a;

    public C31062os(float f) {
        this.f83589a = f;
    }

    /* renamed from: a */
    public final float m30932a() {
        return this.f83589a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C31062os) && Float.compare(this.f83589a, ((C31062os) obj).f83589a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f83589a);
    }

    @NotNull
    public final String toString() {
        float f = this.f83589a;
        return "CoreNativeAdMedia(aspectRatio=" + f + ")";
    }
}
