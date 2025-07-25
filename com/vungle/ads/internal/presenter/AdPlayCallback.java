package com.vungle.ads.internal.presenter;

import com.vungle.ads.AbstractC29537l2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.presenter.b */
/* loaded from: classes7.dex */
public interface AdPlayCallback {
    void onAdClick(@Nullable String str);

    void onAdEnd(@Nullable String str);

    void onAdImpression(@Nullable String str);

    void onAdLeftApplication(@Nullable String str);

    void onAdRewarded(@Nullable String str);

    void onAdStart(@Nullable String str);

    void onFailure(@NotNull AbstractC29537l2 abstractC29537l2);
}
