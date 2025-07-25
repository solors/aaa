package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.b7 */
/* loaded from: classes8.dex */
public final class C29996b7 {

    /* renamed from: a */
    private final int f77164a;

    /* renamed from: b */
    private final boolean f77165b;

    public C29996b7(boolean z, int i) {
        this.f77164a = i;
        this.f77165b = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29996b7)) {
            return false;
        }
        C29996b7 c29996b7 = (C29996b7) obj;
        if (this.f77164a == c29996b7.f77164a && this.f77165b == c29996b7.f77165b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f77165b) + (Integer.hashCode(this.f77164a) * 31);
    }

    @NotNull
    public final String toString() {
        int i = this.f77164a;
        boolean z = this.f77165b;
        return "AdQualityVerifierNetworkConfiguration(usagePercent=" + i + ", disabled=" + z + ")";
    }
}
