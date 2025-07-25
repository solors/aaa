package com.p551my.tracker.obfuscated;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.inmobi.commons.core.configs.AdConfig;
import com.p551my.tracker.MyTracker;
import com.p551my.tracker.MyTrackerConfig;
import com.p551my.tracker.MyTrackerParams;
import com.p551my.tracker.config.AntiFraudConfig;
import com.zeus.gmc.sdk.mobileads.columbus.remote.module.util.NetWorkUtils;
import java.net.URI;

/* renamed from: com.my.tracker.obfuscated.a1 */
/* loaded from: classes7.dex */
public final class C26290a1 {

    /* renamed from: a */
    private final MyTrackerParams f68480a = new MyTrackerParams();

    /* renamed from: b */
    private String f68481b = "";

    /* renamed from: c */
    private AntiFraudConfig f68482c = AntiFraudConfig.newBuilder().build();

    /* renamed from: d */
    private volatile boolean f68483d = true;

    /* renamed from: e */
    private volatile boolean f68484e = false;

    /* renamed from: f */
    private volatile boolean f68485f = true;

    /* renamed from: g */
    private volatile boolean f68486g = true;

    /* renamed from: h */
    private volatile boolean f68487h = true;

    /* renamed from: i */
    private volatile boolean f68488i = true;

    /* renamed from: j */
    private volatile int f68489j = 30;

    /* renamed from: k */
    private volatile int f68490k = 0;

    /* renamed from: l */
    private volatile int f68491l = 900;

    /* renamed from: m */
    private volatile String f68492m = null;

    /* renamed from: n */
    private volatile String f68493n = null;

    /* renamed from: o */
    private volatile MyTrackerConfig.InstalledPackagesProvider f68494o = null;

    /* renamed from: p */
    private volatile MyTrackerConfig.OkHttpClientProvider f68495p = null;

    /* renamed from: q */
    private volatile String f68496q = m42192a("https", "tracker-api.my.com", null);

    /* renamed from: r */
    private volatile MyTracker.AttributionListener f68497r = null;

    /* renamed from: s */
    private volatile Handler f68498s = null;

    private C26290a1() {
    }

    /* renamed from: t */
    public static C26290a1 m42161t() {
        return new C26290a1();
    }

    /* renamed from: a */
    public AntiFraudConfig m42200a() {
        return this.f68482c;
    }

    /* renamed from: b */
    public String m42190b() {
        return this.f68492m;
    }

    /* renamed from: c */
    public Handler m42186c() {
        return this.f68498s;
    }

    /* renamed from: d */
    public MyTracker.AttributionListener m42182d() {
        return this.f68497r;
    }

    /* renamed from: e */
    public int m42178e() {
        return this.f68491l;
    }

    /* renamed from: f */
    public int m42176f() {
        return this.f68490k;
    }

    /* renamed from: g */
    public String m42174g() {
        return this.f68481b;
    }

    /* renamed from: h */
    public MyTrackerConfig.InstalledPackagesProvider m42173h() {
        return this.f68494o;
    }

    /* renamed from: i */
    public int m42172i() {
        return this.f68489j;
    }

    /* renamed from: j */
    public MyTrackerParams m42171j() {
        return this.f68480a;
    }

    /* renamed from: k */
    public MyTrackerConfig.OkHttpClientProvider m42170k() {
        return this.f68495p;
    }

    /* renamed from: l */
    public String m42169l() {
        return this.f68496q;
    }

    /* renamed from: m */
    public String m42168m() {
        return this.f68493n;
    }

    /* renamed from: n */
    public boolean m42167n() {
        return this.f68486g;
    }

    /* renamed from: o */
    public boolean m42166o() {
        return this.f68485f;
    }

    /* renamed from: p */
    public boolean m42165p() {
        return this.f68483d;
    }

    /* renamed from: q */
    public boolean m42164q() {
        return this.f68484e;
    }

    /* renamed from: r */
    public boolean m42163r() {
        return this.f68487h;
    }

    /* renamed from: s */
    public boolean m42162s() {
        return this.f68488i;
    }

    /* renamed from: u */
    public void m42160u() {
        this.f68493n = "com.my.games.vendorapp";
    }

    /* renamed from: a */
    private static String m42192a(String str, String str2, String str3) {
        Uri.Builder builder = new Uri.Builder();
        if (TextUtils.isEmpty(str)) {
            str = "https";
        }
        Uri.Builder encodedAuthority = builder.scheme(str).encodedAuthority(str2);
        if (!TextUtils.isEmpty(str3)) {
            encodedAuthority = encodedAuthority.encodedPath(str3);
        }
        return encodedAuthority.appendEncodedPath("v3/").toString();
    }

    /* renamed from: b */
    public void m42189b(int i) {
        if (i > 432000) {
            C26468z0.m41528a("Invalid forcingPeriod value " + i + ", forcingPeriod set to max 432000");
            this.f68490k = 432000;
            return;
        }
        if (i < 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid forcingPeriod value ");
            sb2.append(i);
            sb2.append(", forcingPeriod set to min ");
            i = 0;
            sb2.append(0);
            C26468z0.m41528a(sb2.toString());
        }
        this.f68490k = i;
    }

    /* renamed from: c */
    public void m42185c(int i) {
        StringBuilder sb2;
        String str;
        int i2 = NetWorkUtils.MAX_CACHE_AGE;
        if (i <= 7200) {
            i2 = 30;
            if (i < 30) {
                sb2 = new StringBuilder();
                sb2.append("Invalid launchTimeout value ");
                sb2.append(i);
                str = ", timeout set to min ";
            }
            this.f68489j = i;
        }
        sb2 = new StringBuilder();
        sb2.append("Invalid launchTimeout value ");
        sb2.append(i);
        str = ", timeout set to max ";
        sb2.append(str);
        sb2.append(i2);
        C26468z0.m41528a(sb2.toString());
        i = i2;
        this.f68489j = i;
    }

    /* renamed from: d */
    public void m42181d(int i) {
        m42184c(i != 0 ? i != 1 ? null : "eu.tracker-api.my.com" : "ru.tracker-api.my.com");
    }

    /* renamed from: e */
    public void m42177e(boolean z) {
        this.f68487h = z;
    }

    /* renamed from: f */
    public void m42175f(boolean z) {
        this.f68488i = z;
    }

    /* renamed from: a */
    public void m42199a(int i) {
        StringBuilder sb2;
        String str;
        int i2 = AdConfig.DEFAULT_CONTEXTUAL_DATA_EXPIRY_TIME;
        if (i <= 86400) {
            i2 = 1;
            if (i < 1) {
                sb2 = new StringBuilder();
                sb2.append("Invalid bufferingPeriod value ");
                sb2.append(i);
                str = ", bufferingPeriod set to min ";
            }
            this.f68491l = i;
        }
        sb2 = new StringBuilder();
        sb2.append("Invalid bufferingPeriod value ");
        sb2.append(i);
        str = ", bufferingPeriod set to max ";
        sb2.append(str);
        sb2.append(i2);
        C26468z0.m41528a(sb2.toString());
        i = i2;
        this.f68491l = i;
    }

    /* renamed from: b */
    public void m42188b(String str) {
        this.f68481b = str;
    }

    /* renamed from: c */
    public void m42184c(String str) {
        URI uri;
        try {
            if (TextUtils.isEmpty(str)) {
                this.f68496q = m42192a("https", "tracker-api.my.com", null);
                return;
            }
            if (str.contains("://")) {
                uri = new URI(str);
            } else {
                uri = new URI(DtbConstants.HTTPS + str);
            }
            this.f68496q = m42192a(uri.getScheme(), uri.getAuthority(), uri.getPath());
            C26468z0.m41528a("set tracker url to " + this.f68496q);
        } catch (Throwable unused) {
            this.f68496q = m42192a("https", "tracker-api.my.com", null);
            C26468z0.m41525b("unable to set invalid url " + this.f68496q + ", using default");
        }
    }

    /* renamed from: d */
    public void m42180d(String str) {
        this.f68493n = str;
    }

    /* renamed from: a */
    public void m42198a(MyTracker.AttributionListener attributionListener, Handler handler) {
        this.f68497r = attributionListener;
        this.f68498s = handler;
    }

    /* renamed from: b */
    public void m42187b(boolean z) {
        this.f68485f = z;
    }

    /* renamed from: c */
    public void m42183c(boolean z) {
        this.f68483d = z;
    }

    /* renamed from: d */
    public void m42179d(boolean z) {
        this.f68484e = z;
    }

    /* renamed from: a */
    public void m42197a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider) {
        this.f68494o = installedPackagesProvider;
    }

    /* renamed from: a */
    public void m42196a(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        this.f68495p = okHttpClientProvider;
    }

    /* renamed from: a */
    public void m42195a(AntiFraudConfig antiFraudConfig) {
        this.f68482c = antiFraudConfig;
    }

    /* renamed from: a */
    public void m42194a(C26405s0 c26405s0) {
        c26405s0.m41686c(this.f68481b);
        this.f68480a.putDataToBuilder(c26405s0);
        int i = this.f68489j;
        if (i != 30) {
            c26405s0.m41688c(i);
        }
        int i2 = this.f68491l;
        if (i2 != 900) {
            c26405s0.m41718a(i2);
        }
        int i3 = this.f68490k;
        if (i3 != 0) {
            c26405s0.m41698b(i3);
        }
        if (!this.f68484e) {
            c26405s0.m41655l();
        }
        if (!this.f68483d) {
            c26405s0.m41658k();
        }
        if (!this.f68485f) {
            c26405s0.m41661j();
        }
        if (!this.f68486g) {
            c26405s0.m41700b();
        }
        if (!this.f68487h) {
            c26405s0.m41675f();
        }
        if (!this.f68488i) {
            c26405s0.m41671g();
        }
        if (!this.f68482c.useLightSensor) {
            c26405s0.m41684d();
        }
        if (!this.f68482c.useMagneticFieldSensor) {
            c26405s0.m41679e();
        }
        if (!this.f68482c.useGyroscope) {
            c26405s0.m41690c();
        }
        if (!this.f68482c.usePressureSensor) {
            c26405s0.m41667h();
        }
        if (this.f68482c.useProximitySensor) {
            return;
        }
        c26405s0.m41664i();
    }

    /* renamed from: a */
    public void m42193a(String str) {
        this.f68492m = str;
    }

    /* renamed from: a */
    public void m42191a(boolean z) {
        this.f68486g = z;
    }
}
