package p785m5;

import android.text.TextUtils;
import com.meevii.adsdk.common.AdType;
import com.meevii.adsdk.common.Platform;

/* renamed from: m5.a */
/* loaded from: classes6.dex */
public class AdFilledData {

    /* renamed from: a */
    protected String f101000a;

    /* renamed from: b */
    protected String f101001b;

    /* renamed from: c */
    protected Platform f101002c;

    /* renamed from: d */
    protected String f101003d;

    /* renamed from: e */
    protected AdType f101004e;

    /* renamed from: f */
    protected double f101005f;

    /* renamed from: g */
    protected double f101006g;

    /* renamed from: h */
    protected String f101007h;

    /* renamed from: i */
    protected String f101008i;

    /* renamed from: a */
    public AdType m15456a() {
        AdType adType = this.f101004e;
        if (adType == null) {
            return AdType.UNKNOWN;
        }
        return adType;
    }

    /* renamed from: b */
    public String m15455b() {
        return m15452e(this.f101003d);
    }

    /* renamed from: c */
    public double m15454c() {
        return this.f101006g;
    }

    /* renamed from: d */
    public double m15453d() {
        return this.f101005f;
    }

    /* renamed from: e */
    String m15452e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str;
    }

    /* renamed from: f */
    public String m15451f() {
        return m15452e(this.f101000a);
    }

    /* renamed from: g */
    public Platform m15450g() {
        Platform platform = this.f101002c;
        if (platform == null) {
            return Platform.UNKNOWN;
        }
        return platform;
    }

    /* renamed from: h */
    public String m15449h() {
        return m15452e(this.f101001b);
    }

    /* renamed from: i */
    public String m15448i() {
        return m15452e(this.f101008i);
    }

    /* renamed from: j */
    public String m15447j() {
        return m15452e(this.f101007h);
    }

    public String toString() {
        return "AdFilledData{placementId='" + m15451f() + "', position='" + m15449h() + "', platform=" + m15450g() + ", adUnitId='" + m15455b() + "', adType=" + m15456a() + ", ecpm=" + m15453d() + ", bidFloor=" + m15454c() + ", secondaryNetwork='" + m15447j() + "', secondaryAdUnitId='" + m15448i() + "'}";
    }
}
