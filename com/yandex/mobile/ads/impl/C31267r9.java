package com.yandex.mobile.ads.impl;

import com.monetization.ads.base.model.AdUnitIdBiddingSettings;
import com.monetization.ads.base.model.BiddingSettings;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.r9 */
/* loaded from: classes8.dex */
public final class C31267r9 {
    @NotNull

    /* renamed from: a */
    private final BiddingSettings f84680a;

    public C31267r9(@NotNull BiddingSettings biddingSettings) {
        Intrinsics.checkNotNullParameter(biddingSettings, "biddingSettings");
        this.f84680a = biddingSettings;
    }

    @Nullable
    /* renamed from: a */
    public final AdUnitIdBiddingSettings m30115a(@Nullable String str) {
        Object obj;
        Iterator<T> it = this.f84680a.m44562c().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.m17075f(((AdUnitIdBiddingSettings) obj).m44564e(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (AdUnitIdBiddingSettings) obj;
    }
}
