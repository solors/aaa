package com.pubmatic.sdk.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.device.ads.DtbConstants;

/* loaded from: classes7.dex */
public class POBAdSize {

    /* renamed from: a */
    private int f70006a;

    /* renamed from: b */
    private int f70007b;
    public static final POBAdSize BANNER_SIZE_320x50 = new POBAdSize(320, 50);
    public static final POBAdSize BANNER_SIZE_320x100 = new POBAdSize(320, 100);
    public static final POBAdSize BANNER_SIZE_300x250 = new POBAdSize(300, 250);
    public static final POBAdSize BANNER_SIZE_300x300 = new POBAdSize(300, 300);
    public static final POBAdSize BANNER_SIZE_250x250 = new POBAdSize(250, 250);
    public static final POBAdSize BANNER_SIZE_468x60 = new POBAdSize(468, 60);
    public static final POBAdSize BANNER_SIZE_728x90 = new POBAdSize(728, 90);
    public static final POBAdSize BANNER_SIZE_120x600 = new POBAdSize(120, 600);
    public static final POBAdSize INTERSTITIAL_320x480 = new POBAdSize(320, DtbConstants.DEFAULT_PLAYER_HEIGHT);
    public static final POBAdSize INTERSTITIAL_480x320 = new POBAdSize(DtbConstants.DEFAULT_PLAYER_HEIGHT, 320);
    public static final POBAdSize INTERSTITIAL_768x1024 = new POBAdSize(768, 1024);
    public static final POBAdSize INTERSTITIAL_1024x768 = new POBAdSize(1024, 768);

    public POBAdSize(int i, int i2) {
        this();
        this.f70006a = i;
        this.f70007b = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof POBAdSize)) {
            return false;
        }
        POBAdSize pOBAdSize = (POBAdSize) obj;
        if (this.f70006a == pOBAdSize.f70006a && this.f70007b == pOBAdSize.f70007b) {
            return true;
        }
        return false;
    }

    public int getAdHeight() {
        return this.f70007b;
    }

    public int getAdWidth() {
        return this.f70006a;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean isMREC() {
        if (!equals(BANNER_SIZE_300x250) && !equals(BANNER_SIZE_300x300) && !equals(BANNER_SIZE_250x250)) {
            return false;
        }
        return true;
    }

    @NonNull
    public String toString() {
        return this.f70006a + "x" + this.f70007b;
    }

    private POBAdSize() {
    }
}
