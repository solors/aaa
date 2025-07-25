package p785m5;

import android.app.Application;
import android.text.TextUtils;
import com.meevii.adsdk.common.AdUuid;
import p1007v3.AnalyzeManager;
import p696h6.PackageUtils;

/* renamed from: m5.b */
/* loaded from: classes6.dex */
public class AdInitParameter {

    /* renamed from: a */
    private Application f101009a;

    /* renamed from: b */
    private String f101010b;

    /* renamed from: c */
    private boolean f101011c;

    /* renamed from: d */
    private boolean f101012d;

    /* renamed from: e */
    private boolean f101013e;

    /* renamed from: f */
    private boolean f101014f;

    /* renamed from: g */
    private String f101015g;

    /* compiled from: AdInitParameter.java */
    /* renamed from: m5.b$b */
    /* loaded from: classes6.dex */
    public static class C38190b {

        /* renamed from: a */
        Application f101016a;

        /* renamed from: b */
        String f101017b;

        /* renamed from: c */
        boolean f101018c;

        /* renamed from: d */
        boolean f101019d;

        /* renamed from: e */
        boolean f101020e;

        /* renamed from: f */
        boolean f101021f;

        /* renamed from: g */
        String f101022g;

        public C38190b(Application application) {
            this.f101016a = application;
        }

        /* renamed from: b */
        private void m15438b() {
            if (this.f101016a != null) {
                if (!TextUtils.isEmpty(this.f101017b)) {
                    if (!TextUtils.isEmpty(this.f101022g)) {
                        boolean m23666c = PackageUtils.m23666c(this.f101016a);
                        if (m23666c && this.f101018c) {
                            throw new RuntimeException("Apk is release，But isDebug = true，the correct isDebug must be false");
                        }
                        if (m23666c && this.f101020e) {
                            throw new RuntimeException("Apk is release，But isTestMode = true，the correct isTestMode must be false");
                        }
                        return;
                    }
                    throw new NullPointerException("productionId must set, use setProductionId(String productionId)");
                }
                throw new NullPointerException("localDomainConfigPath must set, use setDefaultConfigFileName(String defaultConfigFileName)");
            }
            throw new NullPointerException("context must set, use Builder(Application context)");
        }

        /* renamed from: a */
        public AdInitParameter m15439a() {
            m15438b();
            try {
                AdUuid adUuid = AdUuid.get();
                Application application = this.f101016a;
                adUuid.setUuid(application, AnalyzeManager.m2732i(application));
            } catch (Throwable unused) {
            }
            return new AdInitParameter(this);
        }

        /* renamed from: c */
        public C38190b m15437c(boolean z) {
            this.f101018c = z;
            return this;
        }

        /* renamed from: d */
        public C38190b m15436d(String str) {
            this.f101017b = str;
            return this;
        }

        /* renamed from: e */
        public C38190b m15435e(String str) {
            this.f101022g = str;
            return this;
        }

        /* renamed from: f */
        public C38190b m15434f(boolean z) {
            this.f101019d = z;
            return this;
        }

        /* renamed from: g */
        public C38190b m15433g(boolean z) {
            this.f101021f = z;
            return this;
        }

        /* renamed from: h */
        public C38190b m15432h(boolean z) {
            this.f101020e = z;
            return this;
        }
    }

    /* renamed from: a */
    public Application m15446a() {
        return this.f101009a;
    }

    /* renamed from: b */
    public String m15445b() {
        return this.f101010b;
    }

    /* renamed from: c */
    public String m15444c() {
        return this.f101015g;
    }

    /* renamed from: d */
    public boolean m15443d() {
        return this.f101011c;
    }

    /* renamed from: e */
    public boolean m15442e() {
        return this.f101012d;
    }

    /* renamed from: f */
    public boolean m15441f() {
        return this.f101014f;
    }

    /* renamed from: g */
    public boolean m15440g() {
        return this.f101013e;
    }

    private AdInitParameter(C38190b c38190b) {
        this.f101009a = c38190b.f101016a;
        this.f101011c = c38190b.f101018c;
        this.f101012d = c38190b.f101019d;
        this.f101013e = c38190b.f101020e;
        this.f101014f = c38190b.f101021f;
        this.f101015g = c38190b.f101022g;
        this.f101010b = c38190b.f101017b;
    }
}
