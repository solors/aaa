package com.monetization.ads.mediation.base;

import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.yandex.mobile.ads.impl.xu0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.monetization.ads.mediation.base.a */
/* loaded from: classes7.dex */
public class C25606a {
    @Nullable
    public xu0 getAdObject() {
        return null;
    }

    @NotNull
    public MediatedAdapterInfo getAdapterInfo() {
        return new MediatedAdapterInfo.Builder().build();
    }

    public boolean getShouldTrackImpressionAutomatically() {
        return true;
    }
}
