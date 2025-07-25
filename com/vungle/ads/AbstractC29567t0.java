package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.AdInternal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BaseFullscreenAd.kt */
@Metadata
/* renamed from: com.vungle.ads.t0 */
/* loaded from: classes7.dex */
public abstract class AbstractC29567t0 extends AdInternal {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC29567t0(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.vungle.ads.internal.AdInternal
    @Nullable
    public C29528j2 getAdSizeForAdRequest() {
        return null;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdSize(@Nullable C29528j2 c29528j2) {
        return true;
    }
}
