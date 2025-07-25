package com.smaato.sdk.core.p568ad;

import com.amazon.device.ads.DtbConstants;

/* renamed from: com.smaato.sdk.core.ad.AdDimension */
/* loaded from: classes7.dex */
public enum AdDimension {
    XX_LARGE(320, 50),
    X_LARGE(300, 50),
    LARGE(216, 36),
    MEDIUM(168, 28),
    SMALL(120, 20),
    MEDIUM_RECTANGLE(300, 250),
    SKYSCRAPER(120, 600),
    LEADERBOARD(728, 90),
    FULLSCREEN_PORTRAIT(320, DtbConstants.DEFAULT_PLAYER_HEIGHT),
    FULLSCREEN_LANDSCAPE(DtbConstants.DEFAULT_PLAYER_HEIGHT, 320),
    FULLSCREEN_PORTRAIT_TABLET(768, 1024),
    FULLSCREEN_LANDSCAPE_TABLET(1024, 768);
    
    private final float aspectRatio;
    private final int height;
    private final int width;

    AdDimension(int i, int i2) {
        this.width = i;
        this.height = i2;
        this.aspectRatio = i / i2;
    }

    public float getAspectRatio() {
        return this.aspectRatio;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}
