package com.monetization.ads.mediation.banner;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37554o0;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

@Metadata
/* loaded from: classes7.dex */
public final class MediatedBannerSize {
    private final int height;
    private final int width;

    public MediatedBannerSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    @NotNull
    public final Map<String, Integer> toSizeData() {
        return C37554o0.m17363m(C38513v.m14532a("width", Integer.valueOf(this.width)), C38513v.m14532a("height", Integer.valueOf(this.height)));
    }
}
