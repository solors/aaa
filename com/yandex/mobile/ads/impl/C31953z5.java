package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.z5 */
/* loaded from: classes8.dex */
public final class C31953z5 {
    @NotNull

    /* renamed from: a */
    private final List<C30296f6> f88715a;

    /* renamed from: b */
    private final int f88716b;

    /* renamed from: c */
    private final int f88717c;

    public C31953z5(int i, int i2, @NotNull List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f88715a = items;
        this.f88716b = i;
        this.f88717c = i2;
    }

    /* renamed from: a */
    public final int m26375a() {
        return this.f88716b;
    }

    @NotNull
    /* renamed from: b */
    public final List<C30296f6> m26374b() {
        return this.f88715a;
    }

    /* renamed from: c */
    public final int m26373c() {
        return this.f88717c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31953z5)) {
            return false;
        }
        C31953z5 c31953z5 = (C31953z5) obj;
        if (Intrinsics.m17075f(this.f88715a, c31953z5.f88715a) && this.f88716b == c31953z5.f88716b && this.f88717c == c31953z5.f88717c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f88717c) + nt1.m31295a(this.f88716b, this.f88715a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        List<C30296f6> list = this.f88715a;
        int i = this.f88716b;
        int i2 = this.f88717c;
        return "AdPod(items=" + list + ", closableAdPosition=" + i + ", rewardAdPosition=" + i2 + ")";
    }
}
