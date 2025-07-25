package com.applovin.impl;

import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.DtbConstants;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.p0 */
/* loaded from: classes2.dex */
public class C5097p0 {

    /* renamed from: a */
    private final String f8965a;

    /* renamed from: b */
    private final DTBAdSize f8966b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.p0$a */
    /* loaded from: classes2.dex */
    public enum EnumC5098a {
        VIDEO,
        DISPLAY,
        INTERSTITIAL
    }

    public C5097p0(String str, JSONObject jSONObject, MaxAdFormat maxAdFormat) {
        this.f8965a = str;
        this.f8966b = m96607a(JsonUtils.getInt(jSONObject, "type", m96606a(maxAdFormat).ordinal()), maxAdFormat, str);
    }

    /* renamed from: a */
    public DTBAdSize m96608a() {
        return this.f8966b;
    }

    /* renamed from: a */
    private EnumC5098a m96606a(MaxAdFormat maxAdFormat) {
        return maxAdFormat.isAdViewAd() ? EnumC5098a.DISPLAY : EnumC5098a.INTERSTITIAL;
    }

    /* renamed from: a */
    private DTBAdSize m96607a(int i, MaxAdFormat maxAdFormat, String str) {
        try {
            if (EnumC5098a.VIDEO.ordinal() == i) {
                return new DTBAdSize.DTBVideo(320, DtbConstants.DEFAULT_PLAYER_HEIGHT, str);
            }
            if (EnumC5098a.DISPLAY.ordinal() == i) {
                return new DTBAdSize(maxAdFormat.getSize().getWidth(), maxAdFormat.getSize().getHeight(), str);
            }
            if (EnumC5098a.INTERSTITIAL.ordinal() == i) {
                return new DTBAdSize.DTBInterstitialAdSize(str);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
