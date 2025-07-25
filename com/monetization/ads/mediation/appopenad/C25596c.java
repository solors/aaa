package com.monetization.ads.mediation.appopenad;

import android.content.Context;
import com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter;
import com.monetization.ads.mediation.base.C25606a;
import com.yandex.mobile.ads.impl.wu0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.monetization.ads.mediation.appopenad.c */
/* loaded from: classes7.dex */
public final class C25596c implements wu0<MediatedAppOpenAdAdapter, MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener> {
    @Nullable

    /* renamed from: a */
    private MediatedAppOpenAdAdapter f66455a;

    @Override // com.yandex.mobile.ads.impl.wu0
    /* renamed from: a */
    public final void mo27740a(C25606a c25606a) {
        MediatedAppOpenAdAdapter mediatedAdapter = (MediatedAppOpenAdAdapter) c25606a;
        Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
        mediatedAdapter.onInvalidate();
    }

    @Override // com.yandex.mobile.ads.impl.wu0
    /* renamed from: a */
    public final void mo27741a(Context context, C25606a c25606a, Object obj, Map localExtras, Map serverExtras) {
        MediatedAppOpenAdAdapter mediatedAdapter = (MediatedAppOpenAdAdapter) c25606a;
        MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener mediatedAdapterListener = (MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
        Intrinsics.checkNotNullParameter(mediatedAdapterListener, "mediatedAdapterListener");
        Intrinsics.checkNotNullParameter(localExtras, "localExtras");
        Intrinsics.checkNotNullParameter(serverExtras, "serverExtras");
        this.f66455a = mediatedAdapter;
        mediatedAdapter.loadAppOpenAd(context, mediatedAdapterListener, localExtras, serverExtras);
    }

    @Nullable
    /* renamed from: a */
    public final MediatedAppOpenAdAdapter m44289a() {
        return this.f66455a;
    }
}
