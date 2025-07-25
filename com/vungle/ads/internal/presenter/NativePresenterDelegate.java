package com.vungle.ads.internal.presenter;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.presenter.p */
/* loaded from: classes7.dex */
public interface NativePresenterDelegate {
    @Nullable
    List<String> getImpressionUrls();

    @Nullable
    String getPlacementRefId();
}
