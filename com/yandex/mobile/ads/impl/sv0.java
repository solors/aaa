package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.base.C25606a;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class sv0 implements wu0<MediatedNativeAdapter, MediatedNativeAdapterListener> {
    @Override // com.yandex.mobile.ads.impl.wu0
    /* renamed from: a */
    public final void mo27740a(C25606a c25606a) {
        MediatedNativeAdapter mediatedAdapter = (MediatedNativeAdapter) c25606a;
        Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
    }

    @Override // com.yandex.mobile.ads.impl.wu0
    /* renamed from: a */
    public final void mo27741a(Context context, C25606a c25606a, Object obj, Map localExtras, Map serverExtras) {
        MediatedNativeAdapter mediatedAdapter = (MediatedNativeAdapter) c25606a;
        MediatedNativeAdapterListener mediatedAdapterListener = (MediatedNativeAdapterListener) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
        Intrinsics.checkNotNullParameter(mediatedAdapterListener, "mediatedAdapterListener");
        Intrinsics.checkNotNullParameter(localExtras, "localExtras");
        Intrinsics.checkNotNullParameter(serverExtras, "serverExtras");
        mediatedAdapter.loadAd(context, mediatedAdapterListener, localExtras, serverExtras);
    }
}
