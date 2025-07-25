package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.cache.C14272i;
import com.fyber.inneractive.sdk.config.cellular.C14336a;
import com.fyber.inneractive.sdk.config.global.C14348a;
import com.fyber.inneractive.sdk.config.global.C14388r;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.ignite.C14563h;
import com.fyber.inneractive.sdk.measurement.C14586e;
import com.fyber.inneractive.sdk.network.C14678L;
import com.fyber.inneractive.sdk.network.C14687V;
import com.fyber.inneractive.sdk.network.C14702f;
import com.fyber.inneractive.sdk.p374dv.handler.AbstractC14434a;
import com.fyber.inneractive.sdk.p374dv.handler.C14438e;
import com.fyber.inneractive.sdk.p374dv.handler.C14439f;
import com.fyber.inneractive.sdk.topics.C15399b;
import com.fyber.inneractive.sdk.util.AbstractC15459m;
import com.fyber.inneractive.sdk.util.AbstractC15465p;
import com.fyber.inneractive.sdk.util.C15432X;
import com.fyber.inneractive.sdk.util.C15472s0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.RunnableC15455k;
import com.fyber.inneractive.sdk.web.C15518c0;
import com.fyber.inneractive.sdk.web.RunnableC15516b0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class IAConfigManager {

    /* renamed from: P */
    public static long f27061P;

    /* renamed from: A */
    public final C15432X f27063A;

    /* renamed from: B */
    public C14687V f27064B;

    /* renamed from: C */
    public C14687V f27065C;

    /* renamed from: D */
    public C14347g f27066D;

    /* renamed from: E */
    public final C14563h f27067E;

    /* renamed from: F */
    public final C15399b f27068F;

    /* renamed from: G */
    public final AbstractC14434a f27069G;

    /* renamed from: H */
    public final C14272i f27070H;

    /* renamed from: I */
    public final C14702f f27071I;

    /* renamed from: J */
    public final HashMap f27072J;

    /* renamed from: K */
    public C14586e f27073K;

    /* renamed from: L */
    public WebView f27074L;

    /* renamed from: M */
    public final C14388r f27075M;

    /* renamed from: N */
    public C14336a f27076N;

    /* renamed from: a */
    public HashMap f27077a = new HashMap();

    /* renamed from: b */
    public HashMap f27078b = new HashMap();

    /* renamed from: c */
    public String f27079c;

    /* renamed from: d */
    public String f27080d;

    /* renamed from: e */
    public String f27081e;

    /* renamed from: f */
    public Context f27082f;

    /* renamed from: g */
    public final CopyOnWriteArrayList f27083g;

    /* renamed from: h */
    public boolean f27084h;

    /* renamed from: i */
    public final C14319L f27085i;

    /* renamed from: j */
    public InneractiveUserConfig f27086j;

    /* renamed from: k */
    public boolean f27087k;

    /* renamed from: l */
    public String f27088l;

    /* renamed from: m */
    public InneractiveMediationName f27089m;

    /* renamed from: n */
    public String f27090n;

    /* renamed from: o */
    public String f27091o;

    /* renamed from: p */
    public ArrayList f27092p;

    /* renamed from: q */
    public boolean f27093q;

    /* renamed from: r */
    public String f27094r;

    /* renamed from: s */
    public final C14678L f27095s;

    /* renamed from: t */
    public String f27096t;

    /* renamed from: u */
    public C14411s f27097u;

    /* renamed from: v */
    public C14390i f27098v;

    /* renamed from: w */
    public C14412t f27099w;

    /* renamed from: x */
    public final C14332Z f27100x;

    /* renamed from: y */
    public C15472s0 f27101y;

    /* renamed from: z */
    public C14348a f27102z;

    /* renamed from: O */
    public static final IAConfigManager f27060O = new IAConfigManager();

    /* renamed from: Q */
    public static final RunnableC14315H f27062Q = new RunnableC14315H();

    /* loaded from: classes4.dex */
    public interface OnConfigurationReadyAndValidListener {
        void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc);
    }

    public IAConfigManager() {
        AbstractC14434a c14438e;
        new HashSet();
        this.f27084h = false;
        this.f27085i = new C14319L();
        this.f27087k = false;
        this.f27093q = false;
        this.f27095s = new C14678L();
        this.f27096t = "";
        this.f27100x = new C14332Z();
        this.f27063A = new C15432X();
        this.f27067E = new C14563h();
        this.f27068F = new C15399b();
        String[] strArr = {"com.google.android.gms.ads.MobileAds", "com.google.android.gms.ads.query.QueryInfoGenerationCallback"};
        for (int i = 0; i < 2; i++) {
            try {
                Class.forName(strArr[i]);
            } catch (ClassNotFoundException unused) {
                c14438e = new C14439f();
            }
        }
        c14438e = new C14438e();
        this.f27069G = c14438e;
        this.f27070H = new C14272i();
        this.f27071I = new C14702f();
        this.f27072J = new HashMap();
        this.f27075M = C14388r.m77929a();
        this.f27083g = new CopyOnWriteArrayList();
    }

    public static void addListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        f27060O.f27083g.add(onConfigurationReadyAndValidListener);
    }

    /* renamed from: b */
    public static void m77995b() {
        C14411s c14411s;
        C14396o c14396o;
        boolean z;
        C15399b c15399b;
        IAConfigManager iAConfigManager = f27060O;
        iAConfigManager.getClass();
        if (!iAConfigManager.f27068F.f30508i.get() && (c14411s = iAConfigManager.f27097u) != null && (c14396o = c14411s.f27275b) != null) {
            int m77919a = c14396o.m77919a("topics_enabled", 0, 0);
            int m77919a2 = iAConfigManager.f27097u.f27275b.m77919a("e_topics_enabled", 0, 0);
            if (m77919a == 0 && m77919a2 == 0) {
                IAlog.m76529a("Topics API feature disabled - topics_enabled & e_topics_enabled flags are 0", new Object[0]);
                return;
            }
            boolean z2 = true;
            if (m77919a != 0) {
                z = true;
            } else {
                z = false;
            }
            if (m77919a2 == 0) {
                z2 = false;
            }
            try {
                if (m77991f() && (c15399b = iAConfigManager.f27068F) != null) {
                    c15399b.m76549a(z, z2);
                    iAConfigManager.f27068F.m76547c();
                }
            } catch (Throwable th) {
                IAlog.m76530a("error while trying to init topics ", th, new Object[0]);
            }
        }
    }

    /* renamed from: c */
    public static boolean m77994c() {
        if (Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(1000000) >= 11 && AbstractC15459m.m76485a("android.permission.ACCESS_ADSERVICES_TOPICS")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m77993d() {
        C14347g c14347g = f27060O.f27066D;
        if (c14347g != null && c14347g.m77961e()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m77992e() {
        boolean z;
        IAConfigManager iAConfigManager = f27060O;
        if (iAConfigManager.f27081e != null) {
            z = true;
        } else {
            z = false;
        }
        int i = AbstractC14392k.f27223a;
        boolean booleanValue = Boolean.valueOf(System.getProperty("ia.testEnvironmentConfiguration.forceConfigRefresh", Boolean.toString(false))).booleanValue();
        if ((z && System.currentTimeMillis() - f27061P > 3600000) || booleanValue) {
            if (booleanValue) {
                C14411s c14411s = iAConfigManager.f27097u;
                c14411s.f27277d = false;
                AbstractC15465p.f30611a.execute(new RunnableC15455k(c14411s.f27278e));
            }
            m77997a();
            C15518c0 c15518c0 = C15518c0.f30735c;
            c15518c0.getClass();
            AbstractC15465p.f30611a.execute(new RunnableC15516b0(c15518c0));
        }
        return z;
    }

    /* renamed from: f */
    public static boolean m77991f() {
        if (Build.VERSION.SDK_INT >= 31 && SdkExtensions.getExtensionVersion(1000000) >= 4 && AbstractC15459m.m76485a("android.permission.ACCESS_ADSERVICES_TOPICS")) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static void m77990g() {
        SharedPreferences sharedPreferences = AbstractC15459m.f30607a.getSharedPreferences("IAConfigurationPreferences", 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean("IAConfigFQE", true).apply();
        }
    }

    public static void removeListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        f27060O.f27083g.remove(onConfigurationReadyAndValidListener);
    }

    /* renamed from: a */
    public final void m77996a(Exception exc) {
        Iterator it = this.f27083g.iterator();
        while (it.hasNext()) {
            OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener = (OnConfigurationReadyAndValidListener) it.next();
            if (onConfigurationReadyAndValidListener != null) {
                boolean z = f27060O.f27081e != null;
                IAlog.m76525e("notifying listener configuration state has been resolved", new Object[0]);
                onConfigurationReadyAndValidListener.onConfigurationReadyAndValid(this, z, !z ? exc : null);
            }
        }
    }

    /* renamed from: a */
    public static void m77997a() {
        IAConfigManager iAConfigManager = f27060O;
        C14687V c14687v = iAConfigManager.f27064B;
        if (c14687v != null) {
            iAConfigManager.f27095s.m77724b(c14687v);
        }
        C14411s c14411s = iAConfigManager.f27097u;
        if (c14411s.f27277d) {
            return;
        }
        iAConfigManager.f27095s.m77724b(new C14687V(new C14397p(c14411s), c14411s.f27274a, c14411s.f27278e));
    }
}
