package com.monetization.ads.mediation.interstitial;

import android.content.Context;
import com.monetization.ads.mediation.base.C25606a;
import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;
import com.yandex.mobile.ads.impl.wu0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.monetization.ads.mediation.interstitial.b */
/* loaded from: classes7.dex */
public final class C25608b implements wu0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> {
    @Nullable

    /* renamed from: a */
    private MediatedInterstitialAdapter f66497a;

    @Override // com.yandex.mobile.ads.impl.wu0
    /* renamed from: a */
    public final void mo27740a(C25606a c25606a) {
        MediatedInterstitialAdapter mediatedAdapter = (MediatedInterstitialAdapter) c25606a;
        Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
        mediatedAdapter.onInvalidate();
    }

    @Override // com.yandex.mobile.ads.impl.wu0
    /* renamed from: a */
    public final void mo27741a(Context context, C25606a c25606a, Object obj, Map localExtras, Map serverExtras) {
        MediatedInterstitialAdapter mediatedAdapter = (MediatedInterstitialAdapter) c25606a;
        MediatedInterstitialAdapter.MediatedInterstitialAdapterListener mediatedAdapterListener = (MediatedInterstitialAdapter.MediatedInterstitialAdapterListener) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
        Intrinsics.checkNotNullParameter(mediatedAdapterListener, "mediatedAdapterListener");
        Intrinsics.checkNotNullParameter(localExtras, "localExtras");
        Intrinsics.checkNotNullParameter(serverExtras, "serverExtras");
        this.f66497a = mediatedAdapter;
        mediatedAdapter.loadInterstitial(context, mediatedAdapterListener, localExtras, serverExtras);
    }

    @Nullable
    /* renamed from: a */
    public final MediatedInterstitialAdapter m44274a() {
        return this.f66497a;
    }
}
