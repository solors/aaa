package p039c4;

import android.content.Context;
import android.text.TextUtils;
import p753k4.C37387d;

/* renamed from: c4.a */
/* loaded from: classes6.dex */
public class GrtInitParameter {

    /* renamed from: a */
    private Context f1852a;

    /* renamed from: b */
    private String f1853b;

    /* renamed from: c */
    private long f1854c;

    /* renamed from: d */
    private boolean f1855d;

    /* renamed from: e */
    private boolean f1856e;

    /* compiled from: GrtInitParameter.java */
    /* renamed from: c4.a$b */
    /* loaded from: classes6.dex */
    public static class C3420b {

        /* renamed from: a */
        private Context f1857a;

        /* renamed from: b */
        private String f1858b;

        /* renamed from: c */
        private long f1859c;

        /* renamed from: d */
        private boolean f1860d;

        /* renamed from: e */
        private boolean f1861e;

        public C3420b(Context context) {
            this.f1857a = context;
        }

        /* renamed from: f */
        public GrtInitParameter m103671f() {
            if (this.f1857a != null) {
                if (!TextUtils.isEmpty(this.f1858b)) {
                    if (this.f1859c > 0) {
                        if (C37387d.m18213b(this.f1857a) && this.f1861e) {
                            throw new RuntimeException("Apk is release，But isDebug = true，the correct isDebug must be false");
                        }
                        return new GrtInitParameter(this);
                    }
                    throw new NullPointerException("installTime must set, use setInstallTime(long installTime)");
                }
                throw new IllegalArgumentException("productionId must set, use setProductionId(String productionId)");
            }
            throw new NullPointerException("context must set, use Builder(Context context)");
        }

        /* renamed from: g */
        public C3420b m103670g(boolean z) {
            this.f1861e = z;
            return this;
        }

        /* renamed from: h */
        public C3420b m103669h(long j) {
            this.f1859c = j;
            return this;
        }

        /* renamed from: i */
        public C3420b m103668i(String str) {
            this.f1858b = str;
            return this;
        }

        /* renamed from: j */
        public C3420b m103667j(boolean z) {
            this.f1860d = z;
            return this;
        }
    }

    /* renamed from: a */
    public Context m103681a() {
        return this.f1852a;
    }

    /* renamed from: b */
    public long m103680b() {
        return this.f1854c;
    }

    /* renamed from: c */
    public String m103679c() {
        return this.f1853b;
    }

    /* renamed from: d */
    public boolean m103678d() {
        return this.f1856e;
    }

    /* renamed from: e */
    public boolean m103677e() {
        return this.f1855d;
    }

    private GrtInitParameter(C3420b c3420b) {
        this.f1852a = c3420b.f1857a;
        this.f1853b = c3420b.f1858b;
        this.f1854c = c3420b.f1859c;
        this.f1855d = c3420b.f1860d;
        this.f1856e = c3420b.f1861e;
    }
}
