package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.b2 */
/* loaded from: classes8.dex */
public final class C29982b2 {

    /* renamed from: a */
    private final boolean f77048a;
    @NotNull

    /* renamed from: b */
    private final EnumC31944z1 f77049b;

    /* renamed from: c */
    private final long f77050c;

    /* renamed from: d */
    private final int f77051d;

    public C29982b2(boolean z, @NotNull EnumC31944z1 requestPolicy, long j, int i) {
        Intrinsics.checkNotNullParameter(requestPolicy, "requestPolicy");
        this.f77048a = z;
        this.f77049b = requestPolicy;
        this.f77050c = j;
        this.f77051d = i;
    }

    /* renamed from: a */
    public final int m35684a() {
        return this.f77051d;
    }

    /* renamed from: b */
    public final long m35683b() {
        return this.f77050c;
    }

    @NotNull
    /* renamed from: c */
    public final EnumC31944z1 m35682c() {
        return this.f77049b;
    }

    /* renamed from: d */
    public final boolean m35681d() {
        return this.f77048a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29982b2)) {
            return false;
        }
        C29982b2 c29982b2 = (C29982b2) obj;
        if (this.f77048a == c29982b2.f77048a && this.f77049b == c29982b2.f77049b && this.f77050c == c29982b2.f77050c && this.f77051d == c29982b2.f77051d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f77049b.hashCode();
        int hashCode2 = Long.hashCode(this.f77050c);
        return Integer.hashCode(this.f77051d) + ((hashCode2 + ((hashCode + (Boolean.hashCode(this.f77048a) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        boolean z = this.f77048a;
        EnumC31944z1 enumC31944z1 = this.f77049b;
        long j = this.f77050c;
        int i = this.f77051d;
        return "AdBlockerState(wasDetected=" + z + ", requestPolicy=" + enumC31944z1 + ", lastUpdateTime=" + j + ", failedRequestsCount=" + i + ")";
    }
}
