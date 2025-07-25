package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.lc */
/* loaded from: classes6.dex */
public final class C20258lc implements InterfaceC19780dn {
    @Nullable

    /* renamed from: a */
    private InterfaceC20337mc f50988a;
    @NotNull

    /* renamed from: b */
    private WeakReference<InterfaceC20518nc> f50989b = new WeakReference<>(null);

    @Metadata
    /* renamed from: com.ironsource.lc$a */
    /* loaded from: classes6.dex */
    public static final class C20259a {
        @NotNull

        /* renamed from: a */
        public static final C20259a f50990a = new C20259a();
        @NotNull

        /* renamed from: b */
        public static final String f50991b = "impressions";

        private C20259a() {
        }
    }

    /* renamed from: a */
    public final void m57495a(@NotNull InterfaceC20337mc loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        this.f50988a = loadListener;
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialAdRewarded(@Nullable String str, int i) {
        InterfaceC20518nc interfaceC20518nc = this.f50989b.get();
        if (interfaceC20518nc != null) {
            interfaceC20518nc.onAdInstanceDidReward(str, i);
        }
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialClick() {
        InterfaceC20518nc interfaceC20518nc = this.f50989b.get();
        if (interfaceC20518nc != null) {
            interfaceC20518nc.onAdInstanceDidClick();
        }
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialClose() {
        InterfaceC20518nc interfaceC20518nc = this.f50989b.get();
        if (interfaceC20518nc != null) {
            interfaceC20518nc.onAdInstanceDidDismiss();
        }
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialEventNotificationReceived(@Nullable String str, @Nullable JSONObject jSONObject) {
        InterfaceC20518nc interfaceC20518nc;
        if (Intrinsics.m17075f(str, "impressions") && (interfaceC20518nc = this.f50989b.get()) != null) {
            interfaceC20518nc.onAdInstanceDidBecomeVisible();
        }
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialLoadFailed(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        InterfaceC20337mc interfaceC20337mc = this.f50988a;
        if (interfaceC20337mc != null) {
            interfaceC20337mc.mo55483a(description);
        }
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialLoadSuccess(@NotNull C20473mi adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        InterfaceC20337mc interfaceC20337mc = this.f50988a;
        if (interfaceC20337mc != null) {
            interfaceC20337mc.mo55486a(adInstance);
        }
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialOpen() {
        InterfaceC20518nc interfaceC20518nc = this.f50989b.get();
        if (interfaceC20518nc != null) {
            interfaceC20518nc.onAdInstanceDidShow();
        }
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialShowFailed(@Nullable String str) {
        InterfaceC20518nc interfaceC20518nc = this.f50989b.get();
        if (interfaceC20518nc != null) {
            interfaceC20518nc.mo53759a(str);
        }
    }

    /* renamed from: a */
    public final void m57494a(@NotNull InterfaceC20518nc showListener) {
        Intrinsics.checkNotNullParameter(showListener, "showListener");
        this.f50989b = new WeakReference<>(showListener);
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialShowSuccess() {
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialInitFailed(@Nullable String str) {
    }
}
