package com.unity3d.ads.core.domain.scar;

import com.unity3d.ads.core.data.manager.ScarManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.C42688d;

/* compiled from: LoadScarAd.kt */
@Metadata
/* loaded from: classes7.dex */
public final class LoadScarAd {
    @NotNull
    private final ScarManager scarManager;

    public LoadScarAd(@NotNull ScarManager scarManager) {
        Intrinsics.checkNotNullParameter(scarManager, "scarManager");
        this.scarManager = scarManager;
    }

    @Nullable
    public final Object invoke(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        if (Intrinsics.m17075f(str, "banner")) {
            return Unit.f99208a;
        }
        Object loadAd = this.scarManager.loadAd(str, str2, str4, str3, str5, i, continuation);
        m6959e = C42688d.m6959e();
        if (loadAd == m6959e) {
            return loadAd;
        }
        return Unit.f99208a;
    }
}
