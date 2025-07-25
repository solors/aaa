package com.moloco.sdk.internal.services.bidtoken;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.services.bidtoken.j */
/* loaded from: classes7.dex */
public final class C24266j {
    @NotNull

    /* renamed from: a */
    public final String f62851a;
    @NotNull

    /* renamed from: b */
    public final String f62852b;
    @NotNull

    /* renamed from: c */
    public final C24260e f62853c;

    public C24266j(@NotNull String bidToken, @NotNull String publicKey, @NotNull C24260e bidTokenConfig) {
        Intrinsics.checkNotNullParameter(bidToken, "bidToken");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(bidTokenConfig, "bidTokenConfig");
        this.f62851a = bidToken;
        this.f62852b = publicKey;
        this.f62853c = bidTokenConfig;
    }

    @NotNull
    /* renamed from: a */
    public final String m46694a() {
        return this.f62851a;
    }

    @NotNull
    /* renamed from: b */
    public final C24260e m46693b() {
        return this.f62853c;
    }

    @NotNull
    /* renamed from: c */
    public final String m46692c() {
        return this.f62852b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24266j)) {
            return false;
        }
        C24266j c24266j = (C24266j) obj;
        if (Intrinsics.m17075f(this.f62851a, c24266j.f62851a) && Intrinsics.m17075f(this.f62852b, c24266j.f62852b) && Intrinsics.m17075f(this.f62853c, c24266j.f62853c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f62851a.hashCode() * 31) + this.f62852b.hashCode()) * 31) + this.f62853c.hashCode();
    }

    @NotNull
    public String toString() {
        return "BidTokenResponseComponents(bidToken=" + this.f62851a + ", publicKey=" + this.f62852b + ", bidTokenConfig=" + this.f62853c + ')';
    }
}
