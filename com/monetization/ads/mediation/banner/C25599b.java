package com.monetization.ads.mediation.banner;

import android.content.Context;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;
import com.monetization.ads.mediation.base.C25606a;
import com.yandex.mobile.ads.impl.wu0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.monetization.ads.mediation.banner.b */
/* loaded from: classes7.dex */
public final class C25599b implements wu0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> {
    @Override // com.yandex.mobile.ads.impl.wu0
    /* renamed from: a */
    public final void mo27740a(C25606a c25606a) {
        MediatedBannerAdapter mediatedAdapter = (MediatedBannerAdapter) c25606a;
        Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
        mediatedAdapter.onInvalidate();
    }

    @Override // com.yandex.mobile.ads.impl.wu0
    /* renamed from: a */
    public final void mo27741a(Context context, C25606a c25606a, Object obj, Map localExtras, Map serverExtras) {
        MediatedBannerAdapter mediatedAdapter = (MediatedBannerAdapter) c25606a;
        MediatedBannerAdapter.MediatedBannerAdapterListener mediatedAdapterListener = (MediatedBannerAdapter.MediatedBannerAdapterListener) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
        Intrinsics.checkNotNullParameter(mediatedAdapterListener, "mediatedAdapterListener");
        Intrinsics.checkNotNullParameter(localExtras, "localExtras");
        Intrinsics.checkNotNullParameter(serverExtras, "serverExtras");
        mediatedAdapter.loadBanner(context, mediatedAdapterListener, localExtras, serverExtras);
    }
}
