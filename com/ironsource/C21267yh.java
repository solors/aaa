package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.yh */
/* loaded from: classes6.dex */
public final class C21267yh extends C20667q0 {
    @Nullable

    /* renamed from: t */
    private final String f54657t;
    @Nullable

    /* renamed from: u */
    private final List<NetworkSettings> f54658u;
    @NotNull

    /* renamed from: v */
    private final C20052hi f54659v;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C21267yh(@org.jetbrains.annotations.Nullable java.lang.String r25, @org.jetbrains.annotations.Nullable java.util.List<? extends com.ironsource.mediationsdk.model.NetworkSettings> r26, @org.jetbrains.annotations.NotNull com.ironsource.C20052hi r27) {
        /*
            r24 = this;
            r9 = r24
            r15 = r27
            r0 = r24
            r2 = r25
            r3 = r26
            java.lang.String r1 = "configs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL
            com.ironsource.h5 r5 = r27.m58136g()
            r4 = r5
            java.lang.String r6 = "configs.interstitialAuctionSettings"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            int r5 = r27.m58140c()
            int r6 = r27.m58139d()
            boolean r7 = r27.m58137f()
            int r8 = r27.m58141b()
            com.ironsource.g2 r16 = new com.ironsource.g2
            r10 = r16
            com.ironsource.g2$a r17 = com.ironsource.C19950g2.EnumC19951a.MANUAL
            com.ironsource.h5 r11 = r27.m58136g()
            long r18 = r11.m58289j()
            com.ironsource.h5 r11 = r27.m58136g()
            long r20 = r11.m58297b()
            r22 = -1
            r16.<init>(r17, r18, r20, r22)
            com.ironsource.b2 r12 = new com.ironsource.b2
            r11 = r12
            r13 = -1
            r12.<init>(r13)
            boolean r12 = r27.m58135h()
            long r13 = r27.m58134i()
            boolean r16 = r27.m58131l()
            r15 = r16
            boolean r16 = r27.m58129n()
            boolean r17 = r27.m58130m()
            r18 = -1
            r9 = r18
            r18 = 0
            r19 = 65536(0x10000, float:9.18355E-41)
            r20 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)
            r1 = r25
            r0.f54657t = r1
            r1 = r26
            r0.f54658u = r1
            r1 = r27
            r0.f54659v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C21267yh.<init>(java.lang.String, java.util.List, com.ironsource.hi):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ C21267yh m53978a(C21267yh c21267yh, String str, List list, C20052hi c20052hi, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c21267yh.mo53975p();
        }
        if ((i & 2) != 0) {
            list = c21267yh.mo53976k();
        }
        if ((i & 4) != 0) {
            c20052hi = c21267yh.f54659v;
        }
        return c21267yh.m53977a(str, list, c20052hi);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21267yh)) {
            return false;
        }
        C21267yh c21267yh = (C21267yh) obj;
        if (Intrinsics.m17075f(mo53975p(), c21267yh.mo53975p()) && Intrinsics.m17075f(mo53976k(), c21267yh.mo53976k()) && Intrinsics.m17075f(this.f54659v, c21267yh.f54659v)) {
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
        return ((i2 + i) * 31) + this.f54659v.hashCode();
    }

    @Override // com.ironsource.C20667q0
    @Nullable
    /* renamed from: k */
    public List<NetworkSettings> mo53976k() {
        return this.f54658u;
    }

    @Override // com.ironsource.C20667q0
    @Nullable
    /* renamed from: p */
    public String mo53975p() {
        return this.f54657t;
    }

    @Nullable
    /* renamed from: t */
    public final String m53974t() {
        return mo53975p();
    }

    @NotNull
    public String toString() {
        return "InterstitialAdManagerData(userId=" + mo53975p() + ", providerList=" + mo53976k() + ", configs=" + this.f54659v + ')';
    }

    @Nullable
    /* renamed from: u */
    public final List<NetworkSettings> m53973u() {
        return mo53976k();
    }

    @NotNull
    /* renamed from: v */
    public final C20052hi m53972v() {
        return this.f54659v;
    }

    @NotNull
    /* renamed from: w */
    public final C20052hi m53971w() {
        return this.f54659v;
    }

    @NotNull
    /* renamed from: a */
    public final C21267yh m53977a(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull C20052hi configs) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new C21267yh(str, list, configs);
    }
}
