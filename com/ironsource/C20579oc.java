package com.ironsource;

import android.app.Activity;
import com.ironsource.C20303m1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.oc */
/* loaded from: classes6.dex */
public final class C20579oc extends AbstractC21201x implements InterstitialAdListener, AdapterAdRewardListener {
    @NotNull

    /* renamed from: v */
    private WeakReference<InterfaceC20632pc> f52308v;
    @Nullable

    /* renamed from: w */
    private C21008ta f52309w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20579oc(@NotNull C20618p2 adTools, @NotNull C21245y instanceData, @NotNull InterfaceC20632pc listener) {
        super(adTools, instanceData, listener);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f52308v = new WeakReference<>(listener);
    }

    /* renamed from: b */
    private final void m56018b(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m54249a("error = " + i + ", " + str));
        m54241e().m57751e().m57504a().m57922a(m54231j(), i, str, "");
        m54261a(C20303m1.EnumC20304a.FailedToShow);
        IronSourceError ironSourceError = new IronSourceError(i, str);
        InterfaceC20632pc interfaceC20632pc = this.f52308v.get();
        if (interfaceC20632pc != null) {
            interfaceC20632pc.mo55500a(ironSourceError, this);
        }
    }

    /* renamed from: c */
    public static final void m56016c(C20579oc this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m56030I();
    }

    /* renamed from: d */
    public static final void m56015d(C20579oc this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m56028J();
    }

    /* renamed from: e */
    public static final void m56014e(C20579oc this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m56026K();
    }

    /* renamed from: f */
    public static final void m56013f(C20579oc this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m56024L();
    }

    /* renamed from: a */
    public final void m56021a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m54249a("placementName = " + m54231j()));
        try {
            m54241e().m57751e().m57504a().m57924a(activity, m54231j());
            if (m54239f() instanceof AdapterAdFullScreenInterface) {
                BaseAdAdapter<?, ?> m54239f = m54239f();
                Intrinsics.m17073h(m54239f, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
                ((AdapterAdFullScreenInterface) m54239f).showAd(m54235h(), this);
            } else {
                ironLog.error(m54249a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
                m54241e().m57751e().m57496g().m54567f("showAd - adapter not instance of AdapterAdFullScreenInterface");
            }
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            String str = "showAd - exception = " + th.getMessage();
            IronLog.INTERNAL.error(m54249a(str));
            m54241e().m57751e().m57496g().m54567f(str);
            m56018b(C20996t1.m54863h(m54229l().m54074h()), str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        m54250a(new Runnable() { // from class: com.ironsource.my
            {
                C20579oc.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20579oc.m56020a(C20579oc.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        m54250a(new Runnable() { // from class: com.ironsource.ly
            {
                C20579oc.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20579oc.m56017b(C20579oc.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        m54250a(new Runnable() { // from class: com.ironsource.ny
            {
                C20579oc.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20579oc.m56016c(C20579oc.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowFailed(final int i, @Nullable final String str) {
        m54250a(new Runnable() { // from class: com.ironsource.ky
            {
                C20579oc.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20579oc.m56019a(C20579oc.this, i, str);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowSuccess() {
        m54250a(new Runnable() { // from class: com.ironsource.iy
            {
                C20579oc.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20579oc.m56015d(C20579oc.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        m54250a(new Runnable() { // from class: com.ironsource.jy
            {
                C20579oc.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20579oc.m56014e(C20579oc.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        m54250a(new Runnable() { // from class: com.ironsource.oy
            {
                C20579oc.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20579oc.m56013f(C20579oc.this);
            }
        });
    }

    @Override // com.ironsource.AbstractC21201x
    /* renamed from: y */
    protected void mo54216y() {
        if (m54239f() instanceof AdapterAdFullScreenInterface) {
            BaseAdAdapter<?, ?> m54239f = m54239f();
            Intrinsics.m17073h(m54239f, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
            ((AdapterAdFullScreenInterface) m54239f).loadAd(m54229l().m54075g(), ContextProvider.getInstance().getCurrentActiveActivity(), this);
            return;
        }
        IronLog.INTERNAL.error(m54249a("adapter not instance of AdapterAdFullScreenInterface"));
    }

    /* renamed from: G */
    private final void m56034G() {
        this.f52309w = new C21008ta();
        IronLog.INTERNAL.verbose(AbstractC21201x.m54253a(this, (String) null, 1, (Object) null));
        m54241e().m57751e().m57504a().m57921a(m54231j(), "");
        InterfaceC20632pc interfaceC20632pc = this.f52308v.get();
        if (interfaceC20632pc != null) {
            interfaceC20632pc.mo55497c(this);
        }
    }

    /* renamed from: H */
    private final void m56032H() {
        IronLog.INTERNAL.verbose(AbstractC21201x.m54253a(this, (String) null, 1, (Object) null));
        m54241e().m57751e().m57504a().m57914d(m54231j());
    }

    /* renamed from: I */
    private final void m56030I() {
        if (m54233i() == null) {
            IronLog.INTERNAL.verbose(m54249a("placement is null "));
            m54241e().m57751e().m57496g().m54567f("mCurrentPlacement is null");
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m54249a("placement name = " + m54231j()));
        HashMap hashMap = new HashMap();
        Map<String, String> m55871l = m54241e().m55871l();
        if (m55871l != null) {
            for (String str : m55871l.keySet()) {
                hashMap.put("custom_" + str, m55871l.get(str));
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        String m55879a = m54241e().m55879a(currentTimeMillis, m54227n());
        long m54805a = C21008ta.m54805a(this.f52309w);
        C20125j0 m57504a = m54241e().m57751e().m57504a();
        String m54231j = m54231j();
        Placement m54233i = m54233i();
        String rewardName = m54233i != null ? m54233i.getRewardName() : null;
        Placement m54233i2 = m54233i();
        m57504a.m57920a(m54231j, rewardName, m54233i2 != null ? m54233i2.getRewardAmount() : 0, currentTimeMillis, m55879a, m54805a, hashMap, m54241e().m55872k());
        InterfaceC20632pc interfaceC20632pc = this.f52308v.get();
        if (interfaceC20632pc != null) {
            interfaceC20632pc.mo55499a(this);
        }
    }

    /* renamed from: J */
    private final void m56028J() {
        IronLog.INTERNAL.verbose(AbstractC21201x.m54253a(this, (String) null, 1, (Object) null));
        m54241e().m57751e().m57504a().m57906l(m54231j());
        InterfaceC20632pc interfaceC20632pc = this.f52308v.get();
        if (interfaceC20632pc != null) {
            interfaceC20632pc.mo55498b(this);
        }
    }

    /* renamed from: K */
    private final void m56026K() {
        IronLog.INTERNAL.verbose(AbstractC21201x.m54253a(this, (String) null, 1, (Object) null));
        m54241e().m57751e().m57504a().m57909i(m54231j());
    }

    /* renamed from: L */
    private final void m56024L() {
        IronLog.INTERNAL.verbose(AbstractC21201x.m54253a(this, (String) null, 1, (Object) null));
        m54241e().m57751e().m57504a().m57907k(m54231j());
    }

    /* renamed from: b */
    public static final void m56017b(C20579oc this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m56032H();
    }

    @Override // com.ironsource.AbstractC21201x
    /* renamed from: a */
    public void mo54262a(@NotNull InterfaceC19863f0 adInstancePresenter) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.mo55655a(this);
    }

    /* renamed from: a */
    public static final void m56020a(C20579oc this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m56034G();
    }

    /* renamed from: a */
    public static final void m56019a(C20579oc this$0, int i, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m56018b(i, str);
    }
}
