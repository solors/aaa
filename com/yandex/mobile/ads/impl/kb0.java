package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.monetization.ads.common.AdImpressionData;
import com.yandex.mobile.ads.impl.kb0;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;

/* loaded from: classes8.dex */
public abstract class kb0<T extends kb0<T>> extends e12 {
    @NotNull

    /* renamed from: k */
    private final C30359g3 f81361k;
    @NotNull

    /* renamed from: l */
    private final ga0 f81362l;
    @NotNull

    /* renamed from: m */
    private final na0<T> f81363m;
    @NotNull

    /* renamed from: n */
    private final C31086p4 f81364n;
    @NotNull

    /* renamed from: o */
    private final za0 f81365o;
    @NotNull

    /* renamed from: p */
    private final C31952z4 f81366p;
    @NotNull

    /* renamed from: q */
    private final ky1 f81367q;
    @NotNull

    /* renamed from: r */
    private final C30536i7 f81368r;
    @Nullable

    /* renamed from: s */
    private ya0 f81369s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ kb0(android.content.Context r13, com.yandex.mobile.ads.impl.C30149d8 r14, com.yandex.mobile.ads.impl.C30359g3 r15, com.yandex.mobile.ads.impl.ga0 r16, com.yandex.mobile.ads.impl.na0 r17, com.yandex.mobile.ads.impl.C31086p4 r18) {
        /*
            r12 = this;
            com.yandex.mobile.ads.impl.za0 r7 = new com.yandex.mobile.ads.impl.za0
            r7.<init>()
            com.yandex.mobile.ads.impl.z4 r8 = new com.yandex.mobile.ads.impl.z4
            r8.<init>()
            int r0 = com.yandex.mobile.ads.impl.ky1.f81637d
            com.yandex.mobile.ads.impl.ky1 r9 = com.yandex.mobile.ads.impl.ky1.C30758a.m32392a()
            com.yandex.mobile.ads.impl.ae0 r5 = new com.yandex.mobile.ads.impl.ae0
            r5.<init>()
            r6 = r14
            r5.m35913a(r14)
            r10 = r15
            r5.m35912a(r15)
            com.yandex.mobile.ads.impl.i7 r11 = new com.yandex.mobile.ads.impl.i7
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r12
            r4 = r16
            r5 = r17
            r6 = r18
            r10 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.kb0.<init>(android.content.Context, com.yandex.mobile.ads.impl.d8, com.yandex.mobile.ads.impl.g3, com.yandex.mobile.ads.impl.ga0, com.yandex.mobile.ads.impl.na0, com.yandex.mobile.ads.impl.p4):void");
    }

    @Override // com.yandex.mobile.ads.impl.e12
    /* renamed from: a */
    protected final boolean mo32605a(int i) {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.e12
    /* renamed from: k */
    protected final boolean mo32602k() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.e12
    /* renamed from: l */
    public final boolean mo32601l() {
        return true;
    }

    @NotNull
    /* renamed from: n */
    public final C30743kr m32600n() {
        C31086p4 c31086p4 = this.f81364n;
        Context context = m26155e();
        C30149d8<String> adResponse = m26156d();
        C30359g3 adConfiguration = this.f81361k;
        String adInfo = this.f81363m.getAdInfo();
        c31086p4.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        String m35053p = adResponse.m35053p();
        if (m35053p == null && (m35053p = adConfiguration.m33966c()) == null) {
            m35053p = "";
        }
        qu1 m35077K = adResponse.m35077K();
        C31727w8 c31727w8 = null;
        if (m35077K.getWidth() == 0 || m35077K.getHeight() == 0) {
            m35077K = null;
        }
        if (m35077K != null) {
            c31727w8 = new C31727w8(m35077K.mo29651c(context), m35077K.mo29653a(context));
        }
        return new C30743kr(m35053p, c31727w8, adInfo);
    }

    @NotNull
    /* renamed from: o */
    protected abstract T mo27869o();

    @Override // com.yandex.mobile.ads.impl.InterfaceC30896n0
    public final void onLeftApplication() {
        ya0 ya0Var = this.f81369s;
        if (ya0Var != null) {
            ya0Var.onAdClicked();
        }
    }

    /* renamed from: p */
    public final void m32599p() {
        m26152h();
        this.f81367q.m32395a(zn0.f89006c, this);
        ya0 ya0Var = this.f81369s;
        if (ya0Var != null) {
            ya0Var.onAdDismissed();
        }
    }

    /* renamed from: q */
    public final void m32598q() {
        ya0 ya0Var = this.f81369s;
        if (ya0Var != null) {
            ya0Var.onAdShown();
        }
    }

    @Override // com.yandex.mobile.ads.impl.uh0.InterfaceC31586a
    /* renamed from: a */
    public final void mo28775a(@Nullable AdImpressionData adImpressionData) {
        ya0 ya0Var = this.f81369s;
        if (ya0Var != null) {
            ya0Var.mo26974a(adImpressionData);
        }
    }

    @Override // com.yandex.mobile.ads.impl.e12, com.yandex.mobile.ads.impl.InterfaceC30599j3
    /* renamed from: a */
    public void mo28535a(int i, @Nullable Bundle bundle) {
        getClass().toString();
        um0.m28725d(new Object[0]);
        Map<String, String> map = null;
        map = null;
        if (i == 0) {
            if (bundle != null) {
                Serializable serializable = bundle.getSerializable("extra_tracking_parameters");
                if (serializable instanceof Map) {
                    map = (Map) serializable;
                }
            }
            this.f81366p.m26392a(EnumC31868y4.f88028f);
            this.f81368r.m33357a();
            m32598q();
            za0 za0Var = this.f81365o;
            C30149d8<String> m26156d = m26156d();
            za0Var.getClass();
            if (m26156d == null || m26156d.m35047v() != EnumC29958ar.f76878c) {
                m34711a(map);
            }
        } else if (i == 16) {
            if (bundle != null) {
                Parcelable parcelable = bundle.getParcelable("impression_data_key");
                mo28775a(parcelable instanceof AdImpressionData ? (AdImpressionData) parcelable : null);
                return;
            }
            mo28775a((AdImpressionData) null);
        } else if (i == 17) {
            ya0 ya0Var = this.f81369s;
            if (ya0Var != null) {
                ya0Var.onAdClicked();
            }
        } else if (i == 2) {
            this.f81362l.m33900a(0);
            m34710b(0);
        } else if (i == 3) {
            this.f81362l.m33900a(8);
            m34710b(8);
        } else if (i == 4) {
            m32599p();
        } else if (i != 5) {
            super.mo28535a(i, bundle);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb0(@NotNull Context context, @NotNull C30149d8<String> adResponse, @NotNull C30359g3 adConfiguration, @NotNull ga0 fullScreenAdVisibilityValidator, @NotNull na0<T> fullScreenController, @NotNull C31086p4 adInfoMapper, @NotNull za0 fullScreenTrackingController, @NotNull C31952z4 adLoadingPhasesManager, @NotNull ky1 strongReferenceKeepingManager, @NotNull C30536i7 adRenderingResultReporter) {
        super(context, fullScreenAdVisibilityValidator, adResponse, adConfiguration);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(fullScreenAdVisibilityValidator, "fullScreenAdVisibilityValidator");
        Intrinsics.checkNotNullParameter(fullScreenController, "fullScreenController");
        Intrinsics.checkNotNullParameter(adInfoMapper, "adInfoMapper");
        Intrinsics.checkNotNullParameter(fullScreenTrackingController, "fullScreenTrackingController");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(strongReferenceKeepingManager, "strongReferenceKeepingManager");
        Intrinsics.checkNotNullParameter(adRenderingResultReporter, "adRenderingResultReporter");
        this.f81361k = adConfiguration;
        this.f81362l = fullScreenAdVisibilityValidator;
        this.f81363m = fullScreenController;
        this.f81364n = adInfoMapper;
        this.f81365o = fullScreenTrackingController;
        this.f81366p = adLoadingPhasesManager;
        this.f81367q = strongReferenceKeepingManager;
        this.f81368r = adRenderingResultReporter;
        C30763l1.f81656b.m32376a().m32377a("window_type_fullscreen", new C30216e1());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30896n0
    public final void onReturnedToApplication() {
    }

    /* renamed from: a */
    public final void m32603a(@NotNull ya0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81369s = listener;
    }

    @NotNull
    /* renamed from: a */
    public final Object m32604a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        m26153g();
        Result.C38506a c38506a = Result.f101870c;
        Result.m14549b(C38508r.m14540a(C30702k6.m32670a()));
        synchronized (this) {
        }
        C31952z4 c31952z4 = this.f81366p;
        EnumC31868y4 enumC31868y4 = EnumC31868y4.f88028f;
        C30030bj.m35463a(c31952z4, enumC31868y4, "adLoadingPhaseType", enumC31868y4, null);
        ky1 ky1Var = this.f81367q;
        zn0 zn0Var = zn0.f89006c;
        ky1Var.m32393b(zn0Var, this);
        Object mo26562a = this.f81363m.mo26562a((na0<T>) mo27869o(), activity);
        if (Result.m14546e(mo26562a) != null) {
            this.f81366p.m26392a(enumC31868y4);
            if (!C30079ca.m35331a((InterfaceC30957nn) this)) {
                this.f81367q.m32395a(zn0Var, this);
                this.f81363m.mo26564a(m26155e());
                super.mo26157c();
            }
        }
        return mo26562a;
    }
}
