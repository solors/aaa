package com.amazon.device.ads;

import com.ironsource.C21114v8;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DTBAdSize {
    public static final String AAX_INTERSTITIAL_AD_SIZE = "interstitial";
    private final AdType adType;
    private final int height;
    private JSONObject pubSettings;
    private final String slotUUID;
    private final int width;

    /* loaded from: classes2.dex */
    public static final class DTBInterstitialAdSize extends DTBAdSize {
        public DTBInterstitialAdSize(String str) {
            super(9999, 9999, AdType.INTERSTITIAL, str, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class DTBVideo extends DTBAdSize {
        public DTBVideo(int i, int i2, String str) {
            super(i, i2, AdType.VIDEO, str, null);
        }

        public DTBVideo(int i, int i2, String str, JSONObject jSONObject) {
            super(i, i2, AdType.VIDEO, str, jSONObject);
        }
    }

    public DTBAdSize(int i, int i2, String str) {
        this(i, i2, AdType.DISPLAY, str, null);
        if (i == 9999 || i2 == 9999) {
            throw new IllegalArgumentException("Invalid size passed, Please use DTBInterstitialAdSize for interstitial ads.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DTBAdSize dTBAdSize = (DTBAdSize) obj;
        if (this.height == dTBAdSize.height && this.width == dTBAdSize.width) {
            return true;
        }
        return false;
    }

    public AdType getDTBAdType() {
        return this.adType;
    }

    public int getHeight() {
        return this.height;
    }

    public JSONObject getPubSettings() {
        return this.pubSettings;
    }

    public String getSlotUUID() {
        return this.slotUUID;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return ((this.height + 31) * 31) + this.width;
    }

    public boolean isInterstitialAd() {
        return this.adType.equals(AdType.INTERSTITIAL);
    }

    public void setPubSettings(JSONObject jSONObject) {
        this.pubSettings = jSONObject;
    }

    public String toString() {
        return "DTBAdSize [" + this.width + "x" + this.height + ", adType=" + this.adType + ", slotUUID=" + this.slotUUID + C21114v8.C21123i.f54139e;
    }

    protected DTBAdSize(int i, int i2, AdType adType, String str, JSONObject jSONObject) {
        if (i >= 0 && i2 >= 0 && !DtbCommonUtils.isNullOrEmpty(str)) {
            this.width = i;
            this.height = i2;
            this.adType = adType;
            this.slotUUID = str;
            this.pubSettings = jSONObject;
            return;
        }
        throw new IllegalArgumentException("Invalid parameter(s) passed to DTBAdSize constructor.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public DTBAdSize(int i, int i2, AdType adType, String str) {
        this(i, i2, adType, str, null);
        if (i < 0 || i2 < 0 || DtbCommonUtils.isNullOrEmpty(str)) {
            throw new IllegalArgumentException("Invalid parameter(s) passed to DTBAdSize constructor.");
        }
    }
}
