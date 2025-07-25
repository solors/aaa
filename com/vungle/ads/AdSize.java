package com.vungle.ads;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.vungle.ads.a0 */
/* loaded from: classes7.dex */
public enum AdSize {
    VUNGLE_MREC("mrec", 300, 250),
    BANNER("banner", 320, 50),
    BANNER_SHORT("banner_short", 300, 50),
    BANNER_LEADERBOARD("banner_leaderboard", 728, 90);
    
    private final int height;
    @NotNull
    private final String sizeName;
    private final int width;

    AdSize(String str, int i, int i2) {
        this.sizeName = str;
        this.width = i;
        this.height = i2;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final String getSizeName() {
        return this.sizeName;
    }

    public final int getWidth() {
        return this.width;
    }
}
