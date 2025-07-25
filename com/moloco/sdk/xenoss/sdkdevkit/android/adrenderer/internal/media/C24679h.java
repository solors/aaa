package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h */
/* loaded from: classes7.dex */
public final class C24679h {

    /* renamed from: a */
    public final int f63739a;

    /* renamed from: b */
    public final boolean f63740b;

    /* renamed from: c */
    public final double f63741c;

    /* renamed from: d */
    public final int f63742d;

    public C24679h(int i, boolean z, double d, int i2) {
        this.f63739a = i;
        this.f63740b = z;
        this.f63741c = d;
        this.f63742d = i2;
    }

    /* renamed from: a */
    public final int m45941a() {
        return this.f63739a;
    }

    /* renamed from: b */
    public final int m45940b() {
        return this.f63742d;
    }

    /* renamed from: c */
    public final double m45939c() {
        return this.f63741c;
    }

    /* renamed from: d */
    public final boolean m45938d() {
        return this.f63740b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24679h)) {
            return false;
        }
        C24679h c24679h = (C24679h) obj;
        if (this.f63739a == c24679h.f63739a && this.f63740b == c24679h.f63740b && Double.compare(this.f63741c, c24679h.f63741c) == 0 && this.f63742d == c24679h.f63742d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.f63739a) * 31;
        boolean z = this.f63740b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((hashCode + i) * 31) + Double.hashCode(this.f63741c)) * 31) + Integer.hashCode(this.f63742d);
    }

    @NotNull
    public String toString() {
        return "MediaConfig(chunkSize=" + this.f63739a + ", isStreamingEnabled=" + this.f63740b + ", minStreamingPlayableDurationOnTimeoutSecs=" + this.f63741c + ", mediaCacheDiskCleanUpLimit=" + this.f63742d + ')';
    }
}
