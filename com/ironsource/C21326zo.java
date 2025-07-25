package com.ironsource;

import android.app.Activity;
import com.ironsource.C19869f3;
import com.ironsource.InterfaceC19668c3;
import com.ironsource.InterfaceC20470mg;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.zo */
/* loaded from: classes6.dex */
public final class C21326zo implements InterfaceC20518nc {
    @NotNull

    /* renamed from: a */
    private C20473mi f54810a;
    @NotNull

    /* renamed from: b */
    private InterfaceC21161w0 f54811b;
    @NotNull

    /* renamed from: c */
    private InterfaceC20673q4 f54812c;
    @NotNull

    /* renamed from: d */
    private InterfaceC20128j3 f54813d;
    @NotNull

    /* renamed from: e */
    private InterfaceC19839em f54814e;
    @NotNull

    /* renamed from: f */
    private InterfaceC20169jt f54815f;
    @NotNull

    /* renamed from: g */
    private InterfaceC20470mg f54816g;
    @NotNull

    /* renamed from: h */
    private InterfaceC20470mg.InterfaceC20471a f54817h;
    @NotNull

    /* renamed from: i */
    private final Map<String, C21326zo> f54818i;
    @NotNull

    /* renamed from: j */
    private RewardedAdInfo f54819j;
    @Nullable

    /* renamed from: k */
    private InterfaceC19594ap f54820k;

    public C21326zo(@NotNull C20473mi adInstance, @NotNull InterfaceC21161w0 adNetworkShow, @NotNull InterfaceC20673q4 auctionDataReporter, @NotNull InterfaceC20128j3 analytics, @NotNull InterfaceC19839em networkDestroyAPI, @NotNull InterfaceC20169jt threadManager, @NotNull InterfaceC20470mg sessionDepthService, @NotNull InterfaceC20470mg.InterfaceC20471a sessionDepthServiceEditor, @NotNull Map<String, C21326zo> retainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adNetworkShow, "adNetworkShow");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        Intrinsics.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        Intrinsics.checkNotNullParameter(retainer, "retainer");
        this.f54810a = adInstance;
        this.f54811b = adNetworkShow;
        this.f54812c = auctionDataReporter;
        this.f54813d = analytics;
        this.f54814e = networkDestroyAPI;
        this.f54815f = threadManager;
        this.f54816g = sessionDepthService;
        this.f54817h = sessionDepthServiceEditor;
        this.f54818i = retainer;
        String m56301f = adInstance.m56301f();
        Intrinsics.checkNotNullExpressionValue(m56301f, "adInstance.instanceId");
        String m56302e = this.f54810a.m56302e();
        Intrinsics.checkNotNullExpressionValue(m56302e, "adInstance.id");
        this.f54819j = new RewardedAdInfo(m56301f, m56302e);
        C20258lc c20258lc = new C20258lc();
        this.f54810a.m56307a(c20258lc);
        c20258lc.m57494a(this);
    }

    /* renamed from: d */
    public static final void m53752d(C21326zo this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC19594ap interfaceC19594ap = this$0.f54820k;
        if (interfaceC19594ap != null) {
            interfaceC19594ap.onUserEarnedReward();
        }
    }

    /* renamed from: e */
    public static final void m53751e(C21326zo this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC19594ap interfaceC19594ap = this$0.f54820k;
        if (interfaceC19594ap != null) {
            interfaceC19594ap.onRewardedAdShown();
        }
    }

    /* renamed from: a */
    public final void m53766a() {
        InterfaceC20169jt.m57780a(this.f54815f, new Runnable() { // from class: com.ironsource.r10
            {
                C21326zo.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21326zo.m53762a(C21326zo.this);
            }
        }, 0L, 2, null);
    }

    @Nullable
    /* renamed from: c */
    public final InterfaceC19594ap m53755c() {
        return this.f54820k;
    }

    protected final void finalize() {
        m53766a();
    }

    @Override // com.ironsource.InterfaceC20518nc
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC19668c3.C19669a.f49370a.m59237f(new InterfaceC19952g3[0]).mo59236a(this.f54813d);
    }

    @Override // com.ironsource.InterfaceC20518nc
    public void onAdInstanceDidClick() {
        InterfaceC19668c3.C19669a.f49370a.m59245a().mo59236a(this.f54813d);
        this.f54815f.mo54479a(new Runnable() { // from class: com.ironsource.q10
            {
                C21326zo.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21326zo.m53757b(C21326zo.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC20518nc
    public void onAdInstanceDidDismiss() {
        this.f54818i.remove(this.f54819j.getAdId());
        InterfaceC19668c3.C19669a.f49370a.m59242a(new InterfaceC19952g3[0]).mo59236a(this.f54813d);
        this.f54815f.mo54479a(new Runnable() { // from class: com.ironsource.t10
            {
                C21326zo.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21326zo.m53754c(C21326zo.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC20518nc
    public void onAdInstanceDidReward(@Nullable String str, int i) {
        C19869f3.C19890u c19890u = new C19869f3.C19890u("Virtual Item");
        C19869f3.C19889t c19889t = new C19869f3.C19889t(1);
        C19869f3.C19886q c19886q = new C19869f3.C19886q("DefaultRewardedVideo");
        String transId = IronSourceUtils.getTransId(System.currentTimeMillis(), this.f54810a.m56300g());
        Intrinsics.checkNotNullExpressionValue(transId, "getTransId(System.curren…illis(), adInstance.name)");
        InterfaceC19668c3.C19669a.f49370a.m59240c(c19890u, c19889t, c19886q, new C19869f3.C19894y(transId)).mo59236a(this.f54813d);
        this.f54815f.mo54479a(new Runnable() { // from class: com.ironsource.v10
            {
                C21326zo.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21326zo.m53752d(C21326zo.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC20518nc
    public void onAdInstanceDidShow() {
        InterfaceC20470mg interfaceC20470mg = this.f54816g;
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        InterfaceC19668c3.C19669a.f49370a.m59241b(new C19869f3.C19892w(interfaceC20470mg.mo56312a(ad_unit))).mo59236a(this.f54813d);
        this.f54817h.mo56311b(ad_unit);
        this.f54812c.mo55688c("onAdInstanceDidShow");
        this.f54815f.mo54479a(new Runnable() { // from class: com.ironsource.s10
            {
                C21326zo.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21326zo.m53751e(C21326zo.this);
            }
        });
    }

    public /* synthetic */ C21326zo(C20473mi c20473mi, InterfaceC21161w0 interfaceC21161w0, InterfaceC20673q4 interfaceC20673q4, InterfaceC20128j3 interfaceC20128j3, InterfaceC19839em interfaceC19839em, InterfaceC20169jt interfaceC20169jt, InterfaceC20470mg interfaceC20470mg, InterfaceC20470mg.InterfaceC20471a interfaceC20471a, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c20473mi, interfaceC21161w0, interfaceC20673q4, interfaceC20128j3, (i & 16) != 0 ? new C19927fm() : interfaceC19839em, (i & 32) != 0 ? C21130ve.f54189a : interfaceC20169jt, (i & 64) != 0 ? C19821el.f49880p.m58785d().mo57093k() : interfaceC20470mg, (i & 128) != 0 ? C19821el.f49880p.m58788a().mo57487e() : interfaceC20471a, map);
    }

    /* renamed from: c */
    public static final void m53754c(C21326zo this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC19594ap interfaceC19594ap = this$0.f54820k;
        if (interfaceC19594ap != null) {
            interfaceC19594ap.onRewardedAdDismissed();
        }
    }

    /* renamed from: a */
    public final void m53765a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f54818i.put(this.f54819j.getAdId(), this);
        if (!this.f54811b.mo54209a(this.f54810a)) {
            m53763a(C20040hb.f50441a.m58170t());
            return;
        }
        InterfaceC19668c3.C19669a.f49370a.m59239d(new InterfaceC19952g3[0]).mo59236a(this.f54813d);
        this.f54811b.mo54210a(activity, this.f54810a);
    }

    @NotNull
    /* renamed from: b */
    public final RewardedAdInfo m53758b() {
        return this.f54819j;
    }

    /* renamed from: d */
    public final boolean m53753d() {
        boolean mo54209a = this.f54811b.mo54209a(this.f54810a);
        InterfaceC19668c3.C19669a.f49370a.m59243a(mo54209a).mo59236a(this.f54813d);
        return mo54209a;
    }

    /* renamed from: b */
    public static final void m53757b(C21326zo this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC19594ap interfaceC19594ap = this$0.f54820k;
        if (interfaceC19594ap != null) {
            interfaceC19594ap.onRewardedAdClicked();
        }
    }

    /* renamed from: a */
    public final void m53764a(@Nullable InterfaceC19594ap interfaceC19594ap) {
        this.f54820k = interfaceC19594ap;
    }

    /* renamed from: a */
    private final void m53763a(final IronSourceError ironSourceError) {
        this.f54818i.remove(this.f54819j.getAdId());
        InterfaceC19668c3.C19669a.f49370a.m59244a(new C19869f3.C19879j(ironSourceError.getErrorCode()), new C19869f3.C19880k(ironSourceError.getErrorMessage())).mo59236a(this.f54813d);
        this.f54815f.mo54479a(new Runnable() { // from class: com.ironsource.u10
            {
                C21326zo.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21326zo.m53761a(C21326zo.this, ironSourceError);
            }
        });
    }

    /* renamed from: a */
    public static final void m53762a(C21326zo this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC19668c3.C19676d.f49392a.m59210b().mo59236a(this$0.f54813d);
        this$0.f54814e.mo58538a(this$0.f54810a);
    }

    /* renamed from: a */
    public static final void m53761a(C21326zo this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        InterfaceC19594ap interfaceC19594ap = this$0.f54820k;
        if (interfaceC19594ap != null) {
            interfaceC19594ap.onRewardedAdFailedToShow(error);
        }
    }

    /* renamed from: a */
    public final void m53760a(@NotNull RewardedAdInfo rewardedAdInfo) {
        Intrinsics.checkNotNullParameter(rewardedAdInfo, "<set-?>");
        this.f54819j = rewardedAdInfo;
    }

    @Override // com.ironsource.InterfaceC20518nc
    /* renamed from: a */
    public void mo53759a(@Nullable String str) {
        m53763a(C20040hb.f50441a.m58189c(new IronSourceError(0, str)));
    }
}
