package com.ironsource;

import android.app.Activity;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.ci */
/* loaded from: classes6.dex */
public interface InterfaceC19711ci {
    @NotNull
    /* renamed from: a */
    InterfaceC19864f1 mo54340a();

    /* renamed from: a */
    void mo54339a(@NotNull Activity activity, @Nullable String str);

    void loadAd();

    default void onAdInfoChanged(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }
}
