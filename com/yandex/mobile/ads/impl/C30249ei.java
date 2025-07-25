package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.monetization.ads.common.AdImpressionData;
import com.yandex.mobile.ads.impl.qu1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ei */
/* loaded from: classes8.dex */
public final class C30249ei extends bk1 implements InterfaceC31373si {
    @NotNull

    /* renamed from: B */
    private final qm0 f78612B;
    @NotNull

    /* renamed from: C */
    private final C30168di f78613C;
    @NotNull

    /* renamed from: D */
    private final w82 f78614D;
    @NotNull

    /* renamed from: E */
    private final C30394gi f78615E;
    @NotNull

    /* renamed from: F */
    private final C30316fi f78616F;
    @NotNull

    /* renamed from: G */
    private final ae0 f78617G;
    @Nullable

    /* renamed from: H */
    private InterfaceC30556ii f78618H;
    @Nullable

    /* renamed from: I */
    private InterfaceC30556ii f78619I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30249ei(@NotNull Context context, @NotNull qm0 adView, @NotNull C30168di bannerAdListener, @NotNull C31952z4 adLoadingPhasesManager, @NotNull w82 videoEventController, @NotNull C30394gi bannerAdSizeValidator, @NotNull C30316fi adResponseControllerFactoryCreator, @NotNull ae0 htmlAdResponseReportManager) {
        super(context, adView, adLoadingPhasesManager);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(bannerAdListener, "bannerAdListener");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(videoEventController, "videoEventController");
        Intrinsics.checkNotNullParameter(bannerAdSizeValidator, "bannerAdSizeValidator");
        Intrinsics.checkNotNullParameter(adResponseControllerFactoryCreator, "adResponseControllerFactoryCreator");
        Intrinsics.checkNotNullParameter(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        this.f78612B = adView;
        this.f78613C = bannerAdListener;
        this.f78614D = videoEventController;
        this.f78615E = bannerAdSizeValidator;
        this.f78616F = adResponseControllerFactoryCreator;
        this.f78617G = htmlAdResponseReportManager;
        m34568a(adView);
        bannerAdListener.m34931a(htmlAdResponseReportManager);
    }

    /* renamed from: a */
    private static void m34568a(qm0 qm0Var) {
        qm0Var.setHorizontalScrollBarEnabled(false);
        qm0Var.setVerticalScrollBarEnabled(false);
        qm0Var.setVisibility(8);
        qm0Var.setBackgroundColor(0);
    }

    /* renamed from: A */
    public final void m34572A() {
        this.f78613C.m34933a();
    }

    @Nullable
    /* renamed from: B */
    public final String m34571B() {
        InterfaceC30556ii interfaceC30556ii = this.f78619I;
        if (interfaceC30556ii != null) {
            return interfaceC30556ii.getAdInfo();
        }
        return null;
    }

    @NotNull
    /* renamed from: C */
    public final qm0 m34570C() {
        return this.f78612B;
    }

    @NotNull
    /* renamed from: D */
    public final w82 m34569D() {
        return this.f78614D;
    }

    @Override // com.yandex.mobile.ads.impl.bk1, com.yandex.mobile.ads.impl.AbstractC30251ej
    /* renamed from: d */
    public final void mo34536d() {
        super.mo34536d();
        this.f78613C.m34926a((InterfaceC31229qr) null);
        fb2.m34180a(this.f78612B, true);
        this.f78612B.setVisibility(8);
        cc2.m35255a((ViewGroup) this.f78612B);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30251ej
    /* renamed from: e */
    public final void mo28844e() {
        InterfaceC30556ii[] interfaceC30556iiArr = {this.f78618H, this.f78619I};
        for (int i = 0; i < 2; i++) {
            InterfaceC30556ii interfaceC30556ii = interfaceC30556iiArr[i];
            if (interfaceC30556ii != null) {
                interfaceC30556ii.mo29559a(m34526l());
            }
        }
        super.mo28844e();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31373si
    public final void onLeftApplication() {
        this.f78613C.m34925b();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31373si
    public final void onReturnedToApplication() {
        this.f78613C.m34923c();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30251ej
    /* renamed from: u */
    public final void mo34519u() {
        qu1.EnumC31236a enumC31236a;
        super.mo34519u();
        InterfaceC30556ii interfaceC30556ii = this.f78618H;
        if (interfaceC30556ii != this.f78619I) {
            if (interfaceC30556ii != null) {
                interfaceC30556ii.mo29559a(m34526l());
            }
            this.f78618H = this.f78619I;
        }
        qu1 m33948r = m34533f().m33948r();
        qu1.EnumC31236a enumC31236a2 = qu1.EnumC31236a.f84541d;
        if (m33948r != null) {
            enumC31236a = m33948r.mo29654a();
        } else {
            enumC31236a = null;
        }
        if (enumC31236a2 == enumC31236a && this.f78612B.getLayoutParams() != null) {
            this.f78612B.getLayoutParams().height = -2;
        }
    }

    /* renamed from: z */
    public final boolean m34566z() {
        qu1 qu1Var;
        C30149d8<String> m34527k = m34527k();
        if (m34527k != null) {
            qu1Var = m34527k.m35077K();
        } else {
            qu1Var = null;
        }
        if (qu1Var != null) {
            qu1 m33948r = m34533f().m33948r();
            C30149d8<String> m34527k2 = m34527k();
            if (m34527k2 != null && m33948r != null && su1.m29530a(m34526l(), m34527k2, qu1Var, this.f78615E, m33948r)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31373si
    /* renamed from: a */
    public final void mo29602a(@Nullable AdImpressionData adImpressionData) {
        this.f78613C.m34932a(adImpressionData);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30251ej, com.yandex.mobile.ads.impl.om1.InterfaceC31054b
    /* renamed from: a */
    public final void mo28555a(@NotNull C30149d8<String> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        super.mo28562a((C30149d8) adResponse);
        this.f78617G.m35913a(adResponse);
        this.f78617G.m35912a(m34533f());
        InterfaceC30556ii mo29075a = this.f78616F.m34149a(adResponse).mo29075a(this);
        this.f78619I = mo29075a;
        mo29075a.mo29558a(m34526l(), adResponse);
    }

    /* renamed from: a */
    public final void m34567a(@Nullable InterfaceC31229qr interfaceC31229qr) {
        m34554a(this.f78613C);
        this.f78613C.m34926a(interfaceC31229qr);
    }
}
