package com.vungle.ads;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.a */
/* loaded from: classes7.dex */
public interface BaseAd {
    @Nullable
    Boolean canPlayAd();

    void load(@Nullable String str);
}
