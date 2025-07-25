package com.moloco.sdk.internal.services.bidtoken.providers;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.services.bidtoken.providers.d */
/* loaded from: classes7.dex */
public final class C24283d {

    /* renamed from: a */
    public final long f62885a;

    public C24283d(long j) {
        this.f62885a = j;
    }

    /* renamed from: a */
    public final long m46671a() {
        return this.f62885a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C24283d) && this.f62885a == ((C24283d) obj).f62885a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Long.hashCode(this.f62885a);
    }

    @NotNull
    public String toString() {
        return "AppDirInfo(appDirSize=" + this.f62885a + ')';
    }
}
