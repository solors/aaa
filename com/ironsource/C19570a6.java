package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.a6 */
/* loaded from: classes6.dex */
public final class C19570a6 extends C20667q0 {
    @Nullable

    /* renamed from: t */
    private final String f49021t;
    @Nullable

    /* renamed from: u */
    private final List<NetworkSettings> f49022u;
    @NotNull

    /* renamed from: v */
    private final C20512n6 f49023v;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C19570a6(@org.jetbrains.annotations.Nullable java.lang.String r22, @org.jetbrains.annotations.Nullable java.util.List<? extends com.ironsource.mediationsdk.model.NetworkSettings> r23, @org.jetbrains.annotations.NotNull com.ironsource.C20512n6 r24) {
        /*
            r21 = this;
            r9 = r21
            r15 = r24
            r0 = r21
            r2 = r22
            r3 = r23
            java.lang.String r1 = "configs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER
            com.ironsource.h5 r5 = r24.m56189d()
            r4 = r5
            java.lang.String r6 = "configs.bannerAuctionSettings"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            int r5 = r24.m56194a()
            long r6 = r24.m56191b()
            r8 = 1000(0x3e8, float:1.401E-42)
            long r10 = (long) r8
            long r6 = r6 / r10
            int r6 = (int) r6
            boolean r7 = r24.m56190c()
            int r8 = r24.m56186g()
            com.ironsource.g2 r10 = com.ironsource.C19618b6.m59352a(r24)
            com.ironsource.b2 r12 = new com.ironsource.b2
            r11 = r12
            long r13 = r24.m56182k()
            r12.<init>(r13)
            boolean r12 = r24.m56188e()
            long r13 = r24.m56187f()
            boolean r16 = r24.m56180m()
            r15 = r16
            boolean r16 = r24.m56178o()
            boolean r17 = r24.m56179n()
            r18 = -1
            r9 = r18
            r18 = 0
            r19 = 65536(0x10000, float:9.18355E-41)
            r20 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)
            r1 = r22
            r0.f49021t = r1
            r1 = r23
            r0.f49022u = r1
            r1 = r24
            r0.f49023v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C19570a6.<init>(java.lang.String, java.util.List, com.ironsource.n6):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ C19570a6 m59473a(C19570a6 c19570a6, String str, List list, C20512n6 c20512n6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c19570a6.mo53975p();
        }
        if ((i & 2) != 0) {
            list = c19570a6.mo53976k();
        }
        if ((i & 4) != 0) {
            c20512n6 = c19570a6.f49023v;
        }
        return c19570a6.m59472a(str, list, c20512n6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19570a6)) {
            return false;
        }
        C19570a6 c19570a6 = (C19570a6) obj;
        if (Intrinsics.m17075f(mo53975p(), c19570a6.mo53975p()) && Intrinsics.m17075f(mo53976k(), c19570a6.mo53976k()) && Intrinsics.m17075f(this.f49023v, c19570a6.f49023v)) {
            return true;
        }
        return false;
    }

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
        return ((i2 + i) * 31) + this.f49023v.hashCode();
    }

    @Override // com.ironsource.C20667q0
    @Nullable
    /* renamed from: k */
    public List<NetworkSettings> mo53976k() {
        return this.f49022u;
    }

    @Override // com.ironsource.C20667q0
    @Nullable
    /* renamed from: p */
    public String mo53975p() {
        return this.f49021t;
    }

    @Nullable
    /* renamed from: t */
    public final String m59471t() {
        return mo53975p();
    }

    @NotNull
    public String toString() {
        return "BannerAdManagerData(userId=" + mo53975p() + ", providerList=" + mo53976k() + ", configs=" + this.f49023v + ')';
    }

    @Nullable
    /* renamed from: u */
    public final List<NetworkSettings> m59470u() {
        return mo53976k();
    }

    @NotNull
    /* renamed from: v */
    public final C20512n6 m59469v() {
        return this.f49023v;
    }

    @NotNull
    /* renamed from: w */
    public final C20512n6 m59468w() {
        return this.f49023v;
    }

    @NotNull
    /* renamed from: a */
    public final C19570a6 m59472a(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull C20512n6 configs) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new C19570a6(str, list, configs);
    }
}
