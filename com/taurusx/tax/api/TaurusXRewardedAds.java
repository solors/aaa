package com.taurusx.tax.api;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p578b.C28206a;
import com.taurusx.tax.p578b.C28207b;
import com.taurusx.tax.p578b.p579c.C28210c;
import com.taurusx.tax.p578b.p580d.C28218b;
import com.taurusx.tax.p578b.p581e.C28231g;
import com.taurusx.tax.p578b.p581e.C28236i;
import com.taurusx.tax.p578b.p582f.C28248g;
import com.taurusx.tax.p578b.p582f.C28250i;
import com.taurusx.tax.p583c.p584a.C28265a;
import com.taurusx.tax.p593d.C28307c;
import com.taurusx.tax.p593d.C28313e;
import com.taurusx.tax.p593d.C28317f;
import com.taurusx.tax.p595f.p596a.C28389a;
import com.taurusx.tax.p606j.C28521h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p692h2.StringFogImpl;

/* loaded from: classes7.dex */
public class TaurusXRewardedAds {

    /* renamed from: a */
    public final String f73152a = C28162a.m38504a(new byte[]{107, 28, 74, 15, 74, 14, 103, 47, 90, 10, 94, 15, 91, 24, 91, 60, 91, 14}, new byte[]{63, 125});

    /* renamed from: b */
    public Context f73153b;

    /* renamed from: c */
    public String f73154c;

    /* renamed from: d */
    public String f73155d;

    /* renamed from: e */
    public String f73156e;

    /* renamed from: f */
    public OnTaurusXRewardListener f73157f;

    /* renamed from: g */
    public boolean f73158g;

    /* renamed from: h */
    public boolean f73159h;

    /* renamed from: i */
    public long f73160i;

    /* renamed from: j */
    public long f73161j;

    /* renamed from: k */
    public boolean f73162k;

    /* renamed from: l */
    public C28250i f73163l;

    /* renamed from: m */
    public C28210c.C28211a f73164m;

    /* renamed from: n */
    public C28210c.C28214b.C28216b f73165n;

    /* renamed from: o */
    public C28210c f73166o;

    /* loaded from: classes7.dex */
    public static class RewardItem {

        /* renamed from: a */
        public String f73181a;

        /* renamed from: b */
        public int f73182b;

        public RewardItem(String str, int i) {
            this.f73181a = str;
            this.f73182b = i;
        }

        public int getAmount() {
            return this.f73182b;
        }

        public String getType() {
            return this.f73181a;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            StringFogImpl stringFogImpl = C28162a.f73047a;
            sb2.append(stringFogImpl.m23824a(new byte[]{-94, -59, -121, -63, -126, -60, -71, -44, -107, -51, -48, -44, -119, -48, -107, UnsignedBytes.MAX_POWER_OF_TWO, -103, -45, -48}, new byte[]{-16, -96}));
            sb2.append(this.f73181a);
            sb2.append(stringFogImpl.m23824a(new byte[]{92, -21, 17, -90, 31, -66, 30, -65, 80, -94, 3, -21}, new byte[]{112, -53}));
            sb2.append(this.f73182b);
            return sb2.toString();
        }
    }

    public TaurusXRewardedAds(Context context) {
        Context context2;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = TaurusXAds.getContext();
        }
        this.f73153b = context2;
    }

    public float getBidPrice() {
        return 0.0f;
    }

    public String getCustomData() {
        return this.f73156e;
    }

    public boolean isReady() {
        long j;
        if (this.f73159h) {
            C28206a m38470e = C28206a.m38470e();
            C28210c.C28214b.C28216b c28216b = this.f73165n;
            if (c28216b != null) {
                j = c28216b.f73261i;
            } else {
                j = 0;
            }
            if (!m38470e.m38474a(j, this.f73161j)) {
                return true;
            }
        }
        return false;
    }

    public void loadReward() {
        C28389a.C28390a c28390a;
        try {
            int i = 4;
            if (this.f73158g) {
                m38479a(TaurusXAdError.internalError(C28162a.f73047a.m23824a(new byte[]{4, 47, 7, 63, 19, 57, 2, 106, 31, 57, 86, 37, 24, 45, 25, 35, 24, 45}, new byte[]{118, 74})));
            } else if (isReady()) {
                m38480a();
            } else {
                StringFogImpl stringFogImpl = C28162a.f73047a;
                LogUtil.m37905d(this.f73152a, stringFogImpl.m23824a(new byte[]{-68, -46, -79, -39, -16, -49, -75, -54, -79, -49, -76, -99, -79, -39}, new byte[]{-48, -67}));
                this.f73158g = true;
                String appId = TaurusXAds.getAppId();
                this.f73155d = appId;
                if (!TextUtils.isEmpty(appId)) {
                    this.f73160i = System.currentTimeMillis();
                    C28317f c28317f = new C28317f(C28307c.InterfaceC28310c.EnumC28311a.POST);
                    c28317f.f73541a = C28207b.m38463a(this.f73153b);
                    c28317f.f73545e = C28207b.m38468a();
                    C28389a.C28390a m38457a = C28207b.m38457a(this.f73153b, this.f73155d, this.f73154c);
                    if (C28218b.m38412e()) {
                        JSONObject jSONObject = new JSONObject();
                        List<C28265a.C28267b> m38314a = C28206a.m38470e().f73193i.m38314a(String.valueOf(System.currentTimeMillis() - ((C28218b.m38411f() * 60) * 1000)));
                        JSONArray jSONArray = new JSONArray();
                        Iterator it = ((ArrayList) m38314a).iterator();
                        while (it.hasNext()) {
                            C28265a.C28267b c28267b = (C28265a.C28267b) it.next();
                            JSONObject jSONObject2 = new JSONObject();
                            byte[] bArr = new byte[i];
                            bArr[0] = 123;
                            bArr[1] = 95;
                            bArr[2] = 98;
                            bArr[3] = 83;
                            StringFogImpl stringFogImpl2 = C28162a.f73047a;
                            jSONObject2.put(stringFogImpl2.m23824a(bArr, new byte[]{15, 54}), c28267b.f73436b);
                            jSONObject2.put(stringFogImpl2.m23824a(new byte[]{-50, SignedBytes.MAX_POWER_OF_TWO, -50, 88, -33, 105, -59, 87, -58, 83}, new byte[]{-85, 54}), c28267b.f73435a);
                            jSONObject2.put(stringFogImpl2.m23824a(new byte[]{121, -10, 104, -7, 108, -9, 108, -12, 125}, new byte[]{9, -102}), c28267b.f73437c);
                            jSONArray.put(jSONObject2);
                            m38457a = m38457a;
                            i = 4;
                        }
                        jSONObject.put(C28162a.f73047a.m23824a(new byte[]{73, -1, 119, -2, 94, -2, 70, -17, 119, -13, 65, -24, 92, -12, 90, -30}, new byte[]{40, -101}), jSONArray);
                        c28390a = m38457a;
                        c28390a.f73726K = jSONObject;
                    } else {
                        c28390a = m38457a;
                        C28206a.m38470e().f73193i.m38310b(String.valueOf(System.currentTimeMillis() - 86400000));
                    }
                    c28317f.f73542b = c28390a;
                    c28317f.f73544d = C28162a.f73047a.m23824a(new byte[]{-81, 51, -86, 55, -81, 50}, new byte[]{-35, 86});
                    C28313e.m38241a(c28317f, 1, new C28313e.InterfaceC28314a() { // from class: com.taurusx.tax.api.TaurusXRewardedAds.1
                        @Override // com.taurusx.tax.p593d.C28313e.InterfaceC28314a
                        public void onResult(int i2, String str, String str2) {
                            if (i2 == 0) {
                                C28236i.m38370a(TaurusXRewardedAds.this.f73166o).m38371a(TaurusXRewardedAds.this.f73160i);
                                TaurusXRewardedAds.this.m38477a(str2);
                            } else if (i2 == 204) {
                                TaurusXRewardedAds.this.m38479a(C28207b.m38464a(i2, str));
                            } else {
                                TaurusXRewardedAds.this.m38479a(C28207b.m38464a(i2, str));
                            }
                            TaurusXRewardedAds.this.f73158g = false;
                        }
                    });
                    return;
                }
                try {
                    LogUtil.m37905d(this.f73152a, stringFogImpl.m23824a(new byte[]{-109, 48, -94, 41, -74, 96, -69, 51, -14, 37, -65, 48, -90, 57}, new byte[]{-46, SignedBytes.MAX_POWER_OF_TWO}));
                    throw new Exception(stringFogImpl.m23824a(new byte[]{-102, -121, -85, -98, -65, -41, -78, -124, -5, -110, -74, -121, -81, -114}, new byte[]{-37, -9}));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Error | Exception unused) {
            m38479a(TaurusXAdError.internalError(C28162a.f73047a.m23824a(new byte[]{42, -89, 9, -73, 29, -79, 12, -117, 21, -78, 20, -30, 61, -70, 27, -89, 8, -74, 17, -83, 22}, new byte[]{120, -62})));
        }
    }

    public void loadRewardFromBid(String str) {
        try {
            m38477a(new JSONObject(C28307c.m38251a(Base64.decode(str, 2), 1)).getString(C28162a.f73047a.m23824a(new byte[]{91, -55, 75, -55}, new byte[]{63, -88})));
        } catch (Exception unused) {
        }
    }

    public void setAdUnitId(String str) {
        this.f73154c = str;
    }

    public void setCustomData(String str) {
        this.f73156e = str;
    }

    public void setListener(OnTaurusXRewardListener onTaurusXRewardListener) {
        this.f73157f = onTaurusXRewardListener;
    }

    public void setMute(boolean z) {
        this.f73162k = z;
    }

    public void showReward() {
        String str;
        if (isReady()) {
            this.f73163l.m38346c();
            this.f73159h = false;
            this.f73161j = 0L;
            return;
        }
        StringFogImpl stringFogImpl = C28162a.f73047a;
        final TaurusXAdError showFailedError = TaurusXAdError.showFailedError(stringFogImpl.m23824a(new byte[]{-100, -33, UnsignedBytes.MAX_POWER_OF_TWO, -64, -112, -46, -99, -59, UnsignedBytes.MAX_POWER_OF_TWO, -59, -112, -59, -118, -64, -114, -59, -117, -56, -127, -40, -101, -56, -99, -46, -114, -45, -106}, new byte[]{-49, -105}));
        if (showFailedError != null) {
            str = showFailedError.getMessage();
        } else {
            str = null;
        }
        C28231g.m38378a(this.f73153b, stringFogImpl.m23824a(new byte[]{11, -14, 23, -19, 7, -4, 25, -13, 20}, new byte[]{88, -70}), str, String.valueOf(System.currentTimeMillis()), "", this.f73155d, this.f73154c);
        C28521h.m38005a(new Runnable() { // from class: com.taurusx.tax.api.TaurusXRewardedAds.3
            @Override // java.lang.Runnable
            public void run() {
                OnTaurusXRewardListener onTaurusXRewardListener = TaurusXRewardedAds.this.f73157f;
                if (onTaurusXRewardListener != null) {
                    onTaurusXRewardListener.onAdShowFailed(showFailedError);
                }
            }
        });
    }

    /* renamed from: a */
    public final void m38477a(String str) {
        try {
            C28210c m38429a = C28210c.m38429a(new JSONObject(str));
            this.f73166o = m38429a;
            this.f73165n = m38429a.f73228d.f73249b;
            this.f73164m = m38429a.f73227c;
            C28250i c28250i = new C28250i(this.f73154c, this.f73166o);
            this.f73163l = c28250i;
            boolean z = this.f73162k;
            String str2 = this.f73156e;
            c28250i.f73395f = z;
            c28250i.f73396g = 1;
            c28250i.f73397h = str2;
            c28250i.f73400k = null;
            c28250i.f73390e = new C28248g() { // from class: com.taurusx.tax.api.TaurusXRewardedAds.2
                @Override // com.taurusx.tax.p578b.p582f.C28248g
                public void onAdClicked() {
                    final TaurusXRewardedAds taurusXRewardedAds = TaurusXRewardedAds.this;
                    taurusXRewardedAds.getClass();
                    C28521h.m38005a(new Runnable() { // from class: com.taurusx.tax.api.TaurusXRewardedAds.11
                        @Override // java.lang.Runnable
                        public void run() {
                            OnTaurusXRewardListener onTaurusXRewardListener = TaurusXRewardedAds.this.f73157f;
                            if (onTaurusXRewardListener != null) {
                                onTaurusXRewardListener.onAdClicked();
                            }
                        }
                    });
                }

                @Override // com.taurusx.tax.p578b.p582f.C28248g
                public void onAdClosed() {
                    final TaurusXRewardedAds taurusXRewardedAds = TaurusXRewardedAds.this;
                    taurusXRewardedAds.getClass();
                    C28521h.m38005a(new Runnable() { // from class: com.taurusx.tax.api.TaurusXRewardedAds.12
                        @Override // java.lang.Runnable
                        public void run() {
                            OnTaurusXRewardListener onTaurusXRewardListener = TaurusXRewardedAds.this.f73157f;
                            if (onTaurusXRewardListener != null) {
                                onTaurusXRewardListener.onAdClosed();
                            }
                        }
                    });
                }

                @Override // com.taurusx.tax.p578b.p582f.C28248g
                public void onAdImpression() {
                    final TaurusXRewardedAds taurusXRewardedAds = TaurusXRewardedAds.this;
                    taurusXRewardedAds.getClass();
                    C28521h.m38005a(new Runnable() { // from class: com.taurusx.tax.api.TaurusXRewardedAds.10
                        @Override // java.lang.Runnable
                        public void run() {
                            OnTaurusXRewardListener onTaurusXRewardListener = TaurusXRewardedAds.this.f73157f;
                            if (onTaurusXRewardListener != null) {
                                onTaurusXRewardListener.onAdShown();
                            }
                        }
                    });
                }

                @Override // com.taurusx.tax.p578b.p582f.C28248g
                public void onAdLoadFailed(TaurusXAdError taurusXAdError) {
                    TaurusXRewardedAds.this.m38479a(taurusXAdError);
                }

                @Override // com.taurusx.tax.p578b.p582f.C28248g
                public void onAdLoaded() {
                    TaurusXRewardedAds.this.m38480a();
                }

                @Override // com.taurusx.tax.p578b.p582f.C28248g
                public void onAdReward() {
                    final TaurusXRewardedAds taurusXRewardedAds = TaurusXRewardedAds.this;
                    taurusXRewardedAds.getClass();
                    C28521h.m38005a(new Runnable() { // from class: com.taurusx.tax.api.TaurusXRewardedAds.8
                        @Override // java.lang.Runnable
                        public void run() {
                            C28210c.C28214b.C28216b c28216b;
                            TaurusXRewardedAds taurusXRewardedAds2 = TaurusXRewardedAds.this;
                            OnTaurusXRewardListener onTaurusXRewardListener = taurusXRewardedAds2.f73157f;
                            if (onTaurusXRewardListener != null && (c28216b = taurusXRewardedAds2.f73165n) != null) {
                                onTaurusXRewardListener.onRewarded(new RewardItem(c28216b.f73256d, c28216b.f73257e));
                            }
                        }
                    });
                }

                @Override // com.taurusx.tax.p578b.p582f.C28248g
                public void onAdRewardFailed() {
                    final TaurusXRewardedAds taurusXRewardedAds = TaurusXRewardedAds.this;
                    taurusXRewardedAds.getClass();
                    C28521h.m38005a(new Runnable() { // from class: com.taurusx.tax.api.TaurusXRewardedAds.9
                        @Override // java.lang.Runnable
                        public void run() {
                            OnTaurusXRewardListener onTaurusXRewardListener = TaurusXRewardedAds.this.f73157f;
                            if (onTaurusXRewardListener != null) {
                                onTaurusXRewardListener.onRewardFailed();
                            }
                        }
                    });
                }

                @Override // com.taurusx.tax.p578b.p582f.C28248g
                public void onAdVideoEnd() {
                    final TaurusXRewardedAds taurusXRewardedAds = TaurusXRewardedAds.this;
                    taurusXRewardedAds.getClass();
                    C28521h.m38005a(new Runnable() { // from class: com.taurusx.tax.api.TaurusXRewardedAds.7
                        @Override // java.lang.Runnable
                        public void run() {
                            OnTaurusXRewardListener onTaurusXRewardListener = TaurusXRewardedAds.this.f73157f;
                            if (onTaurusXRewardListener != null) {
                                onTaurusXRewardListener.onVideoCompleted();
                            }
                        }
                    });
                }

                @Override // com.taurusx.tax.p578b.p582f.C28248g
                public void onAdVideoStart() {
                    final TaurusXRewardedAds taurusXRewardedAds = TaurusXRewardedAds.this;
                    taurusXRewardedAds.getClass();
                    C28521h.m38005a(new Runnable() { // from class: com.taurusx.tax.api.TaurusXRewardedAds.6
                        @Override // java.lang.Runnable
                        public void run() {
                            OnTaurusXRewardListener onTaurusXRewardListener = TaurusXRewardedAds.this.f73157f;
                            if (onTaurusXRewardListener != null) {
                                onTaurusXRewardListener.onVideoStart();
                            }
                        }
                    });
                }
            };
            this.f73163l.m38348a();
        } catch (JSONException e) {
            m38479a(TaurusXAdError.parseError(C28162a.f73047a.m23824a(new byte[]{22, 42, 20, 56, 3, 107, 3, 57, 20, 36, 20}, new byte[]{102, 75})));
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final void m38480a() {
        if (this.f73164m != null) {
            this.f73161j = System.currentTimeMillis();
            C28231g.m38381a(this.f73153b, this.f73164m.f73235f, C28162a.f73047a.m23824a(new byte[]{8, 31, 5, 20, 27, 3, 17, 19, 7, 21, 23, 3}, new byte[]{68, 80}), this.f73161j - this.f73160i, this.f73166o);
            C28521h.m38005a(new Runnable() { // from class: com.taurusx.tax.api.TaurusXRewardedAds.4
                @Override // java.lang.Runnable
                public void run() {
                    TaurusXRewardedAds.this.f73159h = true;
                    TaurusXRewardedAds.this.f73158g = false;
                    OnTaurusXRewardListener onTaurusXRewardListener = TaurusXRewardedAds.this.f73157f;
                    if (onTaurusXRewardListener != null) {
                        onTaurusXRewardListener.onAdLoaded();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void m38479a(final TaurusXAdError taurusXAdError) {
        if (taurusXAdError == null || taurusXAdError.getCode() != 3) {
            C28231g.m38378a(this.f73153b, C28162a.f73047a.m23824a(new byte[]{-40, -72, -43, -77, -53, -79, -43, -66, -40}, new byte[]{-108, -9}), taurusXAdError != null ? taurusXAdError.getMessage() : null, String.valueOf(System.currentTimeMillis()), String.valueOf(System.currentTimeMillis() - this.f73160i), this.f73155d, this.f73154c);
        }
        C28521h.m38005a(new Runnable() { // from class: com.taurusx.tax.api.TaurusXRewardedAds.5
            @Override // java.lang.Runnable
            public void run() {
                if (TaurusXRewardedAds.this.f73157f != null) {
                    if (taurusXAdError.getCode() == 9) {
                        TaurusXRewardedAds.this.f73157f.onAdFailedToLoad(TaurusXAdError.downloadError(C28162a.f73047a.m23824a(new byte[]{53, 97, 38, 96, 61, 97, 48, 106, 113, 107, 35, 124, 62, 124}, new byte[]{81, 14})));
                        return;
                    }
                    TaurusXRewardedAds.this.f73157f.onAdFailedToLoad(taurusXAdError);
                }
            }
        });
    }
}
