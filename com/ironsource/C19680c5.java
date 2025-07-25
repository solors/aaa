package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.c5 */
/* loaded from: classes6.dex */
public final class C19680c5 {
    @NotNull

    /* renamed from: a */
    private final String f49404a;
    @NotNull

    /* renamed from: b */
    private final JSONObject f49405b;
    @Nullable

    /* renamed from: c */
    private final C19897f5 f49406c;

    /* renamed from: d */
    private final int f49407d;
    @NotNull

    /* renamed from: e */
    private final String f49408e;

    public C19680c5(@NotNull String auctionId, @NotNull JSONObject auctionResponseGenericParam, @Nullable C19897f5 c19897f5, int i, @NotNull String auctionFallback) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(auctionResponseGenericParam, "auctionResponseGenericParam");
        Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        this.f49404a = auctionId;
        this.f49405b = auctionResponseGenericParam;
        this.f49406c = c19897f5;
        this.f49407d = i;
        this.f49408e = auctionFallback;
    }

    /* renamed from: a */
    public static /* synthetic */ C19680c5 m59202a(C19680c5 c19680c5, String str, JSONObject jSONObject, C19897f5 c19897f5, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c19680c5.f49404a;
        }
        if ((i2 & 2) != 0) {
            jSONObject = c19680c5.f49405b;
        }
        JSONObject jSONObject2 = jSONObject;
        if ((i2 & 4) != 0) {
            c19897f5 = c19680c5.f49406c;
        }
        C19897f5 c19897f52 = c19897f5;
        if ((i2 & 8) != 0) {
            i = c19680c5.f49407d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str2 = c19680c5.f49408e;
        }
        return c19680c5.m59201a(str, jSONObject2, c19897f52, i3, str2);
    }

    @NotNull
    /* renamed from: b */
    public final JSONObject m59200b() {
        return this.f49405b;
    }

    @Nullable
    /* renamed from: c */
    public final C19897f5 m59199c() {
        return this.f49406c;
    }

    /* renamed from: d */
    public final int m59198d() {
        return this.f49407d;
    }

    @NotNull
    /* renamed from: e */
    public final String m59197e() {
        return this.f49408e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19680c5)) {
            return false;
        }
        C19680c5 c19680c5 = (C19680c5) obj;
        if (Intrinsics.m17075f(this.f49404a, c19680c5.f49404a) && Intrinsics.m17075f(this.f49405b, c19680c5.f49405b) && Intrinsics.m17075f(this.f49406c, c19680c5.f49406c) && this.f49407d == c19680c5.f49407d && Intrinsics.m17075f(this.f49408e, c19680c5.f49408e)) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final String m59196f() {
        return this.f49408e;
    }

    @NotNull
    /* renamed from: g */
    public final String m59195g() {
        return this.f49404a;
    }

    @NotNull
    /* renamed from: h */
    public final JSONObject m59194h() {
        return this.f49405b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f49404a.hashCode() * 31) + this.f49405b.hashCode()) * 31;
        C19897f5 c19897f5 = this.f49406c;
        if (c19897f5 == null) {
            hashCode = 0;
        } else {
            hashCode = c19897f5.hashCode();
        }
        return ((((hashCode2 + hashCode) * 31) + Integer.hashCode(this.f49407d)) * 31) + this.f49408e.hashCode();
    }

    /* renamed from: i */
    public final int m59193i() {
        return this.f49407d;
    }

    @Nullable
    /* renamed from: j */
    public final C19897f5 m59192j() {
        return this.f49406c;
    }

    @NotNull
    public String toString() {
        return "AuctionResponseData(auctionId=" + this.f49404a + ", auctionResponseGenericParam=" + this.f49405b + ", genericNotifications=" + this.f49406c + ", auctionTrial=" + this.f49407d + ", auctionFallback=" + this.f49408e + ')';
    }

    @NotNull
    /* renamed from: a */
    public final C19680c5 m59201a(@NotNull String auctionId, @NotNull JSONObject auctionResponseGenericParam, @Nullable C19897f5 c19897f5, int i, @NotNull String auctionFallback) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(auctionResponseGenericParam, "auctionResponseGenericParam");
        Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        return new C19680c5(auctionId, auctionResponseGenericParam, c19897f5, i, auctionFallback);
    }

    @NotNull
    /* renamed from: a */
    public final String m59203a() {
        return this.f49404a;
    }
}
