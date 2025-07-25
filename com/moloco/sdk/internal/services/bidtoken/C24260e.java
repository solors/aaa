package com.moloco.sdk.internal.services.bidtoken;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.services.bidtoken.e */
/* loaded from: classes7.dex */
public final class C24260e {

    /* renamed from: a */
    public final boolean f62832a;

    public C24260e(boolean z) {
        this.f62832a = z;
    }

    /* renamed from: a */
    public final boolean m46700a() {
        return this.f62832a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C24260e) && this.f62832a == ((C24260e) obj).f62832a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        boolean z = this.f62832a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @NotNull
    public String toString() {
        return "BidTokenConfig(dbtEnabled=" + this.f62832a + ')';
    }
}
