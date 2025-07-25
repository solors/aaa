package com.ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.q5 */
/* loaded from: classes6.dex */
public final class C20674q5 extends AbstractC21201x implements BannerAdListener {
    @NotNull

    /* renamed from: v */
    private WeakReference<InterfaceC20790s5> f52507v;
    @Nullable

    /* renamed from: w */
    private View f52508w;
    @Nullable

    /* renamed from: x */
    private FrameLayout.LayoutParams f52509x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20674q5(@NotNull C20618p2 adTools, @NotNull C21245y instanceData, @NotNull InterfaceC20790s5 listener) {
        super(adTools, instanceData, listener);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f52507v = new WeakReference<>(listener);
    }

    /* renamed from: c */
    public static final void m55671c(C20674q5 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m55683I();
    }

    /* renamed from: e */
    public static final void m55669e(C20674q5 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C20125j0 m57504a = this$0.m54241e().m57751e().m57504a();
        Placement m54233i = this$0.m54233i();
        m57504a.m57908j((m54233i == null || (r1 = m54233i.getPlacementName()) == null) ? "" : "");
    }

    /* renamed from: a */
    public final void m55676a(@NotNull final InterfaceC19789du viewBinder) {
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        C20593ok.m55968a(m54241e(), new Runnable() { // from class: com.ironsource.vz
            {
                C20674q5.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20674q5.m55673a(C20674q5.this, viewBinder);
            }
        }, 0L, 2, (Object) null);
    }

    @Override // com.ironsource.AbstractC21201x
    /* renamed from: b */
    public void mo54247b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m54226o());
        C20593ok.m55968a(m54241e(), new Runnable() { // from class: com.ironsource.tz
            {
                C20674q5.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20674q5.m55675a(C20674q5.this);
            }
        }, 0L, 2, (Object) null);
        if (m54239f() == null) {
            ironLog.warning("adapter == null");
            return;
        }
        try {
            if (m54239f() instanceof AdapterBannerInterface) {
                BaseAdAdapter<?, ?> m54239f = m54239f();
                Intrinsics.m17073h(m54239f, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<*>");
                ((AdapterBannerInterface) m54239f).destroyAd(m54235h());
            } else {
                ironLog.error(m54249a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            String str = "destroyBanner - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m54249a(str));
            m54241e().m57751e().m57496g().m54567f(str);
        }
        super.mo54247b();
    }

    @Override // com.ironsource.AbstractC21201x
    @NotNull
    /* renamed from: d */
    public LevelPlayAdInfo mo54243d() {
        String m59387b = m54229l().m54073i().mo53957b().m59387b();
        String ad_unit = m54229l().m54074h().toString();
        Intrinsics.checkNotNullExpressionValue(ad_unit, "instanceData.adFormat.toString()");
        ImpressionData m58654a = m54229l().m54068n().m58654a(m54231j());
        AbstractC20785s1 m54073i = m54229l().m54073i();
        Intrinsics.m17073h(m54073i, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return new LevelPlayAdInfo(m59387b, ad_unit, m58654a, ((C19898f6) m54073i).mo53957b().m59191g());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        m54250a(new Runnable() { // from class: com.ironsource.wz
            {
                C20674q5.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20674q5.m55672b(C20674q5.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(@NotNull final View adView, @NotNull final FrameLayout.LayoutParams frameLayoutParams) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(frameLayoutParams, "frameLayoutParams");
        C20593ok.m55968a(m54241e(), new Runnable() { // from class: com.ironsource.sz
            {
                C20674q5.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20674q5.m55674a(C20674q5.this, adView, frameLayoutParams);
            }
        }, 0L, 2, (Object) null);
        super.onAdLoadSuccess();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        m54250a(new Runnable() { // from class: com.ironsource.uz
            {
                C20674q5.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20674q5.m55671c(C20674q5.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        m54250a(new Runnable() { // from class: com.ironsource.yz
            {
                C20674q5.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20674q5.m55670d(C20674q5.this);
            }
        });
    }

    @Override // com.ironsource.AbstractC21201x
    /* renamed from: y */
    protected void mo54216y() {
        if (m54239f() instanceof AdapterBannerInterface) {
            AdData m54235h = m54235h();
            ISBannerSize m55687G = m55687G();
            Map<String, Object> adUnitData = m54235h.getAdUnitData();
            Intrinsics.checkNotNullExpressionValue(adUnitData, "adData.adUnitData");
            adUnitData.put("bannerLayout", new IronSourceBannerLayout(ContextProvider.getInstance().getCurrentActiveActivity(), m55687G));
            BaseAdAdapter<?, ?> m54239f = m54239f();
            Intrinsics.m17073h(m54239f, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
            ((AdapterBannerInterface) m54239f).loadAd(m54235h, ContextProvider.getInstance().getCurrentActiveActivity(), m55687G, this);
            return;
        }
        IronLog.INTERNAL.error(m54249a("adapter not instance of AdapterBannerInterface"));
    }

    /* renamed from: G */
    private final ISBannerSize m55687G() {
        C20618p2 m54241e = m54241e();
        AbstractC20785s1 m54073i = m54229l().m54073i();
        Intrinsics.m17073h(m54073i, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return m54241e.m57761a(((C19898f6) m54073i).mo53957b().m59191g());
    }

    /* renamed from: H */
    private final void m55685H() {
        Placement m54233i = m54233i();
        if (m54233i != null) {
            m54241e().m57751e().m57504a().m57912f(m54233i.getPlacementName());
        }
        InterfaceC20790s5 interfaceC20790s5 = this.f52507v.get();
        if (interfaceC20790s5 != null) {
            interfaceC20790s5.mo55388a(this);
        }
    }

    /* renamed from: I */
    private final void m55683I() {
        Placement m54233i = m54233i();
        if (m54233i != null) {
            m54241e().m57751e().m57504a().m57915c(m54233i.getPlacementName());
        }
        InterfaceC20790s5 interfaceC20790s5 = this.f52507v.get();
        if (interfaceC20790s5 != null) {
            interfaceC20790s5.mo55387b(this);
        }
    }

    /* renamed from: J */
    private final void m55681J() {
        Placement m54233i = m54233i();
        if (m54233i != null) {
            m54241e().m57751e().m57504a().m57910h(m54233i.getPlacementName());
        }
        InterfaceC20790s5 interfaceC20790s5 = this.f52507v.get();
        if (interfaceC20790s5 != null) {
            interfaceC20790s5.mo55386c(this);
        }
    }

    /* renamed from: b */
    public static final void m55672b(C20674q5 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m55685H();
    }

    /* renamed from: d */
    public static final void m55670d(C20674q5 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m55681J();
    }

    @Override // com.ironsource.AbstractC21201x
    /* renamed from: a */
    public void mo54262a(@NotNull InterfaceC19863f0 adInstancePresenter) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.mo54694a(this);
    }

    /* renamed from: a */
    public static final void m55675a(C20674q5 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f52508w = null;
        this$0.f52509x = null;
    }

    /* renamed from: a */
    public static final void m55674a(C20674q5 this$0, View adView, FrameLayout.LayoutParams frameLayoutParams) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adView, "$adView");
        Intrinsics.checkNotNullParameter(frameLayoutParams, "$frameLayoutParams");
        this$0.f52508w = adView;
        this$0.f52509x = frameLayoutParams;
    }

    /* renamed from: a */
    public static final void m55673a(C20674q5 this$0, InterfaceC19789du viewBinder) {
        FrameLayout.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewBinder, "$viewBinder");
        View view = this$0.f52508w;
        if (view == null || (layoutParams = this$0.f52509x) == null) {
            return;
        }
        viewBinder.mo55866a(view, layoutParams);
        IronLog.INTERNAL.verbose(C20179k1.m57762a(this$0.m54241e(), "Bind banner view", (String) null, 2, (Object) null));
        this$0.m54241e().m55952d(new Runnable() { // from class: com.ironsource.xz
            {
                C20674q5.this = this$0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20674q5.m55669e(C20674q5.this);
            }
        });
    }
}
