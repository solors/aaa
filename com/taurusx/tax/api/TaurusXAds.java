package com.taurusx.tax.api;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.common.primitives.UnsignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p578b.C28206a;
import com.taurusx.tax.p578b.C28207b;
import com.taurusx.tax.p578b.p580d.C28217a;
import com.taurusx.tax.p578b.p580d.C28218b;
import com.taurusx.tax.p583c.p589e.C28291a;
import com.taurusx.tax.p593d.C28307c;
import com.taurusx.tax.p593d.C28313e;
import com.taurusx.tax.p593d.C28317f;
import com.taurusx.tax.p606j.C28512c;
import com.taurusx.tax.p606j.C28532o;
import p692h2.StringFogImpl;

/* loaded from: classes7.dex */
public class TaurusXAds {

    /* renamed from: a */
    public static final String f73053a = C28162a.f73047a.m23824a(new byte[]{-117, 123, -86, 104, -86, 105, -121, 91, -69, 105}, new byte[]{-33, 26});

    public static String getAppId() {
        C28206a m38470e = C28206a.m38470e();
        if (!TextUtils.isEmpty(m38470e.f73185a)) {
            return m38470e.f73185a;
        }
        return "";
    }

    public static Context getContext() {
        Context context = C28206a.m38470e().f73186b;
        if (context != null) {
            return context.getApplicationContext();
        }
        return null;
    }

    public static String getSdkVersion() {
        return C28162a.f73047a.m23824a(new byte[]{112, 126, 112, 126, 120}, new byte[]{65, 80});
    }

    public static void init(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.m37904e(f73053a, C28162a.f73047a.m23824a(new byte[]{-4, -24, -51, -96, -55, -16, -40, -55, -52, -96, -63, -13, -120, -18, -35, -20, -60, -84, -120, -16, -60, -27, -55, -13, -51, -96, -38, -27, -53, -24, -51, -29, -61}, new byte[]{-88, UnsignedBytes.MAX_POWER_OF_TWO}));
        } else if (!C28206a.m38470e().f73188d) {
            C28206a m38470e = C28206a.m38470e();
            m38470e.getClass();
            if (context != null) {
                Context applicationContext = context.getApplicationContext();
                m38470e.f73186b = applicationContext;
                m38470e.f73185a = str;
                m38470e.f73188d = true;
                C28512c.m38052a(applicationContext);
                C28532o m37993a = C28532o.m37993a();
                Context context2 = m38470e.f73186b;
                StringFogImpl stringFogImpl = C28162a.f73047a;
                m37993a.m37989a(context2, stringFogImpl.m23824a(new byte[]{-73, 19, -90, 10, -78, 60, -65, 13, -80, 12}, new byte[]{-42, 99}), stringFogImpl.m23824a(new byte[]{-32, 75, -15, 82, -27}, new byte[]{-127, 59}), str);
                if (Build.VERSION.SDK_INT >= 28 && !C28206a.f73184n.getAndSet(true)) {
                    try {
                        if (m38470e.f73186b.getPackageName() != C28207b.m38438e(m38470e.f73186b)) {
                            WebView.setDataDirectorySuffix(C28207b.m38438e(m38470e.f73186b));
                        } else {
                            WebView.setDataDirectorySuffix(m38470e.f73186b.getPackageName() + stringFogImpl.m23824a(new byte[]{-62, 104, -4, 114, -11}, new byte[]{-99, 6}));
                        }
                    } catch (Exception e) {
                        StringFogImpl stringFogImpl2 = C28162a.f73047a;
                        String m23824a = stringFogImpl2.m23824a(new byte[]{-83, -100, -84, -113, -84, -114, -95}, new byte[]{-39, -3});
                        LogUtil.m37901iv(m23824a, stringFogImpl2.m23824a(new byte[]{-74, -24, -95, -11, -95, -70, -23, -70}, new byte[]{-45, -102}) + e);
                    }
                }
                C28291a c28291a = new C28291a(m38470e.f73186b);
                m38470e.f73193i = c28291a;
                Context context3 = m38470e.f73186b;
                if (!C28218b.m38415b(context3)) {
                    C28218b.m38419a(context3, c28291a);
                    return;
                }
                C28532o m37993a2 = C28532o.m37993a();
                StringFogImpl stringFogImpl3 = C28162a.f73047a;
                m37993a2.m37991a(context3, stringFogImpl3.m23824a(new byte[]{6, -106, 19, -126, 41, -120, 23, -105, 2, -69, 21, -117, 24, -126, 31, -125, 41, -106, 19, -107, 41, -112, 31, -119, 19}, new byte[]{118, -28}), System.currentTimeMillis());
                String m23824a2 = stringFogImpl3.m23824a(new byte[]{104, 1, 105, 18, 105, 19, 100}, new byte[]{28, 96});
                LogUtil.m37901iv(m23824a2, stringFogImpl3.m23824a(new byte[]{54, -48, 59, -39, 60, -40, 117, -54, 39, -45, 117, -123, 117}, new byte[]{85, -65}) + "https://config.ssp.taxssp.com/ssp/v1/config");
                C28317f c28317f = new C28317f(C28307c.InterfaceC28310c.EnumC28311a.POST);
                c28317f.f73541a = "https://config.ssp.taxssp.com/ssp/v1/config";
                c28317f.f73545e = C28207b.m38468a();
                c28317f.f73542b = C28207b.m38457a(context3, str, (String) null);
                c28317f.f73544d = C28218b.f73277a;
                C28313e.m38241a(c28317f, 1, new C28217a(context3, c28291a));
                return;
            }
            throw new IllegalArgumentException(C28162a.f73047a.m23824a(new byte[]{95, -84, 82, -73, 89, -69, 72, -29, 81, -74, 79, -73, 28, -83, 83, -73, 28, -95, 89, -29, 82, -74, 80, -81}, new byte[]{60, -61}));
        }
    }

    public static boolean isInitialized() {
        return C28206a.m38470e().f73188d;
    }

    public static void setAppIcon(int i) {
        C28206a.m38470e().f73196l = i;
    }

    public static void setCCPADoNotSell(int i) {
        C28206a.m38470e().f73189e = i;
    }

    public static void setCOPPAIsAgeRestrictedUser(int i) {
        C28206a.m38470e().f73190f = i;
    }

    public static void setChannel(String str) {
        C28206a.m38470e().f73195k = str;
    }

    public static void setConfiguration(TaurusXAdsConfiguration taurusXAdsConfiguration) {
        C28206a.m38470e().f73187c = taurusXAdsConfiguration;
    }

    public static void setGDPRDataCollection(int i) {
        C28206a.m38470e().f73191g = i;
    }

    public static void setLGPDConsent(int i) {
        C28206a.m38470e().f73192h = i;
    }

    public static void setTestMode(boolean z) {
        C28206a.m38470e().f73194j = z;
    }

    public TaurusXAdsConfiguration getConfiguration() {
        return C28206a.m38470e().f73187c;
    }
}
