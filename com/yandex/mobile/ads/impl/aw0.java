package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.base.C25606a;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class aw0 implements wu0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> {
    @Nullable

    /* renamed from: a */
    private MediatedRewardedAdapter f76927a;

    @Nullable
    /* renamed from: a */
    public final MediatedRewardedAdapter m35754a() {
        return this.f76927a;
    }

    @Override // com.yandex.mobile.ads.impl.wu0
    /* renamed from: a */
    public final void mo27740a(C25606a c25606a) {
        MediatedRewardedAdapter mediatedAdapter = (MediatedRewardedAdapter) c25606a;
        Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
        mediatedAdapter.onInvalidate();
    }

    @Override // com.yandex.mobile.ads.impl.wu0
    /* renamed from: a */
    public final void mo27741a(Context context, C25606a c25606a, Object obj, Map localExtras, Map serverExtras) {
        MediatedRewardedAdapter mediatedAdapter = (MediatedRewardedAdapter) c25606a;
        MediatedRewardedAdapterListener mediatedAdapterListener = (MediatedRewardedAdapterListener) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
        Intrinsics.checkNotNullParameter(mediatedAdapterListener, "mediatedAdapterListener");
        Intrinsics.checkNotNullParameter(localExtras, "localExtras");
        Intrinsics.checkNotNullParameter(serverExtras, "serverExtras");
        this.f76927a = mediatedAdapter;
        mediatedAdapter.loadRewardedAd(context, mediatedAdapterListener, localExtras, serverExtras);
    }
}
