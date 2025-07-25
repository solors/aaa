package com.taurusx.tax.api;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.taurusx.tax.C28154R;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p578b.C28206a;
import com.taurusx.tax.p578b.C28207b;
import com.taurusx.tax.p578b.p579c.C28210c;
import com.taurusx.tax.p578b.p580d.C28218b;
import com.taurusx.tax.p578b.p581e.C28231g;
import com.taurusx.tax.p578b.p582f.C28248g;
import com.taurusx.tax.p578b.p582f.C28255l;
import com.taurusx.tax.p583c.p584a.C28265a;
import com.taurusx.tax.p593d.C28307c;
import com.taurusx.tax.p593d.C28313e;
import com.taurusx.tax.p593d.C28317f;
import com.taurusx.tax.p595f.p596a.C28389a;
import com.taurusx.tax.p606j.C28518e;
import com.taurusx.tax.p606j.C28521h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p692h2.StringFogImpl;

/* loaded from: classes7.dex */
public class TaurusXNativeAds {

    /* renamed from: b */
    public Context f73133b;

    /* renamed from: c */
    public String f73134c;

    /* renamed from: d */
    public String f73135d;

    /* renamed from: e */
    public OnTaurusXNativeListener f73136e;

    /* renamed from: f */
    public boolean f73137f;

    /* renamed from: g */
    public boolean f73138g;

    /* renamed from: h */
    public long f73139h;

    /* renamed from: j */
    public long f73141j;

    /* renamed from: k */
    public C28255l f73142k;

    /* renamed from: l */
    public C28210c.C28211a f73143l;

    /* renamed from: m */
    public C28210c.C28214b.C28216b f73144m;

    /* renamed from: n */
    public C28210c f73145n;

    /* renamed from: a */
    public final String f73132a = C28162a.m38504a(new byte[]{-73, -3, -106, -18, -106, -17, -69, -46, -126, -24, -118, -22, -122, -35, -121, -17}, new byte[]{-29, -100});

    /* renamed from: i */
    public boolean f73140i = false;

    public TaurusXNativeAds(Context context) {
        Context context2;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = TaurusXAds.getContext();
        }
        this.f73133b = context2;
    }

    public void destroy() {
        this.f73138g = true;
    }

    public float getBidPrice() {
        return 0.0f;
    }

    public String getCallToAction() {
        C28255l c28255l = this.f73142k;
        if (c28255l != null) {
            return c28255l.f73410s.f73223e;
        }
        return null;
    }

    public String getDesc() {
        C28255l c28255l = this.f73142k;
        if (c28255l != null) {
            return c28255l.f73410s.f73220b;
        }
        return null;
    }

    public String getIconUrl() {
        C28255l c28255l = this.f73142k;
        if (c28255l != null) {
            return c28255l.f73410s.f73221c;
        }
        return null;
    }

    public String getImageUrl() {
        C28255l c28255l = this.f73142k;
        if (c28255l != null) {
            return c28255l.f73410s.f73222d;
        }
        return null;
    }

    public float getPrice() {
        return 0.0f;
    }

    public String getTitle() {
        C28255l c28255l = this.f73142k;
        if (c28255l != null) {
            return c28255l.f73410s.f73219a;
        }
        return null;
    }

    public boolean isReady() {
        long j;
        if (this.f73140i) {
            C28206a m38470e = C28206a.m38470e();
            C28210c.C28214b.C28216b c28216b = this.f73144m;
            if (c28216b != null) {
                j = c28216b.f73261i;
            } else {
                j = 0;
            }
            if (!m38470e.m38474a(j, this.f73141j)) {
                return true;
            }
        }
        return false;
    }

    public void loadNative() {
        int i = 2;
        if (!this.f73137f && !this.f73138g) {
            if (isReady() && this.f73143l != null) {
                m38485a();
                return;
            }
            this.f73137f = true;
            String appId = TaurusXAds.getAppId();
            this.f73135d = appId;
            byte b = 62;
            int i2 = 4;
            if (!TextUtils.isEmpty(appId)) {
                this.f73139h = System.currentTimeMillis();
                this.f73140i = false;
                try {
                    C28317f c28317f = new C28317f(C28307c.InterfaceC28310c.EnumC28311a.POST);
                    c28317f.f73541a = C28207b.m38463a(this.f73133b);
                    c28317f.f73545e = C28207b.m38468a();
                    C28389a.C28390a m38457a = C28207b.m38457a(this.f73133b, this.f73135d, this.f73134c);
                    if (C28218b.m38412e()) {
                        JSONObject jSONObject = new JSONObject();
                        List<C28265a.C28267b> m38314a = C28206a.m38470e().f73193i.m38314a(String.valueOf(System.currentTimeMillis() - ((C28218b.m38411f() * 60) * 1000)));
                        JSONArray jSONArray = new JSONArray();
                        Iterator it = ((ArrayList) m38314a).iterator();
                        while (it.hasNext()) {
                            C28265a.C28267b c28267b = (C28265a.C28267b) it.next();
                            JSONObject jSONObject2 = new JSONObject();
                            byte[] bArr = new byte[i2];
                            bArr[0] = 39;
                            bArr[1] = -68;
                            bArr[i] = b;
                            bArr[3] = -80;
                            byte[] bArr2 = new byte[i];
                            bArr2[0] = 83;
                            bArr2[1] = -43;
                            StringFogImpl stringFogImpl = C28162a.f73047a;
                            jSONObject2.put(stringFogImpl.m23824a(bArr, bArr2), c28267b.f73436b);
                            jSONObject2.put(stringFogImpl.m23824a(new byte[]{14, 94, 14, 70, 31, 119, 5, 73, 6, 77}, new byte[]{107, 40}), c28267b.f73435a);
                            jSONObject2.put(stringFogImpl.m23824a(new byte[]{57, 69, 40, 74, 44, 68, 44, 71, 61}, new byte[]{73, 41}), c28267b.f73437c);
                            jSONArray.put(jSONObject2);
                            jSONObject = jSONObject;
                            i = 2;
                            b = 62;
                            i2 = 4;
                        }
                        JSONObject jSONObject3 = jSONObject;
                        jSONObject3.put(C28162a.f73047a.m23824a(new byte[]{83, -82, 109, -81, 68, -81, 92, -66, 109, -94, 91, -71, 70, -91, SignedBytes.MAX_POWER_OF_TWO, -77}, new byte[]{50, -54}), jSONArray);
                        m38457a.f73726K = jSONObject3;
                    } else {
                        C28206a.m38470e().f73193i.m38310b(String.valueOf(System.currentTimeMillis() - 86400000));
                    }
                    c28317f.f73542b = m38457a;
                    c28317f.f73544d = C28162a.f73047a.m23824a(new byte[]{-54, -11, -48, -3, -46, -15}, new byte[]{-92, -108});
                    C28313e.m38241a(c28317f, 1, new C28313e.InterfaceC28314a() { // from class: com.taurusx.tax.api.TaurusXNativeAds.1
                        @Override // com.taurusx.tax.p593d.C28313e.InterfaceC28314a
                        public void onResult(int i3, String str, String str2) {
                            if (i3 == 0) {
                                TaurusXNativeAds.this.m38482a(str2);
                            } else if (i3 == 204) {
                                TaurusXNativeAds.this.m38484a(C28207b.m38464a(i3, str));
                            } else {
                                TaurusXNativeAds.this.m38484a(C28207b.m38464a(i3, str));
                            }
                            TaurusXNativeAds.this.f73137f = false;
                        }
                    });
                    return;
                } catch (Error | Exception unused) {
                    m38484a(TaurusXAdError.internalError(C28162a.f73047a.m23824a(new byte[]{-73, 36, -108, 52, UnsignedBytes.MAX_POWER_OF_TWO, 50, -111, 8, -120, 49, -119, 97, -96, 57, -122, 36, -107, 53, -116, 46, -117}, new byte[]{-27, 65})));
                    return;
                }
            }
            try {
                StringFogImpl stringFogImpl2 = C28162a.f73047a;
                LogUtil.m37905d(this.f73132a, stringFogImpl2.m23824a(new byte[]{-99, 112, -84, 105, -72, 32, -75, 115, -4, 101, -79, 112, -88, 121}, new byte[]{-36, 0}));
                throw new Exception(stringFogImpl2.m23824a(new byte[]{95, -98, 110, -121, 122, -50, 119, -99, 62, -117, 115, -98, 106, -105}, new byte[]{30, -18}));
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        m38484a(TaurusXAdError.internalError(C28162a.f73047a.m23824a(new byte[]{9, 40, 10, 56, 30, 62, 15, 109, 18, 62, 91, 34, 21, 42, 20, 36, 21, 42}, new byte[]{123, 77})));
    }

    public void loadNativeFromBid(String str) {
        try {
            m38482a(new JSONObject(C28307c.m38251a(Base64.decode(str, 2), 1)).getString(C28162a.f73047a.m23824a(new byte[]{-113, 105, -97, 105}, new byte[]{-21, 8})));
        } catch (Exception unused) {
        }
    }

    public void registerViewForInteraction(ViewGroup viewGroup, ImageView imageView, MediaView mediaView, List<View> list) {
        if (this.f73142k != null && isReady()) {
            C28255l c28255l = this.f73142k;
            c28255l.m38344a(viewGroup, imageView, mediaView, list, c28255l.f73410s);
        }
        this.f73140i = false;
    }

    public void setAdUnitId(String str) {
        this.f73134c = str;
    }

    public void setListener(OnTaurusXNativeListener onTaurusXNativeListener) {
        this.f73136e = onTaurusXNativeListener;
    }

    public void showNative(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(C28154R.C28158layout.rab_card_large, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C28154R.C28157id.rab_native_title);
        ImageView imageView = (ImageView) inflate.findViewById(C28154R.C28157id.rab_native_icon);
        TextView textView2 = (TextView) inflate.findViewById(C28154R.C28157id.rab_native_detail);
        TextView textView3 = (TextView) inflate.findViewById(C28154R.C28157id.rab_native_action_btn);
        textView.setText(this.f73142k.f73410s.f73219a);
        textView2.setText(this.f73142k.f73410s.f73220b);
        textView3.setText(this.f73142k.f73410s.f73223e);
        MediaView mediaView = new MediaView(context);
        ((ViewGroup) inflate.findViewById(C28154R.C28157id.rab_native_media_cover)).addView(mediaView, -1, -1);
        viewGroup.addView(inflate, context.getResources().getDisplayMetrics().widthPixels, C28518e.m38042a(this.f73133b, 410.0f));
        if (this.f73142k != null && isReady()) {
            this.f73142k.m38344a(viewGroup, imageView, mediaView, Arrays.asList(textView, textView2, textView3, mediaView, imageView), this.f73142k.f73410s);
        }
        this.f73140i = false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        StringFogImpl stringFogImpl = C28162a.f73047a;
        sb2.append(stringFogImpl.m23824a(new byte[]{91, 120, 107, 120, 100, 116, 75, 112, 107, 117, 122, 36, 56}, new byte[]{31, 25}));
        sb2.append(getTitle());
        sb2.append('\'');
        sb2.append(stringFogImpl.m23824a(new byte[]{34, -44, 99, -80, 107, -121, 109, -55, 41}, new byte[]{14, -12}));
        sb2.append(getDesc());
        sb2.append('\'');
        sb2.append(stringFogImpl.m23824a(new byte[]{-59, -110, -124, -15, -120, -34, -123, -26, -122, -13, -118, -58, UnsignedBytes.MAX_POWER_OF_TWO, -35, -121, -113, -50}, new byte[]{-23, -78}));
        sb2.append(getCallToAction());
        sb2.append('\'');
        sb2.append(stringFogImpl.m23824a(new byte[]{UnsignedBytes.MAX_POWER_OF_TWO, 32, -63, 73, -49, 111, -62, 85, -34, 108, -111, 39}, new byte[]{-84, 0}));
        sb2.append(getIconUrl());
        sb2.append('\'');
        sb2.append(stringFogImpl.m23824a(new byte[]{-73, -50, -10, -89, -10, -113, -4, -117, -50, -100, -9, -45, -68}, new byte[]{-101, -18}));
        sb2.append(getImageUrl());
        sb2.append('\'');
        sb2.append(stringFogImpl.m23824a(new byte[]{5, -2, 68, -114, 91, -73, 74, -69, 20}, new byte[]{41, -34}));
        sb2.append(getPrice());
        sb2.append('}');
        return sb2.toString();
    }

    /* renamed from: a */
    public final void m38482a(String str) {
        if (TextUtils.isEmpty(str)) {
            m38484a(TaurusXAdError.noContent(C28162a.f73047a.m23824a(new byte[]{-21, 39, -123, 43, -22, 38, -15, 45, -21, 60}, new byte[]{-91, 104})));
            return;
        }
        try {
            C28210c m38429a = C28210c.m38429a(new JSONObject(str));
            this.f73145n = m38429a;
            this.f73144m = m38429a.f73228d.f73249b;
            this.f73143l = m38429a.f73227c;
            C28255l c28255l = new C28255l(this.f73134c, this.f73145n);
            this.f73142k = c28255l;
            c28255l.f73367l = 100;
            c28255l.f73368m = 100;
            c28255l.f73390e = new C28248g() { // from class: com.taurusx.tax.api.TaurusXNativeAds.2
                @Override // com.taurusx.tax.p578b.p582f.C28248g
                public void onAdClicked() {
                    OnTaurusXNativeListener onTaurusXNativeListener = TaurusXNativeAds.this.f73136e;
                    if (onTaurusXNativeListener != null) {
                        onTaurusXNativeListener.onClicked();
                    }
                }

                @Override // com.taurusx.tax.p578b.p582f.C28248g
                public void onAdImpression() {
                    final TaurusXNativeAds taurusXNativeAds = TaurusXNativeAds.this;
                    taurusXNativeAds.getClass();
                    C28521h.m38005a(new Runnable() { // from class: com.taurusx.tax.api.TaurusXNativeAds.4
                        @Override // java.lang.Runnable
                        public void run() {
                            OnTaurusXNativeListener onTaurusXNativeListener = TaurusXNativeAds.this.f73136e;
                            if (onTaurusXNativeListener != null) {
                                onTaurusXNativeListener.onImpression();
                            }
                        }
                    });
                }

                @Override // com.taurusx.tax.p578b.p582f.C28248g
                public void onAdLoadFailed(TaurusXAdError taurusXAdError) {
                    TaurusXNativeAds.this.m38484a(taurusXAdError);
                }

                @Override // com.taurusx.tax.p578b.p582f.C28248g
                public void onAdLoaded() {
                    TaurusXNativeAds.this.m38485a();
                }

                @Override // com.taurusx.tax.p578b.p582f.C28248g
                public void onAdClosed() {
                }

                @Override // com.taurusx.tax.p578b.p582f.C28248g
                public void onAdVideoEnd() {
                }

                @Override // com.taurusx.tax.p578b.p582f.C28248g
                public void onAdVideoStart() {
                }
            };
            this.f73142k.m38348a();
        } catch (Exception e) {
            if (e instanceof JSONException) {
                m38484a(TaurusXAdError.internalError(C28162a.f73047a.m23824a(new byte[]{-27, -32, -25, -14, -16, -2, -12, -27, -22, -28, -25, -13, -6, -13}, new byte[]{-75, -95})));
                return;
            }
            m38484a(TaurusXAdError.internalError(C28162a.f73047a.m23824a(new byte[]{91, 113, 69, 113, 65, 104, SignedBytes.MAX_POWER_OF_TWO, 96, 75, 109, 92, 112, 92}, new byte[]{14, 63})));
        }
    }

    /* renamed from: a */
    public final void m38485a() {
        if (this.f73143l != null) {
            this.f73141j = System.currentTimeMillis();
            C28231g.m38381a(this.f73133b, this.f73143l.f73235f, C28162a.f73047a.m23824a(new byte[]{-68, SignedBytes.MAX_POWER_OF_TWO, -79, 75, -81, 92, -91, 76, -77, 74, -93, 92}, new byte[]{-16, 15}), System.currentTimeMillis() - this.f73139h, this.f73145n);
            C28521h.m38005a(new Runnable() { // from class: com.taurusx.tax.api.TaurusXNativeAds.3
                @Override // java.lang.Runnable
                public void run() {
                    TaurusXNativeAds.this.f73140i = true;
                    TaurusXNativeAds taurusXNativeAds = TaurusXNativeAds.this;
                    OnTaurusXNativeListener onTaurusXNativeListener = taurusXNativeAds.f73136e;
                    if (onTaurusXNativeListener != null) {
                        onTaurusXNativeListener.onAdLoaded(taurusXNativeAds);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void m38484a(final TaurusXAdError taurusXAdError) {
        if (taurusXAdError == null || taurusXAdError.getCode() != 3) {
            C28231g.m38378a(this.f73133b, C28162a.f73047a.m23824a(new byte[]{-24, 67, -27, 72, -5, 74, -27, 69, -24}, new byte[]{-92, 12}), taurusXAdError != null ? taurusXAdError.getMessage() : null, String.valueOf(System.currentTimeMillis()), String.valueOf(System.currentTimeMillis() - this.f73139h), this.f73135d, this.f73134c);
        }
        C28521h.m38005a(new Runnable() { // from class: com.taurusx.tax.api.TaurusXNativeAds.5
            @Override // java.lang.Runnable
            public void run() {
                OnTaurusXNativeListener onTaurusXNativeListener = TaurusXNativeAds.this.f73136e;
                if (onTaurusXNativeListener != null) {
                    onTaurusXNativeListener.onAdFailedToLoad(taurusXAdError);
                }
            }
        });
    }
}
