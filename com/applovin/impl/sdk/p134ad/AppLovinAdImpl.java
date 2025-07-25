package com.applovin.impl.sdk.p134ad;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.applovin.impl.C4498h0;
import com.applovin.impl.C5517sj;
import com.applovin.impl.C5567tl;
import com.applovin.impl.InterfaceC4572i8;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C5416j;
import com.applovin.impl.sdk.C5434n;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.AppLovinAdImpl */
/* loaded from: classes2.dex */
public abstract class AppLovinAdImpl extends AppLovinAdBase implements AppLovinAd, InterfaceC4572i8 {

    /* renamed from: a */
    private final Bundle f9780a;

    /* renamed from: b */
    private C4498h0 f9781b;

    /* renamed from: c */
    private boolean f9782c;

    /* renamed from: d */
    private C5353c f9783d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AppLovinAdImpl(JSONObject jSONObject, JSONObject jSONObject2, C5416j c5416j) {
        super(jSONObject, jSONObject2, c5416j);
        this.f9780a = new Bundle();
    }

    /* renamed from: b */
    private long m95530b() {
        return getLongFromAdObject("ad_expiration_ms", ((Long) this.sdk.m95144a(C5517sj.f10570d1)).longValue());
    }

    public boolean canExpire() {
        if (getSize() == AppLovinAdSize.INTERSTITIAL && m95530b() > 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        AppLovinAd m95328c;
        if ((obj instanceof C5353c) && (m95328c = ((C5353c) obj).m95328c()) != null) {
            obj = m95328c;
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && getAdIdNumber() == ((AppLovinAdImpl) obj).getAdIdNumber()) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    public C4498h0 getAdZone() {
        C4498h0 c4498h0 = this.f9781b;
        if (c4498h0 != null) {
            if (c4498h0.m98843f() != null && this.f9781b.m98842g() != null) {
                return this.f9781b;
            }
            if (getSize() == null && getType() == null) {
                return this.f9781b;
            }
        }
        C4498h0 m98851a = C4498h0.m98851a(getSize(), getType(), getStringFromFullResponse("zone_id", null), getBooleanFromFullResponse("is_bidding", false), getBooleanFromFullResponse("is_direct_sold", false));
        this.f9781b = m98851a;
        return m98851a;
    }

    public C5353c getDummyAd() {
        return this.f9783d;
    }

    public Bundle getMAXAdValues() {
        return this.f9780a;
    }

    public abstract JSONObject getOriginalFullResponse();

    public String getRawFullResponse() {
        String jSONObject;
        C5567tl c5567tl = this.synchronizedFullResponse;
        if (c5567tl != null) {
            return c5567tl.toString();
        }
        synchronized (this.fullResponseLock) {
            jSONObject = this.fullResponse.toString();
        }
        return jSONObject;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return AppLovinAdSize.fromString(getStringFromFullResponse("ad_size", null));
    }

    @Override // com.applovin.impl.InterfaceC4572i8
    public long getTimeToLiveMillis() {
        if (!canExpire()) {
            return Long.MAX_VALUE;
        }
        return m95530b() - (System.currentTimeMillis() - getCreatedAtMillis());
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return AppLovinAdType.fromString(getStringFromFullResponse("ad_type", null));
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (getAdZone().m98840i()) {
            return null;
        }
        return getStringFromFullResponse("zone_id", null);
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", Boolean.FALSE);
    }

    public boolean hasVideoUrl() {
        this.sdk.m95186I();
        if (C5434n.m94914a()) {
            this.sdk.m95186I().m94907b("AppLovinAd", "Attempting to invoke hasVideoUrl() from base ad class");
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (int) getAdIdNumber();
    }

    public boolean isExpired() {
        return this.f9782c;
    }

    public boolean isVideoAd() {
        if (this.adObject.has("is_video_ad")) {
            return getBooleanFromAdObject("is_video_ad", Boolean.FALSE);
        }
        return hasVideoUrl();
    }

    public void setDummyAd(C5353c c5353c) {
        this.f9783d = c5353c;
    }

    @Override // com.applovin.impl.InterfaceC4572i8
    public void setExpired() {
        this.f9782c = true;
    }

    public void setHasShown(boolean z) {
        try {
            C5567tl c5567tl = this.synchronizedAdObject;
            if (c5567tl != null) {
                c5567tl.m94421a("shown", (Object) Boolean.valueOf(z));
            } else {
                synchronized (this.adObjectLock) {
                    this.adObject.put("shown", z);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void setMaxAdValue(String str, Object obj) {
        BundleUtils.put(str, obj, this.f9780a);
    }

    @NonNull
    public String toString() {
        return "AppLovinAd{adIdNumber=" + getAdIdNumber() + ", zoneId=\"" + getZoneId() + "\"}";
    }
}
