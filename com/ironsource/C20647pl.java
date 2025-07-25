package com.ironsource;

import android.app.Activity;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.pl */
/* loaded from: classes6.dex */
public final class C20647pl extends AbstractC21201x implements NativeAdListener {
    @Nullable

    /* renamed from: v */
    private AdapterNativeAdData f52434v;
    @Nullable

    /* renamed from: w */
    private AdapterNativeAdViewBinder f52435w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20647pl(@NotNull C20618p2 adTools, @NotNull C21245y instanceData, @NotNull InterfaceC19609b0 listener) {
        super(adTools, instanceData, listener);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Nullable
    /* renamed from: G */
    public final AdapterNativeAdData m55779G() {
        return this.f52434v;
    }

    @Nullable
    /* renamed from: H */
    public final AdapterNativeAdViewBinder m55778H() {
        return this.f52435w;
    }

    @Override // com.ironsource.AbstractC21201x
    /* renamed from: a */
    public void mo54262a(@NotNull InterfaceC19863f0 adInstancePresenter) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.mo55600a(this);
    }

    @Override // com.ironsource.AbstractC21201x
    /* renamed from: b */
    public void mo54247b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m54226o());
        if (m54239f() == null) {
            ironLog.warning("adapter == null");
            return;
        }
        try {
            if (m54239f() instanceof AdapterNativeAdInterface) {
                BaseAdAdapter<?, ?> m54239f = m54239f();
                Intrinsics.m17073h(m54239f, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                ((AdapterNativeAdInterface) m54239f).destroyAd(m54235h());
            } else {
                ironLog.error(m54249a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            String str = "destroyNativeAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m54249a(str));
            m54241e().m57751e().m57496g().m54567f(str);
        }
        super.mo54247b();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(@NotNull AdapterNativeAdData adapterNativeAdData, @NotNull AdapterNativeAdViewBinder nativeAdViewBinder) {
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        this.f52434v = adapterNativeAdData;
        this.f52435w = nativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    @Override // com.ironsource.AbstractC21201x
    /* renamed from: y */
    protected void mo54216y() {
        if (m54239f() instanceof AdapterNativeAdInterface) {
            AdData m54235h = m54235h();
            if (ContextProvider.getInstance().getCurrentActiveActivity() != null) {
                BaseAdAdapter<?, ?> m54239f = m54239f();
                Intrinsics.m17073h(m54239f, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
                Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
                Intrinsics.checkNotNullExpressionValue(currentActiveActivity, "getInstance().currentActiveActivity");
                ((AdapterNativeAdInterface) m54239f).loadAd(m54235h, currentActiveActivity, this);
                return;
            }
            IronLog.INTERNAL.error(m54249a("activity must not be null"));
            m54241e().m57751e().m57496g().m54567f("activity must not be null");
            return;
        }
        IronLog.INTERNAL.error(m54249a("adapter not instance of AdapterNativeAdInterface"));
    }

    /* renamed from: a */
    public final void m55777a(@NotNull C20107il nativeAdBinder) {
        Intrinsics.checkNotNullParameter(nativeAdBinder, "nativeAdBinder");
        nativeAdBinder.m57972a(this.f52434v);
        nativeAdBinder.m57971a(this.f52435w);
    }
}
