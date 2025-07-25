package com.ironsource;

import android.app.Activity;
import com.ironsource.C19869f3;
import com.ironsource.InterfaceC19668c3;
import com.ironsource.InterfaceC20470mg;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.ph */
/* loaded from: classes6.dex */
public final class C20639ph implements InterfaceC20518nc {
    @NotNull

    /* renamed from: a */
    private C20473mi f52408a;
    @NotNull

    /* renamed from: b */
    private InterfaceC21161w0 f52409b;
    @NotNull

    /* renamed from: c */
    private InterfaceC20673q4 f52410c;
    @NotNull

    /* renamed from: d */
    private InterfaceC20128j3 f52411d;
    @NotNull

    /* renamed from: e */
    private InterfaceC19839em f52412e;
    @NotNull

    /* renamed from: f */
    private InterfaceC20169jt f52413f;
    @NotNull

    /* renamed from: g */
    private InterfaceC20470mg f52414g;
    @NotNull

    /* renamed from: h */
    private InterfaceC20470mg.InterfaceC20471a f52415h;
    @NotNull

    /* renamed from: i */
    private final Map<String, C20639ph> f52416i;
    @NotNull

    /* renamed from: j */
    private InterstitialAdInfo f52417j;
    @Nullable

    /* renamed from: k */
    private InterfaceC20695qh f52418k;

    public C20639ph(@NotNull C20473mi adInstance, @NotNull InterfaceC21161w0 adNetworkShow, @NotNull InterfaceC20673q4 auctionDataReporter, @NotNull InterfaceC20128j3 analytics, @NotNull InterfaceC19839em networkDestroyAPI, @NotNull InterfaceC20169jt threadManager, @NotNull InterfaceC20470mg sessionDepthService, @NotNull InterfaceC20470mg.InterfaceC20471a sessionDepthServiceEditor, @NotNull Map<String, C20639ph> retainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adNetworkShow, "adNetworkShow");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        Intrinsics.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        Intrinsics.checkNotNullParameter(retainer, "retainer");
        this.f52408a = adInstance;
        this.f52409b = adNetworkShow;
        this.f52410c = auctionDataReporter;
        this.f52411d = analytics;
        this.f52412e = networkDestroyAPI;
        this.f52413f = threadManager;
        this.f52414g = sessionDepthService;
        this.f52415h = sessionDepthServiceEditor;
        this.f52416i = retainer;
        String m56301f = adInstance.m56301f();
        Intrinsics.checkNotNullExpressionValue(m56301f, "adInstance.instanceId");
        String m56302e = this.f52408a.m56302e();
        Intrinsics.checkNotNullExpressionValue(m56302e, "adInstance.id");
        this.f52417j = new InterstitialAdInfo(m56301f, m56302e);
        C20258lc c20258lc = new C20258lc();
        this.f52408a.m56307a(c20258lc);
        c20258lc.m57494a(this);
    }

    /* renamed from: d */
    public static final void m55809d(C20639ph this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC20695qh interfaceC20695qh = this$0.f52418k;
        if (interfaceC20695qh != null) {
            interfaceC20695qh.onAdInstanceDidShow();
        }
    }

    /* renamed from: a */
    public final void m55821a() {
        InterfaceC20169jt.m57780a(this.f52413f, new Runnable() { // from class: com.ironsource.dz
            {
                C20639ph.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20639ph.m55818a(C20639ph.this);
            }
        }, 0L, 2, null);
    }

    @NotNull
    /* renamed from: b */
    public final InterstitialAdInfo m55814b() {
        return this.f52417j;
    }

    @Nullable
    /* renamed from: c */
    public final InterfaceC20695qh m55812c() {
        return this.f52418k;
    }

    protected final void finalize() {
        m55821a();
    }

    @Override // com.ironsource.InterfaceC20518nc
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC19668c3.C19669a.f49370a.m59237f(new InterfaceC19952g3[0]).mo59236a(this.f52411d);
    }

    @Override // com.ironsource.InterfaceC20518nc
    public void onAdInstanceDidClick() {
        InterfaceC19668c3.C19669a.f49370a.m59245a().mo59236a(this.f52411d);
        this.f52413f.mo54479a(new Runnable() { // from class: com.ironsource.ez
            {
                C20639ph.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20639ph.m55813b(C20639ph.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC20518nc
    public void onAdInstanceDidDismiss() {
        this.f52416i.remove(this.f52417j.getAdId());
        InterfaceC19668c3.C19669a.f49370a.m59242a(new InterfaceC19952g3[0]).mo59236a(this.f52411d);
        this.f52413f.mo54479a(new Runnable() { // from class: com.ironsource.cz
            {
                C20639ph.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20639ph.m55811c(C20639ph.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC20518nc
    public void onAdInstanceDidShow() {
        InterfaceC20470mg interfaceC20470mg = this.f52414g;
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        InterfaceC19668c3.C19669a.f49370a.m59241b(new C19869f3.C19892w(interfaceC20470mg.mo56312a(ad_unit))).mo59236a(this.f52411d);
        this.f52415h.mo56311b(ad_unit);
        this.f52410c.mo55688c("onAdInstanceDidShow");
        this.f52413f.mo54479a(new Runnable() { // from class: com.ironsource.bz
            {
                C20639ph.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20639ph.m55809d(C20639ph.this);
            }
        });
    }

    public /* synthetic */ C20639ph(C20473mi c20473mi, InterfaceC21161w0 interfaceC21161w0, InterfaceC20673q4 interfaceC20673q4, InterfaceC20128j3 interfaceC20128j3, InterfaceC19839em interfaceC19839em, InterfaceC20169jt interfaceC20169jt, InterfaceC20470mg interfaceC20470mg, InterfaceC20470mg.InterfaceC20471a interfaceC20471a, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c20473mi, interfaceC21161w0, interfaceC20673q4, interfaceC20128j3, (i & 16) != 0 ? new C19927fm() : interfaceC19839em, (i & 32) != 0 ? C21130ve.f54189a : interfaceC20169jt, (i & 64) != 0 ? C19821el.f49880p.m58785d().mo57093k() : interfaceC20470mg, (i & 128) != 0 ? C19821el.f49880p.m58788a().mo57487e() : interfaceC20471a, map);
    }

    /* renamed from: b */
    public static final void m55813b(C20639ph this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC20695qh interfaceC20695qh = this$0.f52418k;
        if (interfaceC20695qh != null) {
            interfaceC20695qh.onAdInstanceDidClick();
        }
    }

    /* renamed from: c */
    public static final void m55811c(C20639ph this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC20695qh interfaceC20695qh = this$0.f52418k;
        if (interfaceC20695qh != null) {
            interfaceC20695qh.onAdInstanceDidDismiss();
        }
    }

    /* renamed from: a */
    public final void m55820a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f52416i.put(this.f52417j.getAdId(), this);
        if (!this.f52409b.mo54209a(this.f52408a)) {
            m55819a(C20040hb.f50441a.m58170t());
            return;
        }
        InterfaceC19668c3.C19669a.f49370a.m59239d(new InterfaceC19952g3[0]).mo59236a(this.f52411d);
        this.f52409b.mo54210a(activity, this.f52408a);
    }

    /* renamed from: d */
    public final boolean m55810d() {
        boolean mo54209a = this.f52409b.mo54209a(this.f52408a);
        InterfaceC19668c3.C19669a.f49370a.m59243a(mo54209a).mo59236a(this.f52411d);
        return mo54209a;
    }

    /* renamed from: a */
    private final void m55819a(final IronSourceError ironSourceError) {
        this.f52416i.remove(this.f52417j.getAdId());
        InterfaceC19668c3.C19669a.f49370a.m59244a(new C19869f3.C19879j(ironSourceError.getErrorCode()), new C19869f3.C19880k(ironSourceError.getErrorMessage())).mo59236a(this.f52411d);
        this.f52413f.mo54479a(new Runnable() { // from class: com.ironsource.fz
            {
                C20639ph.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20639ph.m55817a(C20639ph.this, ironSourceError);
            }
        });
    }

    /* renamed from: a */
    public static final void m55818a(C20639ph this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC19668c3.C19676d.f49392a.m59210b().mo59236a(this$0.f52411d);
        this$0.f52412e.mo58538a(this$0.f52408a);
    }

    /* renamed from: a */
    public static final void m55817a(C20639ph this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        InterfaceC20695qh interfaceC20695qh = this$0.f52418k;
        if (interfaceC20695qh != null) {
            interfaceC20695qh.onAdInstanceDidFailedToShow(error);
        }
    }

    /* renamed from: a */
    public final void m55816a(@Nullable InterfaceC20695qh interfaceC20695qh) {
        this.f52418k = interfaceC20695qh;
    }

    /* renamed from: a */
    public final void m55815a(@NotNull InterstitialAdInfo interstitialAdInfo) {
        Intrinsics.checkNotNullParameter(interstitialAdInfo, "<set-?>");
        this.f52417j = interstitialAdInfo;
    }

    @Override // com.ironsource.InterfaceC20518nc
    /* renamed from: a */
    public void mo53759a(@Nullable String str) {
        m55819a(C20040hb.f50441a.m58189c(new IronSourceError(0, str)));
    }

    @Override // com.ironsource.InterfaceC20518nc
    public void onAdInstanceDidReward(@Nullable String str, int i) {
    }
}
