package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.model.C29338j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: InterstitialAd.kt */
@Metadata
/* renamed from: com.vungle.ads.y0 */
/* loaded from: classes7.dex */
public final class C29579y0 extends AbstractC29567t0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29579y0(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdTypeForPlacement(@NotNull C29338j placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        if (!placement.isInterstitial() && !placement.isAppOpen()) {
            return false;
        }
        return true;
    }
}
