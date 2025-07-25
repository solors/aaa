package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.services.AbstractC24350f0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.services.bidtoken.providers.q */
/* loaded from: classes7.dex */
public final class C24303q {
    @Nullable

    /* renamed from: a */
    public final Integer f62924a;
    @Nullable

    /* renamed from: b */
    public final Integer f62925b;

    /* renamed from: c */
    public final boolean f62926c;
    @NotNull

    /* renamed from: d */
    public final AbstractC24350f0 f62927d;

    public C24303q(@Nullable Integer num, @Nullable Integer num2, boolean z, @NotNull AbstractC24350f0 networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        this.f62924a = num;
        this.f62925b = num2;
        this.f62926c = z;
        this.f62927d = networkType;
    }

    @Nullable
    /* renamed from: a */
    public final Integer m46639a() {
        return this.f62924a;
    }

    @Nullable
    /* renamed from: b */
    public final Integer m46638b() {
        return this.f62925b;
    }

    /* renamed from: c */
    public final boolean m46637c() {
        return this.f62926c;
    }

    @NotNull
    /* renamed from: d */
    public final AbstractC24350f0 m46636d() {
        return this.f62927d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24303q)) {
            return false;
        }
        C24303q c24303q = (C24303q) obj;
        if (Intrinsics.m17075f(this.f62924a, c24303q.f62924a) && Intrinsics.m17075f(this.f62925b, c24303q.f62925b) && this.f62926c == c24303q.f62926c && Intrinsics.m17075f(this.f62927d, c24303q.f62927d)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        Integer num = this.f62924a;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num2 = this.f62925b;
        if (num2 != null) {
            i = num2.hashCode();
        }
        int i3 = (i2 + i) * 31;
        boolean z = this.f62926c;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        return ((i3 + i4) * 31) + this.f62927d.hashCode();
    }

    @NotNull
    public String toString() {
        return "NetworkInfoSignal(mobileCountryCode=" + this.f62924a + ", mobileNetworkCode=" + this.f62925b + ", networkRestricted=" + this.f62926c + ", networkType=" + this.f62927d + ')';
    }
}
