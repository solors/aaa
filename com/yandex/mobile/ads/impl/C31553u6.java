package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.u6 */
/* loaded from: classes8.dex */
public final class C31553u6 {

    /* renamed from: a */
    private final int f86122a;

    /* renamed from: b */
    private final boolean f86123b;

    public C31553u6(boolean z, int i) {
        this.f86122a = i;
        this.f86123b = z;
    }

    /* renamed from: a */
    public final boolean m28876a() {
        return this.f86123b;
    }

    /* renamed from: b */
    public final int m28875b() {
        return this.f86122a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31553u6)) {
            return false;
        }
        C31553u6 c31553u6 = (C31553u6) obj;
        if (this.f86122a == c31553u6.f86122a && this.f86123b == c31553u6.f86123b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86123b) + (Integer.hashCode(this.f86122a) * 31);
    }

    @NotNull
    public final String toString() {
        int i = this.f86122a;
        boolean z = this.f86123b;
        return "AdQualityVerificationNetworkConfiguration(usagePercent=" + i + ", disabled=" + z + ")";
    }
}
