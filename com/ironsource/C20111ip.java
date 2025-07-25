package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.ip */
/* loaded from: classes6.dex */
public final class C20111ip extends C20667q0 {
    @Nullable

    /* renamed from: t */
    private final String f50626t;
    @Nullable

    /* renamed from: u */
    private final List<NetworkSettings> f50627u;
    @NotNull

    /* renamed from: v */
    private final C20654pp f50628v;

    /* renamed from: w */
    private final boolean f50629w;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C20111ip(@org.jetbrains.annotations.Nullable java.lang.String r22, @org.jetbrains.annotations.Nullable java.util.List<? extends com.ironsource.mediationsdk.model.NetworkSettings> r23, @org.jetbrains.annotations.NotNull com.ironsource.C20654pp r24, boolean r25) {
        /*
            r21 = this;
            r15 = r21
            r13 = r24
            r0 = r21
            r2 = r22
            r3 = r23
            java.lang.String r1 = "configs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO
            com.ironsource.h5 r5 = r24.m55758k()
            r4 = r5
            java.lang.String r6 = "configs.rewardedVideoAuctionSettings"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            int r5 = r24.m55762g()
            int r6 = r24.m55761h()
            boolean r7 = r24.m55759j()
            int r8 = r24.m55767b()
            int r9 = r24.m55766c()
            com.ironsource.g2 r10 = com.ironsource.C20163jp.m57797a(r24, r25)
            com.ironsource.b2 r12 = new com.ironsource.b2
            r11 = r12
            r13 = -1
            r12.<init>(r13)
            boolean r12 = r24.m55757l()
            long r13 = r24.m55756m()
            boolean r16 = r24.m55763f()
            r15 = r16
            boolean r16 = r24.m55753p()
            boolean r17 = r24.m55754o()
            r18 = 0
            r19 = 65536(0x10000, float:9.18355E-41)
            r20 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)
            r1 = r22
            r0.f50626t = r1
            r1 = r23
            r0.f50627u = r1
            r1 = r24
            r0.f50628v = r1
            r1 = r25
            r0.f50629w = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C20111ip.<init>(java.lang.String, java.util.List, com.ironsource.pp, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ C20111ip m57959a(C20111ip c20111ip, String str, List list, C20654pp c20654pp, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c20111ip.mo53975p();
        }
        if ((i & 2) != 0) {
            list = c20111ip.mo53976k();
        }
        if ((i & 4) != 0) {
            c20654pp = c20111ip.f50628v;
        }
        if ((i & 8) != 0) {
            z = c20111ip.f50629w;
        }
        return c20111ip.m57958a(str, list, c20654pp, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20111ip)) {
            return false;
        }
        C20111ip c20111ip = (C20111ip) obj;
        if (Intrinsics.m17075f(mo53975p(), c20111ip.mo53975p()) && Intrinsics.m17075f(mo53976k(), c20111ip.mo53976k()) && Intrinsics.m17075f(this.f50628v, c20111ip.f50628v) && this.f50629w == c20111ip.f50629w) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int i = 0;
        if (mo53975p() == null) {
            hashCode = 0;
        } else {
            hashCode = mo53975p().hashCode();
        }
        int i2 = hashCode * 31;
        if (mo53976k() != null) {
            i = mo53976k().hashCode();
        }
        int hashCode2 = (((i2 + i) * 31) + this.f50628v.hashCode()) * 31;
        boolean z = this.f50629w;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        return hashCode2 + i3;
    }

    @Override // com.ironsource.C20667q0
    @Nullable
    /* renamed from: k */
    public List<NetworkSettings> mo53976k() {
        return this.f50627u;
    }

    @Override // com.ironsource.C20667q0
    @Nullable
    /* renamed from: p */
    public String mo53975p() {
        return this.f50626t;
    }

    @Nullable
    /* renamed from: t */
    public final String m57957t() {
        return mo53975p();
    }

    @NotNull
    public String toString() {
        return "RewardedVideoAdDataManager(userId=" + mo53975p() + ", providerList=" + mo53976k() + ", configs=" + this.f50628v + ", isManual=" + this.f50629w + ')';
    }

    @Nullable
    /* renamed from: u */
    public final List<NetworkSettings> m57956u() {
        return mo53976k();
    }

    @NotNull
    /* renamed from: v */
    public final C20654pp m57955v() {
        return this.f50628v;
    }

    /* renamed from: w */
    public final boolean m57954w() {
        return this.f50629w;
    }

    @NotNull
    /* renamed from: x */
    public final C20654pp m57953x() {
        return this.f50628v;
    }

    /* renamed from: y */
    public final boolean m57952y() {
        return this.f50629w;
    }

    @NotNull
    /* renamed from: a */
    public final C20111ip m57958a(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull C20654pp configs, boolean z) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new C20111ip(str, list, configs, z);
    }
}
